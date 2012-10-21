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
import modelo.Resposta;

/**
 *
 * @author Aragon
 */
public class RespostaJpaController implements Serializable {

    public RespostaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Resposta resposta) {
        if (resposta.getPacienteList() == null) {
            resposta.setPacienteList(new ArrayList<Paciente>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Paciente> attachedPacienteList = new ArrayList<Paciente>();
            for (Paciente pacienteListPacienteToAttach : resposta.getPacienteList()) {
                pacienteListPacienteToAttach = em.getReference(pacienteListPacienteToAttach.getClass(), pacienteListPacienteToAttach.getId());
                attachedPacienteList.add(pacienteListPacienteToAttach);
            }
            resposta.setPacienteList(attachedPacienteList);
            em.persist(resposta);
            for (Paciente pacienteListPaciente : resposta.getPacienteList()) {
                Resposta oldIdrespostaOfPacienteListPaciente = pacienteListPaciente.getIdresposta();
                pacienteListPaciente.setIdresposta(resposta);
                pacienteListPaciente = em.merge(pacienteListPaciente);
                if (oldIdrespostaOfPacienteListPaciente != null) {
                    oldIdrespostaOfPacienteListPaciente.getPacienteList().remove(pacienteListPaciente);
                    oldIdrespostaOfPacienteListPaciente = em.merge(oldIdrespostaOfPacienteListPaciente);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Resposta resposta) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Resposta persistentResposta = em.find(Resposta.class, resposta.getId());
            List<Paciente> pacienteListOld = persistentResposta.getPacienteList();
            List<Paciente> pacienteListNew = resposta.getPacienteList();
            List<String> illegalOrphanMessages = null;
            for (Paciente pacienteListOldPaciente : pacienteListOld) {
                if (!pacienteListNew.contains(pacienteListOldPaciente)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Paciente " + pacienteListOldPaciente + " since its idresposta field is not nullable.");
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
            resposta.setPacienteList(pacienteListNew);
            resposta = em.merge(resposta);
            for (Paciente pacienteListNewPaciente : pacienteListNew) {
                if (!pacienteListOld.contains(pacienteListNewPaciente)) {
                    Resposta oldIdrespostaOfPacienteListNewPaciente = pacienteListNewPaciente.getIdresposta();
                    pacienteListNewPaciente.setIdresposta(resposta);
                    pacienteListNewPaciente = em.merge(pacienteListNewPaciente);
                    if (oldIdrespostaOfPacienteListNewPaciente != null && !oldIdrespostaOfPacienteListNewPaciente.equals(resposta)) {
                        oldIdrespostaOfPacienteListNewPaciente.getPacienteList().remove(pacienteListNewPaciente);
                        oldIdrespostaOfPacienteListNewPaciente = em.merge(oldIdrespostaOfPacienteListNewPaciente);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = resposta.getId();
                if (findResposta(id) == null) {
                    throw new NonexistentEntityException("The resposta with id " + id + " no longer exists.");
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
            Resposta resposta;
            try {
                resposta = em.getReference(Resposta.class, id);
                resposta.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The resposta with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            List<Paciente> pacienteListOrphanCheck = resposta.getPacienteList();
            for (Paciente pacienteListOrphanCheckPaciente : pacienteListOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Resposta (" + resposta + ") cannot be destroyed since the Paciente " + pacienteListOrphanCheckPaciente + " in its pacienteList field has a non-nullable idresposta field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            em.remove(resposta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Resposta> findRespostaEntities() {
        return findRespostaEntities(true, -1, -1);
    }

    public List<Resposta> findRespostaEntities(int maxResults, int firstResult) {
        return findRespostaEntities(false, maxResults, firstResult);
    }

    private List<Resposta> findRespostaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Resposta.class));
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

    public Resposta findResposta(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Resposta.class, id);
        } finally {
            em.close();
        }
    }

    public int getRespostaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Resposta> rt = cq.from(Resposta.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
