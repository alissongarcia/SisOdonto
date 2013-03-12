/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author alisson
 */
@Entity
@Table(name = "exame_clinico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ExameClinico.findAll", query = "SELECT e FROM ExameClinico e"),
    @NamedQuery(name = "ExameClinico.findById", query = "SELECT e FROM ExameClinico e WHERE e.id = :id"),
    @NamedQuery(name = "ExameClinico.findByRqp3", query = "SELECT e FROM ExameClinico e WHERE e.rqp3 = :rqp3"),
    @NamedQuery(name = "ExameClinico.findByRqp14A", query = "SELECT e FROM ExameClinico e WHERE e.rqp14A = :rqp14A"),
    @NamedQuery(name = "ExameClinico.findByRqp14B", query = "SELECT e FROM ExameClinico e WHERE e.rqp14B = :rqp14B"),
    @NamedQuery(name = "ExameClinico.findByRq1", query = "SELECT e FROM ExameClinico e WHERE e.rq1 = :rq1"),
    @NamedQuery(name = "ExameClinico.findByRq21Dir", query = "SELECT e FROM ExameClinico e WHERE e.rq21Dir = :rq21Dir"),
    @NamedQuery(name = "ExameClinico.findByRq22Esq", query = "SELECT e FROM ExameClinico e WHERE e.rq22Esq = :rq22Esq"),
    @NamedQuery(name = "ExameClinico.findByRq3", query = "SELECT e FROM ExameClinico e WHERE e.rq3 = :rq3"),
    @NamedQuery(name = "ExameClinico.findByRq4AMm", query = "SELECT e FROM ExameClinico e WHERE e.rq4AMm = :rq4AMm"),
    @NamedQuery(name = "ExameClinico.findByRq4BMm", query = "SELECT e FROM ExameClinico e WHERE e.rq4BMm = :rq4BMm"),
    @NamedQuery(name = "ExameClinico.findByRq4CMm", query = "SELECT e FROM ExameClinico e WHERE e.rq4CMm = :rq4CMm"),
    @NamedQuery(name = "ExameClinico.findByRq4DMm", query = "SELECT e FROM ExameClinico e WHERE e.rq4DMm = :rq4DMm"),
    @NamedQuery(name = "ExameClinico.findByRq4BDormusc", query = "SELECT e FROM ExameClinico e WHERE e.rq4BDormusc = :rq4BDormusc"),
    @NamedQuery(name = "ExameClinico.findByRq4CDormusc", query = "SELECT e FROM ExameClinico e WHERE e.rq4CDormusc = :rq4CDormusc"),
    @NamedQuery(name = "ExameClinico.findByRq4BDorart", query = "SELECT e FROM ExameClinico e WHERE e.rq4BDorart = :rq4BDorart"),
    @NamedQuery(name = "ExameClinico.findByRq4CDorart", query = "SELECT e FROM ExameClinico e WHERE e.rq4CDorart = :rq4CDorart"),
    @NamedQuery(name = "ExameClinico.findByRq5ADir", query = "SELECT e FROM ExameClinico e WHERE e.rq5ADir = :rq5ADir"),
    @NamedQuery(name = "ExameClinico.findByRq5AEsq", query = "SELECT e FROM ExameClinico e WHERE e.rq5AEsq = :rq5AEsq"),
    @NamedQuery(name = "ExameClinico.findByRq5AMedEstDirMm", query = "SELECT e FROM ExameClinico e WHERE e.rq5AMedEstDirMm = :rq5AMedEstDirMm"),
    @NamedQuery(name = "ExameClinico.findByRq5AMedEstEsqMm", query = "SELECT e FROM ExameClinico e WHERE e.rq5AMedEstEsqMm = :rq5AMedEstEsqMm"),
    @NamedQuery(name = "ExameClinico.findByRq5BDir", query = "SELECT e FROM ExameClinico e WHERE e.rq5BDir = :rq5BDir"),
    @NamedQuery(name = "ExameClinico.findByRq5BEsq", query = "SELECT e FROM ExameClinico e WHERE e.rq5BEsq = :rq5BEsq"),
    @NamedQuery(name = "ExameClinico.findByRq5BMedEstDirMm", query = "SELECT e FROM ExameClinico e WHERE e.rq5BMedEstDirMm = :rq5BMedEstDirMm"),
    @NamedQuery(name = "ExameClinico.findByRq5BMedEstEsqMm", query = "SELECT e FROM ExameClinico e WHERE e.rq5BMedEstEsqMm = :rq5BMedEstEsqMm"),
    @NamedQuery(name = "ExameClinico.findByRq5CDir", query = "SELECT e FROM ExameClinico e WHERE e.rq5CDir = :rq5CDir"),
    @NamedQuery(name = "ExameClinico.findByRq5CEsq", query = "SELECT e FROM ExameClinico e WHERE e.rq5CEsq = :rq5CEsq"),
    @NamedQuery(name = "ExameClinico.findByRq6AMm", query = "SELECT e FROM ExameClinico e WHERE e.rq6AMm = :rq6AMm"),
    @NamedQuery(name = "ExameClinico.findByRq6ADormusc", query = "SELECT e FROM ExameClinico e WHERE e.rq6ADormusc = :rq6ADormusc"),
    @NamedQuery(name = "ExameClinico.findByRq6ADorart", query = "SELECT e FROM ExameClinico e WHERE e.rq6ADorart = :rq6ADorart"),
    @NamedQuery(name = "ExameClinico.findByRq6BMm", query = "SELECT e FROM ExameClinico e WHERE e.rq6BMm = :rq6BMm"),
    @NamedQuery(name = "ExameClinico.findByRq6BDormusc", query = "SELECT e FROM ExameClinico e WHERE e.rq6BDormusc = :rq6BDormusc"),
    @NamedQuery(name = "ExameClinico.findByRq6BDorart", query = "SELECT e FROM ExameClinico e WHERE e.rq6BDorart = :rq6BDorart"),
    @NamedQuery(name = "ExameClinico.findByRq6CMm", query = "SELECT e FROM ExameClinico e WHERE e.rq6CMm = :rq6CMm"),
    @NamedQuery(name = "ExameClinico.findByRq6CDormusc", query = "SELECT e FROM ExameClinico e WHERE e.rq6CDormusc = :rq6CDormusc"),
    @NamedQuery(name = "ExameClinico.findByRq6CDorart", query = "SELECT e FROM ExameClinico e WHERE e.rq6CDorart = :rq6CDorart"),
    @NamedQuery(name = "ExameClinico.findByRq6DMm", query = "SELECT e FROM ExameClinico e WHERE e.rq6DMm = :rq6DMm"),
    @NamedQuery(name = "ExameClinico.findByRq6DDesvio", query = "SELECT e FROM ExameClinico e WHERE e.rq6DDesvio = :rq6DDesvio"),
    @NamedQuery(name = "ExameClinico.findByRq7DirExcDir", query = "SELECT e FROM ExameClinico e WHERE e.rq7DirExcDir = :rq7DirExcDir"),
    @NamedQuery(name = "ExameClinico.findByRq7DirExcEsq", query = "SELECT e FROM ExameClinico e WHERE e.rq7DirExcEsq = :rq7DirExcEsq"),
    @NamedQuery(name = "ExameClinico.findByRq7DirProtusao", query = "SELECT e FROM ExameClinico e WHERE e.rq7DirProtusao = :rq7DirProtusao"),
    @NamedQuery(name = "ExameClinico.findByRq7EsqExcDir", query = "SELECT e FROM ExameClinico e WHERE e.rq7EsqExcDir = :rq7EsqExcDir"),
    @NamedQuery(name = "ExameClinico.findByRq7EsqExcEsq", query = "SELECT e FROM ExameClinico e WHERE e.rq7EsqExcEsq = :rq7EsqExcEsq"),
    @NamedQuery(name = "ExameClinico.findByRq7EsqProtusao", query = "SELECT e FROM ExameClinico e WHERE e.rq7EsqProtusao = :rq7EsqProtusao"),
    @NamedQuery(name = "ExameClinico.findByRq8ADir", query = "SELECT e FROM ExameClinico e WHERE e.rq8ADir = :rq8ADir"),
    @NamedQuery(name = "ExameClinico.findByRq8AEsq", query = "SELECT e FROM ExameClinico e WHERE e.rq8AEsq = :rq8AEsq"),
    @NamedQuery(name = "ExameClinico.findByRq8BDir", query = "SELECT e FROM ExameClinico e WHERE e.rq8BDir = :rq8BDir"),
    @NamedQuery(name = "ExameClinico.findByRq8BEsq", query = "SELECT e FROM ExameClinico e WHERE e.rq8BEsq = :rq8BEsq"),
    @NamedQuery(name = "ExameClinico.findByRq8CDir", query = "SELECT e FROM ExameClinico e WHERE e.rq8CDir = :rq8CDir"),
    @NamedQuery(name = "ExameClinico.findByRq8CEsq", query = "SELECT e FROM ExameClinico e WHERE e.rq8CEsq = :rq8CEsq"),
    @NamedQuery(name = "ExameClinico.findByRq8DDir", query = "SELECT e FROM ExameClinico e WHERE e.rq8DDir = :rq8DDir"),
    @NamedQuery(name = "ExameClinico.findByRq8DEsq", query = "SELECT e FROM ExameClinico e WHERE e.rq8DEsq = :rq8DEsq"),
    @NamedQuery(name = "ExameClinico.findByRq8EDir", query = "SELECT e FROM ExameClinico e WHERE e.rq8EDir = :rq8EDir"),
    @NamedQuery(name = "ExameClinico.findByRq8EEsq", query = "SELECT e FROM ExameClinico e WHERE e.rq8EEsq = :rq8EEsq"),
    @NamedQuery(name = "ExameClinico.findByRq8FDir", query = "SELECT e FROM ExameClinico e WHERE e.rq8FDir = :rq8FDir"),
    @NamedQuery(name = "ExameClinico.findByRq8FEsq", query = "SELECT e FROM ExameClinico e WHERE e.rq8FEsq = :rq8FEsq"),
    @NamedQuery(name = "ExameClinico.findByRq8GDir", query = "SELECT e FROM ExameClinico e WHERE e.rq8GDir = :rq8GDir"),
    @NamedQuery(name = "ExameClinico.findByRq8GEsq", query = "SELECT e FROM ExameClinico e WHERE e.rq8GEsq = :rq8GEsq"),
    @NamedQuery(name = "ExameClinico.findByRq8HDir", query = "SELECT e FROM ExameClinico e WHERE e.rq8HDir = :rq8HDir"),
    @NamedQuery(name = "ExameClinico.findByRq8HEsq", query = "SELECT e FROM ExameClinico e WHERE e.rq8HEsq = :rq8HEsq"),
    @NamedQuery(name = "ExameClinico.findByRq9ADir", query = "SELECT e FROM ExameClinico e WHERE e.rq9ADir = :rq9ADir"),
    @NamedQuery(name = "ExameClinico.findByRq9AEsq", query = "SELECT e FROM ExameClinico e WHERE e.rq9AEsq = :rq9AEsq"),
    @NamedQuery(name = "ExameClinico.findByRq9BDir", query = "SELECT e FROM ExameClinico e WHERE e.rq9BDir = :rq9BDir"),
    @NamedQuery(name = "ExameClinico.findByRq9BEsq", query = "SELECT e FROM ExameClinico e WHERE e.rq9BEsq = :rq9BEsq"),
    @NamedQuery(name = "ExameClinico.findByRq10ADir", query = "SELECT e FROM ExameClinico e WHERE e.rq10ADir = :rq10ADir"),
    @NamedQuery(name = "ExameClinico.findByRq10AEsq", query = "SELECT e FROM ExameClinico e WHERE e.rq10AEsq = :rq10AEsq"),
    @NamedQuery(name = "ExameClinico.findByRq10BDir", query = "SELECT e FROM ExameClinico e WHERE e.rq10BDir = :rq10BDir"),
    @NamedQuery(name = "ExameClinico.findByRq10BEsq", query = "SELECT e FROM ExameClinico e WHERE e.rq10BEsq = :rq10BEsq")})
