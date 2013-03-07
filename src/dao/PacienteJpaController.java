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
import modelo.ExameClinico;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import modelo.Diagnostico;
import modelo.Paciente;
import modelo.QuestionarioPessoal;

/**
 *
 * @author Carlos
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
        if (paciente.getExameClinicoList() == null) {
            paciente.setExameClinicoList(new ArrayList<ExameClinico>());
        }
        if (paciente.getDiagnosticoList() == null) {
            paciente.setDiagnosticoList(new ArrayList<Diagnostico>());
        }
        if (paciente.getQuestionarioPessoalList() == null) {
            paciente.setQuestionarioPessoalList(new ArrayList<QuestionarioPessoal>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<ExameClinico> attachedExameClinicoList = new ArrayList<ExameClinico>();
            for (ExameClinico exameClinicoListExameClinicoToAttach : paciente.getExameClinicoList()) {
                exameClinicoListExameClinicoToAttach = em.getReference(exameClinicoListExameClinicoToAttach.getClass(), exameClinicoListExameClinicoToAttach.getId());
                attachedExameClinicoList.add(exameClinicoListExameClinicoToAttach);
            }
            paciente.setExameClinicoList(attachedExameClinicoList);
            List<Diagnostico> attachedDiagnosticoList = new ArrayList<Diagnostico>();
            for (Diagnostico diagnosticoListDiagnosticoToAttach : paciente.getDiagnosticoList()) {
                diagnosticoListDiagnosticoToAttach = em.getReference(diagnosticoListDiagnosticoToAttach.getClass(), diagnosticoListDiagnosticoToAttach.getId());
                attachedDiagnosticoList.add(diagnosticoListDiagnosticoToAttach);
            }
            paciente.setDiagnosticoList(attachedDiagnosticoList);
            List<QuestionarioPessoal> attachedQuestionarioPessoalList = new ArrayList<QuestionarioPessoal>();
            for (QuestionarioPessoal questionarioPessoalListQuestionarioPessoalToAttach : paciente.getQuestionarioPessoalList()) {
                questionarioPessoalListQuestionarioPessoalToAttach = em.getReference(questionarioPessoalListQuestionarioPessoalToAttach.getClass(), questionarioPessoalListQuestionarioPessoalToAttach.getId());
                attachedQuestionarioPessoalList.add(questionarioPessoalListQuestionarioPessoalToAttach);
            }
            paciente.setQuestionarioPessoalList(attachedQuestionarioPessoalList);
            em.persist(paciente);
            for (ExameClinico exameClinicoListExameClinico : paciente.getExameClinicoList()) {
                Paciente oldCodPacienteExameOfExameClinicoListExameClinico = exameClinicoListExameClinico.getCodPacienteExame();
                exameClinicoListExameClinico.setCodPacienteExame(paciente);
                exameClinicoListExameClinico = em.merge(exameClinicoListExameClinico);
                if (oldCodPacienteExameOfExameClinicoListExameClinico != null) {
                    oldCodPacienteExameOfExameClinicoListExameClinico.getExameClinicoList().remove(exameClinicoListExameClinico);
                    oldCodPacienteExameOfExameClinicoListExameClinico = em.merge(oldCodPacienteExameOfExameClinicoListExameClinico);
                }
            }
            for (Diagnostico diagnosticoListDiagnostico : paciente.getDiagnosticoList()) {
                Paciente oldCodPacienteDiagOfDiagnosticoListDiagnostico = diagnosticoListDiagnostico.getCodPacienteDiag();
                diagnosticoListDiagnostico.setCodPacienteDiag(paciente);
                diagnosticoListDiagnostico = em.merge(diagnosticoListDiagnostico);
                if (oldCodPacienteDiagOfDiagnosticoListDiagnostico != null) {
                    oldCodPacienteDiagOfDiagnosticoListDiagnostico.getDiagnosticoList().remove(diagnosticoListDiagnostico);
                    oldCodPacienteDiagOfDiagnosticoListDiagnostico = em.merge(oldCodPacienteDiagOfDiagnosticoListDiagnostico);
                }
            }
            for (QuestionarioPessoal questionarioPessoalListQuestionarioPessoal : paciente.getQuestionarioPessoalList()) {
                Paciente oldCodPacienteOfQuestionarioPessoalListQuestionarioPessoal = questionarioPessoalListQuestionarioPessoal.getCodPaciente();
                questionarioPessoalListQuestionarioPessoal.setCodPaciente(paciente);
                questionarioPessoalListQuestionarioPessoal = em.merge(questionarioPessoalListQuestionarioPessoal);
                if (oldCodPacienteOfQuestionarioPessoalListQuestionarioPessoal != null) {
                    oldCodPacienteOfQuestionarioPessoalListQuestionarioPessoal.getQuestionarioPessoalList().remove(questionarioPessoalListQuestionarioPessoal);
                    oldCodPacienteOfQuestionarioPessoalListQuestionarioPessoal = em.merge(oldCodPacienteOfQuestionarioPessoalListQuestionarioPessoal);
                }
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
            List<ExameClinico> exameClinicoListOld = persistentPaciente.getExameClinicoList();
            List<ExameClinico> exameClinicoListNew = paciente.getExameClinicoList();
            List<Diagnostico> diagnosticoListOld = persistentPaciente.getDiagnosticoList();
            List<Diagnostico> diagnosticoListNew = paciente.getDiagnosticoList();
            List<QuestionarioPessoal> questionarioPessoalListOld = persistentPaciente.getQuestionarioPessoalList();
            List<QuestionarioPessoal> questionarioPessoalListNew = paciente.getQuestionarioPessoalList();
            List<ExameClinico> attachedExameClinicoListNew = new ArrayList<ExameClinico>();
            for (ExameClinico exameClinicoListNewExameClinicoToAttach : exameClinicoListNew) {
                exameClinicoListNewExameClinicoToAttach = em.getReference(exameClinicoListNewExameClinicoToAttach.getClass(), exameClinicoListNewExameClinicoToAttach.getId());
                attachedExameClinicoListNew.add(exameClinicoListNewExameClinicoToAttach);
            }
            exameClinicoListNew = attachedExameClinicoListNew;
            paciente.setExameClinicoList(exameClinicoListNew);
            List<Diagnostico> attachedDiagnosticoListNew = new ArrayList<Diagnostico>();
            for (Diagnostico diagnosticoListNewDiagnosticoToAttach : diagnosticoListNew) {
                diagnosticoListNewDiagnosticoToAttach = em.getReference(diagnosticoListNewDiagnosticoToAttach.getClass(), diagnosticoListNewDiagnosticoToAttach.getId());
                attachedDiagnosticoListNew.add(diagnosticoListNewDiagnosticoToAttach);
            }
            diagnosticoListNew = attachedDiagnosticoListNew;
            paciente.setDiagnosticoList(diagnosticoListNew);
            List<QuestionarioPessoal> attachedQuestionarioPessoalListNew = new ArrayList<QuestionarioPessoal>();
            for (QuestionarioPessoal questionarioPessoalListNewQuestionarioPessoalToAttach : questionarioPessoalListNew) {
                questionarioPessoalListNewQuestionarioPessoalToAttach = em.getReference(questionarioPessoalListNewQuestionarioPessoalToAttach.getClass(), questionarioPessoalListNewQuestionarioPessoalToAttach.getId());
                attachedQuestionarioPessoalListNew.add(questionarioPessoalListNewQuestionarioPessoalToAttach);
            }
            questionarioPessoalListNew = attachedQuestionarioPessoalListNew;
            paciente.setQuestionarioPessoalList(questionarioPessoalListNew);
            paciente = em.merge(paciente);
            for (ExameClinico exameClinicoListOldExameClinico : exameClinicoListOld) {
                if (!exameClinicoListNew.contains(exameClinicoListOldExameClinico)) {
                    exameClinicoListOldExameClinico.setCodPacienteExame(null);
                    exameClinicoListOldExameClinico = em.merge(exameClinicoListOldExameClinico);
                }
            }
            for (ExameClinico exameClinicoListNewExameClinico : exameClinicoListNew) {
                if (!exameClinicoListOld.contains(exameClinicoListNewExameClinico)) {
                    Paciente oldCodPacienteExameOfExameClinicoListNewExameClinico = exameClinicoListNewExameClinico.getCodPacienteExame();
                    exameClinicoListNewExameClinico.setCodPacienteExame(paciente);
                    exameClinicoListNewExameClinico = em.merge(exameClinicoListNewExameClinico);
                    if (oldCodPacienteExameOfExameClinicoListNewExameClinico != null && !oldCodPacienteExameOfExameClinicoListNewExameClinico.equals(paciente)) {
                        oldCodPacienteExameOfExameClinicoListNewExameClinico.getExameClinicoList().remove(exameClinicoListNewExameClinico);
                        oldCodPacienteExameOfExameClinicoListNewExameClinico = em.merge(oldCodPacienteExameOfExameClinicoListNewExameClinico);
                    }
                }
            }
            for (Diagnostico diagnosticoListOldDiagnostico : diagnosticoListOld) {
                if (!diagnosticoListNew.contains(diagnosticoListOldDiagnostico)) {
                    diagnosticoListOldDiagnostico.setCodPacienteDiag(null);
                    diagnosticoListOldDiagnostico = em.merge(diagnosticoListOldDiagnostico);
                }
            }
            for (Diagnostico diagnosticoListNewDiagnostico : diagnosticoListNew) {
                if (!diagnosticoListOld.contains(diagnosticoListNewDiagnostico)) {
                    Paciente oldCodPacienteDiagOfDiagnosticoListNewDiagnostico = diagnosticoListNewDiagnostico.getCodPacienteDiag();
                    diagnosticoListNewDiagnostico.setCodPacienteDiag(paciente);
                    diagnosticoListNewDiagnostico = em.merge(diagnosticoListNewDiagnostico);
                    if (oldCodPacienteDiagOfDiagnosticoListNewDiagnostico != null && !oldCodPacienteDiagOfDiagnosticoListNewDiagnostico.equals(paciente)) {
                        oldCodPacienteDiagOfDiagnosticoListNewDiagnostico.getDiagnosticoList().remove(diagnosticoListNewDiagnostico);
                        oldCodPacienteDiagOfDiagnosticoListNewDiagnostico = em.merge(oldCodPacienteDiagOfDiagnosticoListNewDiagnostico);
                    }
                }
            }
            for (QuestionarioPessoal questionarioPessoalListOldQuestionarioPessoal : questionarioPessoalListOld) {
                if (!questionarioPessoalListNew.contains(questionarioPessoalListOldQuestionarioPessoal)) {
                    questionarioPessoalListOldQuestionarioPessoal.setCodPaciente(null);
                    questionarioPessoalListOldQuestionarioPessoal = em.merge(questionarioPessoalListOldQuestionarioPessoal);
                }
            }
            for (QuestionarioPessoal questionarioPessoalListNewQuestionarioPessoal : questionarioPessoalListNew) {
                if (!questionarioPessoalListOld.contains(questionarioPessoalListNewQuestionarioPessoal)) {
                    Paciente oldCodPacienteOfQuestionarioPessoalListNewQuestionarioPessoal = questionarioPessoalListNewQuestionarioPessoal.getCodPaciente();
                    questionarioPessoalListNewQuestionarioPessoal.setCodPaciente(paciente);
                    questionarioPessoalListNewQuestionarioPessoal = em.merge(questionarioPessoalListNewQuestionarioPessoal);
                    if (oldCodPacienteOfQuestionarioPessoalListNewQuestionarioPessoal != null && !oldCodPacienteOfQuestionarioPessoalListNewQuestionarioPessoal.equals(paciente)) {
                        oldCodPacienteOfQuestionarioPessoalListNewQuestionarioPessoal.getQuestionarioPessoalList().remove(questionarioPessoalListNewQuestionarioPessoal);
                        oldCodPacienteOfQuestionarioPessoalListNewQuestionarioPessoal = em.merge(oldCodPacienteOfQuestionarioPessoalListNewQuestionarioPessoal);
                    }
                }
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
            List<ExameClinico> exameClinicoList = paciente.getExameClinicoList();
            for (ExameClinico exameClinicoListExameClinico : exameClinicoList) {
                exameClinicoListExameClinico.setCodPacienteExame(null);
                exameClinicoListExameClinico = em.merge(exameClinicoListExameClinico);
            }
            List<Diagnostico> diagnosticoList = paciente.getDiagnosticoList();
            for (Diagnostico diagnosticoListDiagnostico : diagnosticoList) {
                diagnosticoListDiagnostico.setCodPacienteDiag(null);
                diagnosticoListDiagnostico = em.merge(diagnosticoListDiagnostico);
            }
            List<QuestionarioPessoal> questionarioPessoalList = paciente.getQuestionarioPessoalList();
            for (QuestionarioPessoal questionarioPessoalListQuestionarioPessoal : questionarioPessoalList) {
                questionarioPessoalListQuestionarioPessoal.setCodPaciente(null);
                questionarioPessoalListQuestionarioPessoal = em.merge(questionarioPessoalListQuestionarioPessoal);
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
