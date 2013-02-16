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
import modelo.Resposta;

/**
 *
 * @author alisson
 */
public class RespostaJpaController implements Serializable {

    public RespostaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Resposta resposta) throws PreexistingEntityException, Exception {
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
                Resposta oldCodrespostaOfPacienteListPaciente = pacienteListPaciente.getCodresposta();
                pacienteListPaciente.setCodresposta(resposta);
                pacienteListPaciente = em.merge(pacienteListPaciente);
                if (oldCodrespostaOfPacienteListPaciente != null) {
                    oldCodrespostaOfPacienteListPaciente.getPacienteList().remove(pacienteListPaciente);
                    oldCodrespostaOfPacienteListPaciente = em.merge(oldCodrespostaOfPacienteListPaciente);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findResposta(resposta.getId()) != null) {
                throw new PreexistingEntityException("Resposta " + resposta + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Resposta resposta) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Resposta persistentResposta = em.find(Resposta.class, resposta.getId());
            List<Paciente> pacienteListOld = persistentResposta.getPacienteList();
            List<Paciente> pacienteListNew = resposta.getPacienteList();
            List<Paciente> attachedPacienteListNew = new ArrayList<Paciente>();
            for (Paciente pacienteListNewPacienteToAttach : pacienteListNew) {
                pacienteListNewPacienteToAttach = em.getReference(pacienteListNewPacienteToAttach.getClass(), pacienteListNewPacienteToAttach.getId());
                attachedPacienteListNew.add(pacienteListNewPacienteToAttach);
            }
            pacienteListNew = attachedPacienteListNew;
            resposta.setPacienteList(pacienteListNew);
            resposta = em.merge(resposta);
            for (Paciente pacienteListOldPaciente : pacienteListOld) {
                if (!pacienteListNew.contains(pacienteListOldPaciente)) {
                    pacienteListOldPaciente.setCodresposta(null);
                    pacienteListOldPaciente = em.merge(pacienteListOldPaciente);
                }
            }
            for (Paciente pacienteListNewPaciente : pacienteListNew) {
                if (!pacienteListOld.contains(pacienteListNewPaciente)) {
                    Resposta oldCodrespostaOfPacienteListNewPaciente = pacienteListNewPaciente.getCodresposta();
                    pacienteListNewPaciente.setCodresposta(resposta);
                    pacienteListNewPaciente = em.merge(pacienteListNewPaciente);
                    if (oldCodrespostaOfPacienteListNewPaciente != null && !oldCodrespostaOfPacienteListNewPaciente.equals(resposta)) {
                        oldCodrespostaOfPacienteListNewPaciente.getPacienteList().remove(pacienteListNewPaciente);
                        oldCodrespostaOfPacienteListNewPaciente = em.merge(oldCodrespostaOfPacienteListNewPaciente);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = resposta.getId();
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

    public void destroy(Integer id) throws NonexistentEntityException {
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
            List<Paciente> pacienteList = resposta.getPacienteList();
            for (Paciente pacienteListPaciente : pacienteList) {
                pacienteListPaciente.setCodresposta(null);
                pacienteListPaciente = em.merge(pacienteListPaciente);
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

    public Resposta findResposta(Integer id) {
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