public class ExameClinico implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "rqp3")
    private String rqp3;
    @Column(name = "rqp14_a")
    private String rqp14A;
    @Column(name = "rqp14_b")
    private String rqp14B;
    @Column(name = "rq1")
    private String rq1;
    @Column(name = "rq2_1_dir")
    private String rq21Dir;
    @Column(name = "rq2_2_esq")
    private String rq22Esq;
    @Column(name = "rq3")
    private String rq3;
    @Column(name = "rq4_a_mm")
    private String rq4AMm;
    @Column(name = "rq4_b_mm")
    private String rq4BMm;
    @Column(name = "rq4_c_mm")
    private String rq4CMm;
    @Column(name = "rq4_d_mm")
    private String rq4DMm;
    @Column(name = "rq4_b_dormusc")
    private String rq4BDormusc;
    @Column(name = "rq4_c_dormusc")
    private String rq4CDormusc;
    @Column(name = "rq4_b_dorart")
    private String rq4BDorart;
    @Column(name = "rq4_c_dorart")
    private String rq4CDorart;
    @Column(name = "rq5_a_dir")
    private String rq5ADir;
    @Column(name = "rq5_a_esq")
    private String rq5AEsq;
    @Column(name = "rq5_a_med_est_dir_mm")
    private String rq5AMedEstDirMm;
    @Column(name = "rq5_a_med_est_esq_mm")
    private String rq5AMedEstEsqMm;
    @Column(name = "rq5_b_dir")
    private String rq5BDir;
    @Column(name = "rq5_b_esq")
    private String rq5BEsq;
    @Column(name = "rq5_b_med_est_dir_mm")
    private String rq5BMedEstDirMm;
    @Column(name = "rq5_b_med_est_esq_mm")
    private String rq5BMedEstEsqMm;
    @Column(name = "rq5_c_dir")
    private String rq5CDir;
    @Column(name = "rq5_c_esq")
    private String rq5CEsq;
    @Column(name = "rq6_a_mm")
    private String rq6AMm;
    @Column(name = "rq6_a_dormusc")
    private String rq6ADormusc;
    @Column(name = "rq6_a_dorart")
    private String rq6ADorart;
    @Column(name = "rq6_b_mm")
    private String rq6BMm;
    @Column(name = "rq6_b_dormusc")
    private String rq6BDormusc;
    @Column(name = "rq6_b_dorart")
    private String rq6BDorart;
    @Column(name = "rq6_c_mm")
    private String rq6CMm;
    @Column(name = "rq6_c_dormusc")
    private String rq6CDormusc;
    @Column(name = "rq6_c_dorart")
    private String rq6CDorart;
    @Column(name = "rq6_d_mm")
    private String rq6DMm;
    @Column(name = "rq6_d_desvio")
    private String rq6DDesvio;
    @Column(name = "rq7_dir_exc_dir")
    private String rq7DirExcDir;
    @Column(name = "rq7_dir_exc_esq")
    private String rq7DirExcEsq;
    @Column(name = "rq7_dir_protusao")
    private String rq7DirProtusao;
    @Column(name = "rq7_esq_exc_dir")
    private String rq7EsqExcDir;
    @Column(name = "rq7_esq_exc_esq")
    private String rq7EsqExcEsq;
    @Column(name = "rq7_esq_protusao")
    private String rq7EsqProtusao;
    @Column(name = "rq8_a_dir")
    private String rq8ADir;
    @Column(name = "rq8_a_esq")
    private String rq8AEsq;
    @Column(name = "rq8_b_dir")
    private String rq8BDir;
    @Column(name = "rq8_b_esq")
    private String rq8BEsq;
    @Column(name = "rq8_c_dir")
    private String rq8CDir;
    @Column(name = "rq8_c_esq")
    private String rq8CEsq;
    @Column(name = "rq8_d_dir")
    private String rq8DDir;
    @Column(name = "rq8_d_esq")
    private String rq8DEsq;
    @Column(name = "rq8_e_dir")
    private String rq8EDir;
    @Column(name = "rq8_e_esq")
    private String rq8EEsq;
    @Column(name = "rq8_f_dir")
    private String rq8FDir;
    @Column(name = "rq8_f_esq")
    private String rq8FEsq;
    @Column(name = "rq8_g_dir")
    private String rq8GDir;
    @Column(name = "rq8_g_esq")
    private String rq8GEsq;
    @Column(name = "rq8_h_dir")
    private String rq8HDir;
    @Column(name = "rq8_h_esq")
    private String rq8HEsq;
    @Column(name = "rq9_a_dir")
    private String rq9ADir;
    @Column(name = "rq9_a_esq")
    private String rq9AEsq;
    @Column(name = "rq9_b_dir")
    private String rq9BDir;
    @Column(name = "rq9_b_esq")
    private String rq9BEsq;
    @Column(name = "rq10_a_dir")
    private String rq10ADir;
    @Column(name = "rq10_a_esq")
    private String rq10AEsq;
    @Column(name = "rq10_b_dir")
    private String rq10BDir;
    @Column(name = "rq10_b_esq")
    private String rq10BEsq;
    @JoinColumn(name = "cod_paciente_exame", referencedColumnName = "id")
    @ManyToOne
    private Paciente codPacienteExame;

    public ExameClinico() {
    }

    public ExameClinico(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRqp3() {
        return rqp3;
    }

    public void setRqp3(String rqp3) {
        this.rqp3 = rqp3;
    }

    public String getRqp14A() {
        return rqp14A;
    }

    public void setRqp14A(String rqp14A) {
        this.rqp14A = rqp14A;
    }

    public String getRqp14B() {
        return rqp14B;
    }

    public void setRqp14B(String rqp14B) {
        this.rqp14B = rqp14B;
    }

    public String getRq1() {
        return rq1;
    }

    public void setRq1(String rq1) {
        this.rq1 = rq1;
    }

    public String getRq21Dir() {
        return rq21Dir;
    }

    public void setRq21Dir(String rq21Dir) {
        this.rq21Dir = rq21Dir;
    }

    public String getRq22Esq() {
        return rq22Esq;
    }

    public void setRq22Esq(String rq22Esq) {
        this.rq22Esq = rq22Esq;
    }

    public String getRq3() {
        return rq3;
    }

    public void setRq3(String rq3) {
        this.rq3 = rq3;
    }

    public String getRq4AMm() {
        return rq4AMm;
    }

    public void setRq4AMm(String rq4AMm) {
        this.rq4AMm = rq4AMm;
    }

    public String getRq4BMm() {
        return rq4BMm;
    }

    public void setRq4BMm(String rq4BMm) {
        this.rq4BMm = rq4BMm;
    }

    public String getRq4CMm() {
        return rq4CMm;
    }

    public void setRq4CMm(String rq4CMm) {
        this.rq4CMm = rq4CMm;
    }

    public String getRq4DMm() {
        return rq4DMm;
    }

    public void setRq4DMm(String rq4DMm) {
        this.rq4DMm = rq4DMm;
    }

    public String getRq4BDormusc() {
        return rq4BDormusc;
    }

    public void setRq4BDormusc(String rq4BDormusc) {
        this.rq4BDormusc = rq4BDormusc;
    }

    public String getRq4CDormusc() {
        return rq4CDormusc;
    }

    public void setRq4CDormusc(String rq4CDormusc) {
        this.rq4CDormusc = rq4CDormusc;
    }

    public String getRq4BDorart() {
        return rq4BDorart;
    }

    public void setRq4BDorart(String rq4BDorart) {
        this.rq4BDorart = rq4BDorart;
    }

    public String getRq4CDorart() {
        return rq4CDorart;
    }

    public void setRq4CDorart(String rq4CDorart) {
        this.rq4CDorart = rq4CDorart;
    }

    public String getRq5ADir() {
        return rq5ADir;
    }

    public void setRq5ADir(String rq5ADir) {
        this.rq5ADir = rq5ADir;
    }

    public String getRq5AEsq() {
        return rq5AEsq;
    }

    public void setRq5AEsq(String rq5AEsq) {
        this.rq5AEsq = rq5AEsq;
    }

    public String getRq5AMedEstDirMm() {
        return rq5AMedEstDirMm;
    }

    public void setRq5AMedEstDirMm(String rq5AMedEstDirMm) {
        this.rq5AMedEstDirMm = rq5AMedEstDirMm;
    }

    public String getRq5AMedEstEsqMm() {
        return rq5AMedEstEsqMm;
    }

    public void setRq5AMedEstEsqMm(String rq5AMedEstEsqMm) {
        this.rq5AMedEstEsqMm = rq5AMedEstEsqMm;
    }

    public String getRq5BDir() {
        return rq5BDir;
    }

    public void setRq5BDir(String rq5BDir) {
        this.rq5BDir = rq5BDir;
    }

    public String getRq5BEsq() {
        return rq5BEsq;
    }

    public void setRq5BEsq(String rq5BEsq) {
        this.rq5BEsq = rq5BEsq;
    }

    public String getRq5BMedEstDirMm() {
        return rq5BMedEstDirMm;
    }

    public void setRq5BMedEstDirMm(String rq5BMedEstDirMm) {
        this.rq5BMedEstDirMm = rq5BMedEstDirMm;
    }

    public String getRq5BMedEstEsqMm() {
        return rq5BMedEstEsqMm;
    }

    public void setRq5BMedEstEsqMm(String rq5BMedEstEsqMm) {
        this.rq5BMedEstEsqMm = rq5BMedEstEsqMm;
    }

    public String getRq5CDir() {
        return rq5CDir;
    }

    public void setRq5CDir(String rq5CDir) {
        this.rq5CDir = rq5CDir;
    }

    public String getRq5CEsq() {
        return rq5CEsq;
    }

    public void setRq5CEsq(String rq5CEsq) {
        this.rq5CEsq = rq5CEsq;
    }

    public String getRq6AMm() {
        return rq6AMm;
    }

    public void setRq6AMm(String rq6AMm) {
        this.rq6AMm = rq6AMm;
    }

    public String getRq6ADormusc() {
        return rq6ADormusc;
    }

    public void setRq6ADormusc(String rq6ADormusc) {
        this.rq6ADormusc = rq6ADormusc;
    }

    public String getRq6ADorart() {
        return rq6ADorart;
    }

    public void setRq6ADorart(String rq6ADorart) {
        this.rq6ADorart = rq6ADorart;
    }

    public String getRq6BMm() {
        return rq6BMm;
    }

    public void setRq6BMm(String rq6BMm) {
        this.rq6BMm = rq6BMm;
    }

    public String getRq6BDormusc() {
        return rq6BDormusc;
    }

    public void setRq6BDormusc(String rq6BDormusc) {
        this.rq6BDormusc = rq6BDormusc;
    }

    public String getRq6BDorart() {
        return rq6BDorart;
    }

    public void setRq6BDorart(String rq6BDorart) {
        this.rq6BDorart = rq6BDorart;
    }

    public String getRq6CMm() {
        return rq6CMm;
    }

    public void setRq6CMm(String rq6CMm) {
        this.rq6CMm = rq6CMm;
    }

    public String getRq6CDormusc() {
        return rq6CDormusc;
    }

    public void setRq6CDormusc(String rq6CDormusc) {
        this.rq6CDormusc = rq6CDormusc;
    }

    public String getRq6CDorart() {
        return rq6CDorart;
    }

    public void setRq6CDorart(String rq6CDorart) {
        this.rq6CDorart = rq6CDorart;
    }

    public String getRq6DMm() {
        return rq6DMm;
    }

    public void setRq6DMm(String rq6DMm) {
        this.rq6DMm = rq6DMm;
    }

    public String getRq6DDesvio() {
        return rq6DDesvio;
    }

    public void setRq6DDesvio(String rq6DDesvio) {
        this.rq6DDesvio = rq6DDesvio;
    }

    public String getRq7DirExcDir() {
        return rq7DirExcDir;
    }

    public void setRq7DirExcDir(String rq7DirExcDir) {
        this.rq7DirExcDir = rq7DirExcDir;
    }

    public String getRq7DirExcEsq() {
        return rq7DirExcEsq;
    }

    public void setRq7DirExcEsq(String rq7DirExcEsq) {
        this.rq7DirExcEsq = rq7DirExcEsq;
    }

    public String getRq7DirProtusao() {
        return rq7DirProtusao;
    }

    public void setRq7DirProtusao(String rq7DirProtusao) {
        this.rq7DirProtusao = rq7DirProtusao;
    }

    public String getRq7EsqExcDir() {
        return rq7EsqExcDir;
    }

    public void setRq7EsqExcDir(String rq7EsqExcDir) {
        this.rq7EsqExcDir = rq7EsqExcDir;
    }

    public String getRq7EsqExcEsq() {
        return rq7EsqExcEsq;
    }

    public void setRq7EsqExcEsq(String rq7EsqExcEsq) {
        this.rq7EsqExcEsq = rq7EsqExcEsq;
    }

    public String getRq7EsqProtusao() {
        return rq7EsqProtusao;
    }

    public void setRq7EsqProtusao(String rq7EsqProtusao) {
        this.rq7EsqProtusao = rq7EsqProtusao;
    }

    public String getRq8ADir() {
        return rq8ADir;
    }

    public void setRq8ADir(String rq8ADir) {
        this.rq8ADir = rq8ADir;
    }

    public String getRq8AEsq() {
        return rq8AEsq;
    }

    public void setRq8AEsq(String rq8AEsq) {
        this.rq8AEsq = rq8AEsq;
    }

    public String getRq8BDir() {
        return rq8BDir;
    }

    public void setRq8BDir(String rq8BDir) {
        this.rq8BDir = rq8BDir;
    }

    public String getRq8BEsq() {
        return rq8BEsq;
    }

    public void setRq8BEsq(String rq8BEsq) {
        this.rq8BEsq = rq8BEsq;
    }

    public String getRq8CDir() {
        return rq8CDir;
    }

    public void setRq8CDir(String rq8CDir) {
        this.rq8CDir = rq8CDir;
    }

    public String getRq8CEsq() {
        return rq8CEsq;
    }

    public void setRq8CEsq(String rq8CEsq) {
        this.rq8CEsq = rq8CEsq;
    }

    public String getRq8DDir() {
        return rq8DDir;
    }

    public void setRq8DDir(String rq8DDir) {
        this.rq8DDir = rq8DDir;
    }

    public String getRq8DEsq() {
        return rq8DEsq;
    }

    public void setRq8DEsq(String rq8DEsq) {
        this.rq8DEsq = rq8DEsq;
    }

    public String getRq8EDir() {
        return rq8EDir;
    }

    public void setRq8EDir(String rq8EDir) {
        this.rq8EDir = rq8EDir;
    }

    public String getRq8EEsq() {
        return rq8EEsq;
    }

    public void setRq8EEsq(String rq8EEsq) {
        this.rq8EEsq = rq8EEsq;
    }

    public String getRq8FDir() {
        return rq8FDir;
    }

    public void setRq8FDir(String rq8FDir) {
        this.rq8FDir = rq8FDir;
    }

    public String getRq8FEsq() {
        return rq8FEsq;
    }

    public void setRq8FEsq(String rq8FEsq) {
        this.rq8FEsq = rq8FEsq;
    }

    public String getRq8GDir() {
        return rq8GDir;
    }

    public void setRq8GDir(String rq8GDir) {
        this.rq8GDir = rq8GDir;
    }

    public String getRq8GEsq() {
        return rq8GEsq;
    }

    public void setRq8GEsq(String rq8GEsq) {
        this.rq8GEsq = rq8GEsq;
    }

    public String getRq8HDir() {
        return rq8HDir;
    }

    public void setRq8HDir(String rq8HDir) {
        this.rq8HDir = rq8HDir;
    }

    public String getRq8HEsq() {
        return rq8HEsq;
    }

    public void setRq8HEsq(String rq8HEsq) {
        this.rq8HEsq = rq8HEsq;
    }

    public String getRq9ADir() {
        return rq9ADir;
    }

    public void setRq9ADir(String rq9ADir) {
        this.rq9ADir = rq9ADir;
    }

    public String getRq9AEsq() {
        return rq9AEsq;
    }

    public void setRq9AEsq(String rq9AEsq) {
        this.rq9AEsq = rq9AEsq;
    }

    public String getRq9BDir() {
        return rq9BDir;
    }

    public void setRq9BDir(String rq9BDir) {
        this.rq9BDir = rq9BDir;
    }

    public String getRq9BEsq() {
        return rq9BEsq;
    }

    public void setRq9BEsq(String rq9BEsq) {
        this.rq9BEsq = rq9BEsq;
    }

    public String getRq10ADir() {
        return rq10ADir;
    }

    public void setRq10ADir(String rq10ADir) {
        this.rq10ADir = rq10ADir;
    }

    public String getRq10AEsq() {
        return rq10AEsq;
    }

    public void setRq10AEsq(String rq10AEsq) {
        this.rq10AEsq = rq10AEsq;
    }

    public String getRq10BDir() {
        return rq10BDir;
    }

    public void setRq10BDir(String rq10BDir) {
        this.rq10BDir = rq10BDir;
    }

    public String getRq10BEsq() {
        return rq10BEsq;
    }

    public void setRq10BEsq(String rq10BEsq) {
        this.rq10BEsq = rq10BEsq;
    }

    public Paciente getCodPacienteExame() {
        return codPacienteExame;
    }

    public void setCodPacienteExame(Paciente codPacienteExame) {
        this.codPacienteExame = codPacienteExame;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExameClinico)) {
            return false;
        }
        ExameClinico other = (ExameClinico) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.ExameClinico[ id=" + id + " ]";
    }
    
}
