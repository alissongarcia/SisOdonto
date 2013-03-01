/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.exceptions.NonexistentEntityException;
import dao.exceptions.PreexistingEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import modelo.Paciente;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
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
        if (questionarioPessoal.getPacienteList() == null) {
            questionarioPessoal.setPacienteList(new ArrayList<Paciente>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Paciente> attachedPacienteList = new ArrayList<Paciente>();
            for (Paciente pacienteListPacienteToAttach : questionarioPessoal.getPacienteList()) {
                pacienteListPacienteToAttach = em.getReference(pacienteListPacienteToAttach.getClass(), pacienteListPacienteToAttach.getId());
                attachedPacienteList.add(pacienteListPacienteToAttach);
            }
            questionarioPessoal.setPacienteList(attachedPacienteList);
            em.persist(questionarioPessoal);
            for (Paciente pacienteListPaciente : questionarioPessoal.getPacienteList()) {
                QuestionarioPessoal oldCodQuestPessoalOfPacienteListPaciente = pacienteListPaciente.getCodQuestPessoal();
                pacienteListPaciente.setCodQuestPessoal(questionarioPessoal);
                pacienteListPaciente = em.merge(pacienteListPaciente);
                if (oldCodQuestPessoalOfPacienteListPaciente != null) {
                    oldCodQuestPessoalOfPacienteListPaciente.getPacienteList().remove(pacienteListPaciente);
                    oldCodQuestPessoalOfPacienteListPaciente = em.merge(oldCodQuestPessoalOfPacienteListPaciente);
                }
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
            List<Paciente> pacienteListOld = persistentQuestionarioPessoal.getPacienteList();
            List<Paciente> pacienteListNew = questionarioPessoal.getPacienteList();
            List<Paciente> attachedPacienteListNew = new ArrayList<Paciente>();
            for (Paciente pacienteListNewPacienteToAttach : pacienteListNew) {
                pacienteListNewPacienteToAttach = em.getReference(pacienteListNewPacienteToAttach.getClass(), pacienteListNewPacienteToAttach.getId());
                attachedPacienteListNew.add(pacienteListNewPacienteToAttach);
            }
            pacienteListNew = attachedPacienteListNew;
            questionarioPessoal.setPacienteList(pacienteListNew);
            questionarioPessoal = em.merge(questionarioPessoal);
            for (Paciente pacienteListOldPaciente : pacienteListOld) {
                if (!pacienteListNew.contains(pacienteListOldPaciente)) {
                    pacienteListOldPaciente.setCodQuestPessoal(null);
                    pacienteListOldPaciente = em.merge(pacienteListOldPaciente);
                }
            }
            for (Paciente pacienteListNewPaciente : pacienteListNew) {
                if (!pacienteListOld.contains(pacienteListNewPaciente)) {
                    QuestionarioPessoal oldCodQuestPessoalOfPacienteListNewPaciente = pacienteListNewPaciente.getCodQuestPessoal();
                    pacienteListNewPaciente.setCodQuestPessoal(questionarioPessoal);
                    pacienteListNewPaciente = em.merge(pacienteListNewPaciente);
                    if (oldCodQuestPessoalOfPacienteListNewPaciente != null && !oldCodQuestPessoalOfPacienteListNewPaciente.equals(questionarioPessoal)) {
                        oldCodQuestPessoalOfPacienteListNewPaciente.getPacienteList().remove(pacienteListNewPaciente);
                        oldCodQuestPessoalOfPacienteListNewPaciente = em.merge(oldCodQuestPessoalOfPacienteListNewPaciente);
                    }
                }
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
            List<Paciente> pacienteList = questionarioPessoal.getPacienteList();
            for (Paciente pacienteListPaciente : pacienteList) {
                pacienteListPaciente.setCodQuestPessoal(null);
                pacienteListPaciente = em.merge(pacienteListPaciente);
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
    
}
