/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.exceptions.IllegalOrphanException;
import dao.exceptions.NonexistentEntityException;
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
import modelo.Diagnostico;

/**
 *
 * @author Aragon
 */
public class DiagnosticoJpaController implements Serializable {

    public DiagnosticoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Diagnostico diagnostico) {
        if (diagnostico.getPacienteList() == null) {
            diagnostico.setPacienteList(new ArrayList<Paciente>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Paciente> attachedPacienteList = new ArrayList<Paciente>();
            for (Paciente pacienteListPacienteToAttach : diagnostico.getPacienteList()) {
                pacienteListPacienteToAttach = em.getReference(pacienteListPacienteToAttach.getClass(), pacienteListPacienteToAttach.getId());
                attachedPacienteList.add(pacienteListPacienteToAttach);
            }
            diagnostico.setPacienteList(attachedPacienteList);
            em.persist(diagnostico);
            for (Paciente pacienteListPaciente : diagnostico.getPacienteList()) {
                Diagnostico oldIddiagnosticoOfPacienteListPaciente = pacienteListPaciente.getIddiagnostico();
                pacienteListPaciente.setIddiagnostico(diagnostico);
                pacienteListPaciente = em.merge(pacienteListPaciente);
                if (oldIddiagnosticoOfPacienteListPaciente != null) {
                    oldIddiagnosticoOfPacienteListPaciente.getPacienteList().remove(pacienteListPaciente);
                    oldIddiagnosticoOfPacienteListPaciente = em.merge(oldIddiagnosticoOfPacienteListPaciente);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Diagnostico diagnostico) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Diagnostico persistentDiagnostico = em.find(Diagnostico.class, diagnostico.getId());
            List<Paciente> pacienteListOld = persistentDiagnostico.getPacienteList();
            List<Paciente> pacienteListNew = diagnostico.getPacienteList();
            List<String> illegalOrphanMessages = null;
            for (Paciente pacienteListOldPaciente : pacienteListOld) {
                if (!pacienteListNew.contains(pacienteListOldPaciente)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Paciente " + pacienteListOldPaciente + " since its iddiagnostico field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            List<Paciente> attachedPacienteListNew = new ArrayList<Paciente>();
            for (Paciente pacienteListNewPacienteToAttach : pacienteListNew) {
                pacienteListNewPacienteToAttach = em.getReference(pacienteListNewPacienteToAttach.getClass(), pacienteListNewPacienteToAttach.getId());
                attachedPacienteListNew.add(pacienteListNewPacienteToAttach);
            }
            pacienteListNew = attachedPacienteListNew;
            diagnostico.setPacienteList(pacienteListNew);
            diagnostico = em.merge(diagnostico);
            for (Paciente pacienteListNewPaciente : pacienteListNew) {
                if (!pacienteListOld.contains(pacienteListNewPaciente)) {
                    Diagnostico oldIddiagnosticoOfPacienteListNewPaciente = pacienteListNewPaciente.getIddiagnostico();
                    pacienteListNewPaciente.setIddiagnostico(diagnostico);
                    pacienteListNewPaciente = em.merge(pacienteListNewPaciente);
                    if (oldIddiagnosticoOfPacienteListNewPaciente != null && !oldIddiagnosticoOfPacienteListNewPaciente.equals(diagnostico)) {
                        oldIddiagnosticoOfPacienteListNewPaciente.getPacienteList().remove(pacienteListNewPaciente);
                        oldIddiagnosticoOfPacienteListNewPaciente = em.merge(oldIddiagnosticoOfPacienteListNewPaciente);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = diagnostico.getId();
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

    public void destroy(Long id) throws IllegalOrphanException, NonexistentEntityException {
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
            List<String> illegalOrphanMessages = null;
            List<Paciente> pacienteListOrphanCheck = diagnostico.getPacienteList();
            for (Paciente pacienteListOrphanCheckPaciente : pacienteListOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Diagnostico (" + diagnostico + ") cannot be destroyed since the Paciente " + pacienteListOrphanCheckPaciente + " in its pacienteList field has a non-nullable iddiagnostico field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
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

    public Diagnostico findDiagnostico(Long id) {
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
