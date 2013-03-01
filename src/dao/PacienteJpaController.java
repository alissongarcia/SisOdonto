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
import modelo.QuestionarioPessoal;
import modelo.ExameClinico;
import modelo.Diagnostico;
import modelo.Paciente;

/**
 *
 * @author alisson
 */
public class PacienteJpaController implements Serializable {

    public PacienteJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Paciente paciente) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            QuestionarioPessoal codQuestPessoal = paciente.getCodQuestPessoal();
            if (codQuestPessoal != null) {
                codQuestPessoal = em.getReference(codQuestPessoal.getClass(), codQuestPessoal.getId());
                paciente.setCodQuestPessoal(codQuestPessoal);
            }
            ExameClinico codExameClinico = paciente.getCodExameClinico();
            if (codExameClinico != null) {
                codExameClinico = em.getReference(codExameClinico.getClass(), codExameClinico.getId());
                paciente.setCodExameClinico(codExameClinico);
            }
            Diagnostico codDiagnostico = paciente.getCodDiagnostico();
            if (codDiagnostico != null) {
                codDiagnostico = em.getReference(codDiagnostico.getClass(), codDiagnostico.getId());
                paciente.setCodDiagnostico(codDiagnostico);
            }
            em.persist(paciente);
            if (codQuestPessoal != null) {
                codQuestPessoal.getPacienteList().add(paciente);
                codQuestPessoal = em.merge(codQuestPessoal);
            }
            if (codExameClinico != null) {
                codExameClinico.getPacienteList().add(paciente);
                codExameClinico = em.merge(codExameClinico);
            }
            if (codDiagnostico != null) {
                codDiagnostico.getPacienteList().add(paciente);
                codDiagnostico = em.merge(codDiagnostico);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findPaciente(paciente.getId()) != null) {
                throw new PreexistingEntityException("Paciente " + paciente + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Paciente paciente) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Paciente persistentPaciente = em.find(Paciente.class, paciente.getId());
            QuestionarioPessoal codQuestPessoalOld = persistentPaciente.getCodQuestPessoal();
            QuestionarioPessoal codQuestPessoalNew = paciente.getCodQuestPessoal();
            ExameClinico codExameClinicoOld = persistentPaciente.getCodExameClinico();
            ExameClinico codExameClinicoNew = paciente.getCodExameClinico();
            Diagnostico codDiagnosticoOld = persistentPaciente.getCodDiagnostico();
            Diagnostico codDiagnosticoNew = paciente.getCodDiagnostico();
            if (codQuestPessoalNew != null) {
                codQuestPessoalNew = em.getReference(codQuestPessoalNew.getClass(), codQuestPessoalNew.getId());
                paciente.setCodQuestPessoal(codQuestPessoalNew);
            }
            if (codExameClinicoNew != null) {
                codExameClinicoNew = em.getReference(codExameClinicoNew.getClass(), codExameClinicoNew.getId());
                paciente.setCodExameClinico(codExameClinicoNew);
            }
            if (codDiagnosticoNew != null) {
                codDiagnosticoNew = em.getReference(codDiagnosticoNew.getClass(), codDiagnosticoNew.getId());
                paciente.setCodDiagnostico(codDiagnosticoNew);
            }
            paciente = em.merge(paciente);
            if (codQuestPessoalOld != null && !codQuestPessoalOld.equals(codQuestPessoalNew)) {
                codQuestPessoalOld.getPacienteList().remove(paciente);
                codQuestPessoalOld = em.merge(codQuestPessoalOld);
            }
            if (codQuestPessoalNew != null && !codQuestPessoalNew.equals(codQuestPessoalOld)) {
                codQuestPessoalNew.getPacienteList().add(paciente);
                codQuestPessoalNew = em.merge(codQuestPessoalNew);
            }
            if (codExameClinicoOld != null && !codExameClinicoOld.equals(codExameClinicoNew)) {
                codExameClinicoOld.getPacienteList().remove(paciente);
                codExameClinicoOld = em.merge(codExameClinicoOld);
            }
            if (codExameClinicoNew != null && !codExameClinicoNew.equals(codExameClinicoOld)) {
                codExameClinicoNew.getPacienteList().add(paciente);
                codExameClinicoNew = em.merge(codExameClinicoNew);
            }
            if (codDiagnosticoOld != null && !codDiagnosticoOld.equals(codDiagnosticoNew)) {
                codDiagnosticoOld.getPacienteList().remove(paciente);
                codDiagnosticoOld = em.merge(codDiagnosticoOld);
            }
            if (codDiagnosticoNew != null && !codDiagnosticoNew.equals(codDiagnosticoOld)) {
                codDiagnosticoNew.getPacienteList().add(paciente);
                codDiagnosticoNew = em.merge(codDiagnosticoNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = paciente.getId();
                if (findPaciente(id) == null) {
                    throw new NonexistentEntityException("The paciente with id " + id + " no longer exists.");
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
            Paciente paciente;
            try {
                paciente = em.getReference(Paciente.class, id);
                paciente.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The paciente with id " + id + " no longer exists.", enfe);
            }
            QuestionarioPessoal codQuestPessoal = paciente.getCodQuestPessoal();
            if (codQuestPessoal != null) {
                codQuestPessoal.getPacienteList().remove(paciente);
                codQuestPessoal = em.merge(codQuestPessoal);
            }
            ExameClinico codExameClinico = paciente.getCodExameClinico();
            if (codExameClinico != null) {
                codExameClinico.getPacienteList().remove(paciente);
                codExameClinico = em.merge(codExameClinico);
            }
            Diagnostico codDiagnostico = paciente.getCodDiagnostico();
            if (codDiagnostico != null) {
                codDiagnostico.getPacienteList().remove(paciente);
                codDiagnostico = em.merge(codDiagnostico);
            }
            em.remove(paciente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Paciente> findPacienteEntities() {
        return findPacienteEntities(true, -1, -1);
    }

    public List<Paciente> findPacienteEntities(int maxResults, int firstResult) {
        return findPacienteEntities(false, maxResults, firstResult);
    }

    private List<Paciente> findPacienteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Paciente.class));
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

    public Paciente findPaciente(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Paciente.class, id);
        } finally {
            em.close();
        }
    }

    public int getPacienteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Paciente> rt = cq.from(Paciente.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
