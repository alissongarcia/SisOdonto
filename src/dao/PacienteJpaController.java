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
import modelo.Resposta;
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
            Resposta codresposta = paciente.getCodresposta();
            if (codresposta != null) {
                codresposta = em.getReference(codresposta.getClass(), codresposta.getId());
                paciente.setCodresposta(codresposta);
            }
            Diagnostico coddiagnostico = paciente.getCoddiagnostico();
            if (coddiagnostico != null) {
                coddiagnostico = em.getReference(coddiagnostico.getClass(), coddiagnostico.getId());
                paciente.setCoddiagnostico(coddiagnostico);
            }
            em.persist(paciente);
            if (codresposta != null) {
                codresposta.getPacienteList().add(paciente);
                codresposta = em.merge(codresposta);
            }
            if (coddiagnostico != null) {
                coddiagnostico.getPacienteList().add(paciente);
                coddiagnostico = em.merge(coddiagnostico);
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
            Resposta codrespostaOld = persistentPaciente.getCodresposta();
            Resposta codrespostaNew = paciente.getCodresposta();
            Diagnostico coddiagnosticoOld = persistentPaciente.getCoddiagnostico();
            Diagnostico coddiagnosticoNew = paciente.getCoddiagnostico();
            if (codrespostaNew != null) {
                codrespostaNew = em.getReference(codrespostaNew.getClass(), codrespostaNew.getId());
                paciente.setCodresposta(codrespostaNew);
            }
            if (coddiagnosticoNew != null) {
                coddiagnosticoNew = em.getReference(coddiagnosticoNew.getClass(), coddiagnosticoNew.getId());
                paciente.setCoddiagnostico(coddiagnosticoNew);
            }
            paciente = em.merge(paciente);
            if (codrespostaOld != null && !codrespostaOld.equals(codrespostaNew)) {
                codrespostaOld.getPacienteList().remove(paciente);
                codrespostaOld = em.merge(codrespostaOld);
            }
            if (codrespostaNew != null && !codrespostaNew.equals(codrespostaOld)) {
                codrespostaNew.getPacienteList().add(paciente);
                codrespostaNew = em.merge(codrespostaNew);
            }
            if (coddiagnosticoOld != null && !coddiagnosticoOld.equals(coddiagnosticoNew)) {
                coddiagnosticoOld.getPacienteList().remove(paciente);
                coddiagnosticoOld = em.merge(coddiagnosticoOld);
            }
            if (coddiagnosticoNew != null && !coddiagnosticoNew.equals(coddiagnosticoOld)) {
                coddiagnosticoNew.getPacienteList().add(paciente);
                coddiagnosticoNew = em.merge(coddiagnosticoNew);
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
            Resposta codresposta = paciente.getCodresposta();
            if (codresposta != null) {
                codresposta.getPacienteList().remove(paciente);
                codresposta = em.merge(codresposta);
            }
            Diagnostico coddiagnostico = paciente.getCoddiagnostico();
            if (coddiagnostico != null) {
                coddiagnostico.getPacienteList().remove(paciente);
                coddiagnostico = em.merge(coddiagnostico);
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
