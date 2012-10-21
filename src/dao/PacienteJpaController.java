/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.exceptions.NonexistentEntityException;
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
 * @author Aragon
 */
public class PacienteJpaController implements Serializable {

    public PacienteJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Paciente paciente) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Resposta idresposta = paciente.getIdresposta();
            if (idresposta != null) {
                idresposta = em.getReference(idresposta.getClass(), idresposta.getId());
                paciente.setIdresposta(idresposta);
            }
            Diagnostico iddiagnostico = paciente.getIddiagnostico();
            if (iddiagnostico != null) {
                iddiagnostico = em.getReference(iddiagnostico.getClass(), iddiagnostico.getId());
                paciente.setIddiagnostico(iddiagnostico);
            }
            em.persist(paciente);
            if (idresposta != null) {
                idresposta.getPacienteList().add(paciente);
                idresposta = em.merge(idresposta);
            }
            if (iddiagnostico != null) {
                iddiagnostico.getPacienteList().add(paciente);
                iddiagnostico = em.merge(iddiagnostico);
            }
            em.getTransaction().commit();
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
            Resposta idrespostaOld = persistentPaciente.getIdresposta();
            Resposta idrespostaNew = paciente.getIdresposta();
            Diagnostico iddiagnosticoOld = persistentPaciente.getIddiagnostico();
            Diagnostico iddiagnosticoNew = paciente.getIddiagnostico();
            if (idrespostaNew != null) {
                idrespostaNew = em.getReference(idrespostaNew.getClass(), idrespostaNew.getId());
                paciente.setIdresposta(idrespostaNew);
            }
            if (iddiagnosticoNew != null) {
                iddiagnosticoNew = em.getReference(iddiagnosticoNew.getClass(), iddiagnosticoNew.getId());
                paciente.setIddiagnostico(iddiagnosticoNew);
            }
            paciente = em.merge(paciente);
            if (idrespostaOld != null && !idrespostaOld.equals(idrespostaNew)) {
                idrespostaOld.getPacienteList().remove(paciente);
                idrespostaOld = em.merge(idrespostaOld);
            }
            if (idrespostaNew != null && !idrespostaNew.equals(idrespostaOld)) {
                idrespostaNew.getPacienteList().add(paciente);
                idrespostaNew = em.merge(idrespostaNew);
            }
            if (iddiagnosticoOld != null && !iddiagnosticoOld.equals(iddiagnosticoNew)) {
                iddiagnosticoOld.getPacienteList().remove(paciente);
                iddiagnosticoOld = em.merge(iddiagnosticoOld);
            }
            if (iddiagnosticoNew != null && !iddiagnosticoNew.equals(iddiagnosticoOld)) {
                iddiagnosticoNew.getPacienteList().add(paciente);
                iddiagnosticoNew = em.merge(iddiagnosticoNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = paciente.getId();
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

    public void destroy(Long id) throws NonexistentEntityException {
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
            Resposta idresposta = paciente.getIdresposta();
            if (idresposta != null) {
                idresposta.getPacienteList().remove(paciente);
                idresposta = em.merge(idresposta);
            }
            Diagnostico iddiagnostico = paciente.getIddiagnostico();
            if (iddiagnostico != null) {
                iddiagnostico.getPacienteList().remove(paciente);
                iddiagnostico = em.merge(iddiagnostico);
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

    public Paciente findPaciente(Long id) {
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
