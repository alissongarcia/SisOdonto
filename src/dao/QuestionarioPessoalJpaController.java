/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.exceptions.NonexistentEntityException;
import dao.exceptions.PreexistingEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import modelo.Paciente;
import modelo.QuestionarioPessoal;

/**
 *
 * @author alisson
 */
public class QuestionarioPessoalJpaController implements Serializable {

    public QuestionarioPessoalJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(QuestionarioPessoal questionarioPessoal) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Paciente codPaciente = questionarioPessoal.getCodPaciente();
            if (codPaciente != null) {
                codPaciente = em.getReference(codPaciente.getClass(), codPaciente.getId());
                questionarioPessoal.setCodPaciente(codPaciente);
            }
            em.persist(questionarioPessoal);
            if (codPaciente != null) {
                codPaciente.getQuestionarioPessoalList().add(questionarioPessoal);
                codPaciente = em.merge(codPaciente);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findQuestionarioPessoal(questionarioPessoal.getId()) != null) {
                throw new PreexistingEntityException("QuestionarioPessoal " + questionarioPessoal + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(QuestionarioPessoal questionarioPessoal) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            QuestionarioPessoal persistentQuestionarioPessoal = em.find(QuestionarioPessoal.class, questionarioPessoal.getId());
            Paciente codPacienteOld = persistentQuestionarioPessoal.getCodPaciente();
            Paciente codPacienteNew = questionarioPessoal.getCodPaciente();
            if (codPacienteNew != null) {
                codPacienteNew = em.getReference(codPacienteNew.getClass(), codPacienteNew.getId());
                questionarioPessoal.setCodPaciente(codPacienteNew);
            }
            questionarioPessoal = em.merge(questionarioPessoal);
            if (codPacienteOld != null && !codPacienteOld.equals(codPacienteNew)) {
                codPacienteOld.getQuestionarioPessoalList().remove(questionarioPessoal);
                codPacienteOld = em.merge(codPacienteOld);
            }
            if (codPacienteNew != null && !codPacienteNew.equals(codPacienteOld)) {
                codPacienteNew.getQuestionarioPessoalList().add(questionarioPessoal);
                codPacienteNew = em.merge(codPacienteNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = questionarioPessoal.getId();
                if (findQuestionarioPessoal(id) == null) {
                    throw new NonexistentEntityException("The questionarioPessoal with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            QuestionarioPessoal questionarioPessoal;
            try {
                questionarioPessoal = em.getReference(QuestionarioPessoal.class, id);
                questionarioPessoal.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The questionarioPessoal with id " + id + " no longer exists.", enfe);
            }
            Paciente codPaciente = questionarioPessoal.getCodPaciente();
            if (codPaciente != null) {
                codPaciente.getQuestionarioPessoalList().remove(questionarioPessoal);
                codPaciente = em.merge(codPaciente);
            }
            em.remove(questionarioPessoal);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<QuestionarioPessoal> findQuestionarioPessoalEntities() {
        return findQuestionarioPessoalEntities(true, -1, -1);
    }

    public List<QuestionarioPessoal> findQuestionarioPessoalEntities(int maxResults, int firstResult) {
        return findQuestionarioPessoalEntities(false, maxResults, firstResult);
    }

    private List<QuestionarioPessoal> findQuestionarioPessoalEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(QuestionarioPessoal.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public QuestionarioPessoal findQuestionarioPessoal(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(QuestionarioPessoal.class, id);
        } finally {
            em.close();
        }
    }

    public int getQuestionarioPessoalCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<QuestionarioPessoal> rt = cq.from(QuestionarioPessoal.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    /**Método para consulta através de uma query
     
     * Como resultado obtem-se um QuestionárioPessoal de um determinado Paciente 

     * @author Alisson Garcia

     * @param  codPaciente Integer - Id do Paciente o qual quero obter o QuestionarioPessoal.

     * @return QuestionarioPessoal - Questionário com informações relacionadas a um Paciente
     */
    public QuestionarioPessoal buscarCampos(Integer codPaciente){
        EntityManager em = null;
        em = getEntityManager();
        //QuestionarioPessoal quest = new QuestionarioPessoal();
        Query consulta;
        
        consulta = em.createQuery("SELECT q FROM QuestionarioPessoal q WHERE q.codPaciente.id = :codPaciente");
        //consulta = em.createQuery("SELECT q FROM QuestionarioPessoal q, Paciente p WHERE q.id = p.cod_quest_pessoal");
        consulta.setParameter("codPaciente", codPaciente);
        return (QuestionarioPessoal)consulta.getSingleResult();
        
    }
    
}
