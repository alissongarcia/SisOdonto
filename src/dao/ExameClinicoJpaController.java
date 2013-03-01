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
import modelo.ExameClinico;

/**
 *
 * @author alisson
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
        if (exameClinico.getPacienteList() == null) {
            exameClinico.setPacienteList(new ArrayList<Paciente>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Paciente> attachedPacienteList = new ArrayList<Paciente>();
            for (Paciente pacienteListPacienteToAttach : exameClinico.getPacienteList()) {
                pacienteListPacienteToAttach = em.getReference(pacienteListPacienteToAttach.getClass(), pacienteListPacienteToAttach.getId());
                attachedPacienteList.add(pacienteListPacienteToAttach);
            }
            exameClinico.setPacienteList(attachedPacienteList);
            em.persist(exameClinico);
            for (Paciente pacienteListPaciente : exameClinico.getPacienteList()) {
                ExameClinico oldCodExameClinicoOfPacienteListPaciente = pacienteListPaciente.getCodExameClinico();
                pacienteListPaciente.setCodExameClinico(exameClinico);
                pacienteListPaciente = em.merge(pacienteListPaciente);
                if (oldCodExameClinicoOfPacienteListPaciente != null) {
                    oldCodExameClinicoOfPacienteListPaciente.getPacienteList().remove(pacienteListPaciente);
                    oldCodExameClinicoOfPacienteListPaciente = em.merge(oldCodExameClinicoOfPacienteListPaciente);
                }
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
            List<Paciente> pacienteListOld = persistentExameClinico.getPacienteList();
            List<Paciente> pacienteListNew = exameClinico.getPacienteList();
            List<Paciente> attachedPacienteListNew = new ArrayList<Paciente>();
            for (Paciente pacienteListNewPacienteToAttach : pacienteListNew) {
                pacienteListNewPacienteToAttach = em.getReference(pacienteListNewPacienteToAttach.getClass(), pacienteListNewPacienteToAttach.getId());
                attachedPacienteListNew.add(pacienteListNewPacienteToAttach);
            }
            pacienteListNew = attachedPacienteListNew;
            exameClinico.setPacienteList(pacienteListNew);
            exameClinico = em.merge(exameClinico);
            for (Paciente pacienteListOldPaciente : pacienteListOld) {
                if (!pacienteListNew.contains(pacienteListOldPaciente)) {
                    pacienteListOldPaciente.setCodExameClinico(null);
                    pacienteListOldPaciente = em.merge(pacienteListOldPaciente);
                }
            }
            for (Paciente pacienteListNewPaciente : pacienteListNew) {
                if (!pacienteListOld.contains(pacienteListNewPaciente)) {
                    ExameClinico oldCodExameClinicoOfPacienteListNewPaciente = pacienteListNewPaciente.getCodExameClinico();
                    pacienteListNewPaciente.setCodExameClinico(exameClinico);
                    pacienteListNewPaciente = em.merge(pacienteListNewPaciente);
                    if (oldCodExameClinicoOfPacienteListNewPaciente != null && !oldCodExameClinicoOfPacienteListNewPaciente.equals(exameClinico)) {
                        oldCodExameClinicoOfPacienteListNewPaciente.getPacienteList().remove(pacienteListNewPaciente);
                        oldCodExameClinicoOfPacienteListNewPaciente = em.merge(oldCodExameClinicoOfPacienteListNewPaciente);
                    }
                }
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
            List<Paciente> pacienteList = exameClinico.getPacienteList();
            for (Paciente pacienteListPaciente : pacienteList) {
                pacienteListPaciente.setCodExameClinico(null);
                pacienteListPaciente = em.merge(pacienteListPaciente);
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
