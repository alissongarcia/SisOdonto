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
import modelo.Diagnostico;
import modelo.Paciente;

/**
 *
 * @author alisson
 */
public class DiagnosticoJpaController implements Serializable {

    public DiagnosticoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Diagnostico diagnostico) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Paciente codPacienteDiag = diagnostico.getCodPacienteDiag();
            if (codPacienteDiag != null) {
                codPacienteDiag = em.getReference(codPacienteDiag.getClass(), codPacienteDiag.getId());
                diagnostico.setCodPacienteDiag(codPacienteDiag);
            }
            em.persist(diagnostico);
            if (codPacienteDiag != null) {
                codPacienteDiag.getDiagnosticoList().add(diagnostico);
                codPacienteDiag = em.merge(codPacienteDiag);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findDiagnostico(diagnostico.getId()) != null) {
                throw new PreexistingEntityException("Diagnostico " + diagnostico + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Diagnostico diagnostico) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Diagnostico persistentDiagnostico = em.find(Diagnostico.class, diagnostico.getId());
            Paciente codPacienteDiagOld = persistentDiagnostico.getCodPacienteDiag();
            Paciente codPacienteDiagNew = diagnostico.getCodPacienteDiag();
            if (codPacienteDiagNew != null) {
                codPacienteDiagNew = em.getReference(codPacienteDiagNew.getClass(), codPacienteDiagNew.getId());
                diagnostico.setCodPacienteDiag(codPacienteDiagNew);
            }
            diagnostico = em.merge(diagnostico);
            if (codPacienteDiagOld != null && !codPacienteDiagOld.equals(codPacienteDiagNew)) {
                codPacienteDiagOld.getDiagnosticoList().remove(diagnostico);
                codPacienteDiagOld = em.merge(codPacienteDiagOld);
            }
            if (codPacienteDiagNew != null && !codPacienteDiagNew.equals(codPacienteDiagOld)) {
                codPacienteDiagNew.getDiagnosticoList().add(diagnostico);
                codPacienteDiagNew = em.merge(codPacienteDiagNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = diagnostico.getId();
                if (findDiagnostico(id) == null) {
                    throw new NonexistentEntityException("The diagnostico with id " + id + " no longer exists.");
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
            Diagnostico diagnostico;
            try {
                diagnostico = em.getReference(Diagnostico.class, id);
                diagnostico.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The diagnostico with id " + id + " no longer exists.", enfe);
            }
            Paciente codPacienteDiag = diagnostico.getCodPacienteDiag();
            if (codPacienteDiag != null) {
                codPacienteDiag.getDiagnosticoList().remove(diagnostico);
                codPacienteDiag = em.merge(codPacienteDiag);
            }
            em.remove(diagnostico);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Diagnostico> findDiagnosticoEntities() {
        return findDiagnosticoEntities(true, -1, -1);
    }

    public List<Diagnostico> findDiagnosticoEntities(int maxResults, int firstResult) {
        return findDiagnosticoEntities(false, maxResults, firstResult);
    }

    private List<Diagnostico> findDiagnosticoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Diagnostico.class));
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

    public Diagnostico findDiagnostico(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Diagnostico.class, id);
        } finally {
            em.close();
        }
    }

    public int getDiagnosticoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Diagnostico> rt = cq.from(Diagnostico.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
