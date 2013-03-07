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
import modelo.ExameClinico;
import modelo.Paciente;

/**
 *
 * @author Carlos
 */
public class ExameClinicoJpaController implements Serializable {

    public ExameClinicoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(ExameClinico exameClinico) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Paciente codPacienteExame = exameClinico.getCodPacienteExame();
            if (codPacienteExame != null) {
                codPacienteExame = em.getReference(codPacienteExame.getClass(), codPacienteExame.getId());
                exameClinico.setCodPacienteExame(codPacienteExame);
            }
            em.persist(exameClinico);
            if (codPacienteExame != null) {
                codPacienteExame.getExameClinicoList().add(exameClinico);
                codPacienteExame = em.merge(codPacienteExame);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findExameClinico(exameClinico.getId()) != null) {
                throw new PreexistingEntityException("ExameClinico " + exameClinico + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(ExameClinico exameClinico) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            ExameClinico persistentExameClinico = em.find(ExameClinico.class, exameClinico.getId());
            Paciente codPacienteExameOld = persistentExameClinico.getCodPacienteExame();
            Paciente codPacienteExameNew = exameClinico.getCodPacienteExame();
            if (codPacienteExameNew != null) {
                codPacienteExameNew = em.getReference(codPacienteExameNew.getClass(), codPacienteExameNew.getId());
                exameClinico.setCodPacienteExame(codPacienteExameNew);
            }
            exameClinico = em.merge(exameClinico);
            if (codPacienteExameOld != null && !codPacienteExameOld.equals(codPacienteExameNew)) {
                codPacienteExameOld.getExameClinicoList().remove(exameClinico);
                codPacienteExameOld = em.merge(codPacienteExameOld);
            }
            if (codPacienteExameNew != null && !codPacienteExameNew.equals(codPacienteExameOld)) {
                codPacienteExameNew.getExameClinicoList().add(exameClinico);
                codPacienteExameNew = em.merge(codPacienteExameNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = exameClinico.getId();
                if (findExameClinico(id) == null) {
                    throw new NonexistentEntityException("The exameClinico with id " + id + " no longer exists.");
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
            ExameClinico exameClinico;
            try {
                exameClinico = em.getReference(ExameClinico.class, id);
                exameClinico.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The exameClinico with id " + id + " no longer exists.", enfe);
            }
            Paciente codPacienteExame = exameClinico.getCodPacienteExame();
            if (codPacienteExame != null) {
                codPacienteExame.getExameClinicoList().remove(exameClinico);
                codPacienteExame = em.merge(codPacienteExame);
            }
            em.remove(exameClinico);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<ExameClinico> findExameClinicoEntities() {
        return findExameClinicoEntities(true, -1, -1);
    }

    public List<ExameClinico> findExameClinicoEntities(int maxResults, int firstResult) {
        return findExameClinicoEntities(false, maxResults, firstResult);
    }

    private List<ExameClinico> findExameClinicoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(ExameClinico.class));
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

    public ExameClinico findExameClinico(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(ExameClinico.class, id);
        } finally {
            em.close();
        }
    }

    public int getExameClinicoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<ExameClinico> rt = cq.from(ExameClinico.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
