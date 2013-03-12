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
@Table(name = "questionario_pessoal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QuestionarioPessoal.findAll", query = "SELECT q FROM QuestionarioPessoal q"),
    @NamedQuery(name = "QuestionarioPessoal.findById", query = "SELECT q FROM QuestionarioPessoal q WHERE q.id = :id"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp1", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp1 = :rqp1"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp2", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp2 = :rqp2"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp4", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp4 = :rqp4"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp5", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp5 = :rqp5"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp6", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp6 = :rqp6"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp7", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp7 = :rqp7"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp8", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp8 = :rqp8"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp9", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp9 = :rqp9"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp10", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp10 = :rqp10"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp11", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp11 = :rqp11"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp12", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp12 = :rqp12"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp13", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp13 = :rqp13"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp15A", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp15A = :rqp15A"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp15B", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp15B = :rqp15B"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp15C", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp15C = :rqp15C"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp15D", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp15D = :rqp15D"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp15E", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp15E = :rqp15E"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp15F", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp15F = :rqp15F"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp15G", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp15G = :rqp15G"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp16A", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp16A = :rqp16A"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp16B", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp16B = :rqp16B"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp16C", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp16C = :rqp16C"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp16D", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp16D = :rqp16D"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp18", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp18 = :rqp18"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp17A", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp17A = :rqp17A"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp17B", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp17B = :rqp17B"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp19A", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp19A = :rqp19A"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp19B", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp19B = :rqp19B"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp19C", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp19C = :rqp19C"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp19D", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp19D = :rqp19D"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp19E", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp19E = :rqp19E"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp19F", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp19F = :rqp19F"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp19G", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp19G = :rqp19G"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp19H", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp19H = :rqp19H"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp19I", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp19I = :rqp19I"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp19J", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp19J = :rqp19J"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp19K", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp19K = :rqp19K"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp19L", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp19L = :rqp19L"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp20A", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp20A = :rqp20A"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp20B", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp20B = :rqp20B"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp20C", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp20C = :rqp20C"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp20D", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp20D = :rqp20D"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp20E", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp20E = :rqp20E"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp20F", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp20F = :rqp20F"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp20G", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp20G = :rqp20G"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp20H", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp20H = :rqp20H"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp20I", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp20I = :rqp20I"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp20J", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp20J = :rqp20J"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp20K", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp20K = :rqp20K"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp20L", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp20L = :rqp20L"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp20M", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp20M = :rqp20M"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp20N", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp20N = :rqp20N"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp20O", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp20O = :rqp20O"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp20P", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp20P = :rqp20P"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp20Q", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp20Q = :rqp20Q"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp20R", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp20R = :rqp20R"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp20S", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp20S = :rqp20S"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp20T", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp20T = :rqp20T"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp20U", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp20U = :rqp20U"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp20V", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp20V = :rqp20V"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp20W", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp20W = :rqp20W"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp20X", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp20X = :rqp20X"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp20Y", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp20Y = :rqp20Y"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp20Z", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp20Z = :rqp20Z"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp20Aa", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp20Aa = :rqp20Aa"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp20Bb", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp20Bb = :rqp20Bb"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp20Cc", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp20Cc = :rqp20Cc"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp20Dd", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp20Dd = :rqp20Dd"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp20Ee", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp20Ee = :rqp20Ee"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp21", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp21 = :rqp21"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp22", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp22 = :rqp22"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp23Dia", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp23Dia = :rqp23Dia"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp23Mes", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp23Mes = :rqp23Mes"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp23Ano", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp23Ano = :rqp23Ano"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp24", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp24 = :rqp24"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp25", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp25 = :rqp25"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp26", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp26 = :rqp26"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp27", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp27 = :rqp27"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp28A", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp28A = :rqp28A"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp28B", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp28B = :rqp28B"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp28C", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp28C = :rqp28C"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp29", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp29 = :rqp29"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp30", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp30 = :rqp30"),
    @NamedQuery(name = "QuestionarioPessoal.findByRqp31", query = "SELECT q FROM QuestionarioPessoal q WHERE q.rqp31 = :rqp31")})
public class QuestionarioPessoal implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "rqp1")
    private String rqp1;
    @Column(name = "rqp2")
    private String rqp2;
    @Column(name = "rqp4")
    private String rqp4;
    @Column(name = "rqp5")
    private String rqp5;
    @Column(name = "rqp6")
    private String rqp6;
    @Column(name = "rqp7")
    private String rqp7;
    @Column(name = "rqp8")
    private String rqp8;
    @Column(name = "rqp9")
    private String rqp9;
    @Column(name = "rqp10")
    private String rqp10;
    @Column(name = "rqp11")
    private String rqp11;
    @Column(name = "rqp12")
    private String rqp12;
    @Column(name = "rqp13")
    private String rqp13;
    @Column(name = "rqp15_a")
    private String rqp15A;
    @Column(name = "rqp15_b")
    private String rqp15B;
    @Column(name = "rqp15_c")
    private String rqp15C;
    @Column(name = "rqp15_d")
    private String rqp15D;
    @Column(name = "rqp15_e")
    private String rqp15E;
    @Column(name = "rqp15_f")
    private String rqp15F;
    @Column(name = "rqp15_g")
    private String rqp15G;
    @Column(name = "rqp16_a")
    private String rqp16A;
    @Column(name = "rqp16_b")
    private String rqp16B;
    @Column(name = "rqp16_c")
    private String rqp16C;
    @Column(name = "rqp16_d")
    private String rqp16D;
    @Column(name = "rqp18")
    private String rqp18;
    @Column(name = "rqp17_a")
    private String rqp17A;
    @Column(name = "rqp17_b")
    private String rqp17B;
    @Column(name = "rqp19_a")
    private String rqp19A;
    @Column(name = "rqp19_b")
    private String rqp19B;
    @Column(name = "rqp19_c")
    private String rqp19C;
    @Column(name = "rqp19_d")
    private String rqp19D;
    @Column(name = "rqp19_e")
    private String rqp19E;
    @Column(name = "rqp19_f")
    private String rqp19F;
    @Column(name = "rqp19_g")
    private String rqp19G;
    @Column(name = "rqp19_h")
    private String rqp19H;
    @Column(name = "rqp19_i")
    private String rqp19I;
    @Column(name = "rqp19_j")
    private String rqp19J;
    @Column(name = "rqp19_k")
    private String rqp19K;
    @Column(name = "rqp19_l")
    private String rqp19L;
    @Column(name = "rqp20_a")
    private String rqp20A;
    @Column(name = "rqp20_b")
    private String rqp20B;
    @Column(name = "rqp20_c")
    private String rqp20C;
    @Column(name = "rqp20_d")
    private String rqp20D;
    @Column(name = "rqp20_e")
    private String rqp20E;
    @Column(name = "rqp20_f")
    private String rqp20F;
    @Column(name = "rqp20_g")
    private String rqp20G;
    @Column(name = "rqp20_h")
    private String rqp20H;
    @Column(name = "rqp20_i")
    private String rqp20I;
    @Column(name = "rqp20_j")
    private String rqp20J;
    @Column(name = "rqp20_k")
    private String rqp20K;
    @Column(name = "rqp20_l")
    private String rqp20L;
    @Column(name = "rqp20_m")
    private String rqp20M;
    @Column(name = "rqp20_n")
    private String rqp20N;
    @Column(name = "rqp20_o")
    private String rqp20O;
    @Column(name = "rqp20_p")
    private String rqp20P;
    @Column(name = "rqp20_q")
    private String rqp20Q;
    @Column(name = "rqp20_r")
    private String rqp20R;
    @Column(name = "rqp20_s")
    private String rqp20S;
    @Column(name = "rqp20_t")
    private String rqp20T;
    @Column(name = "rqp20_u")
    private String rqp20U;
    @Column(name = "rqp20_v")
    private String rqp20V;
    @Column(name = "rqp20_w")
    private String rqp20W;
    @Column(name = "rqp20_x")
    private String rqp20X;
    @Column(name = "rqp20_y")
    private String rqp20Y;
    @Column(name = "rqp20_z")
    private String rqp20Z;
    @Column(name = "rqp20_aa")
    private String rqp20Aa;
    @Column(name = "rqp20_bb")
    private String rqp20Bb;
    @Column(name = "rqp20_cc")
    private String rqp20Cc;
    @Column(name = "rqp20_dd")
    private String rqp20Dd;
    @Column(name = "rqp20_ee")
    private String rqp20Ee;
    @Column(name = "rqp21")
    private String rqp21;
    @Column(name = "rqp22")
    private String rqp22;
    @Column(name = "rqp23_dia")
    private String rqp23Dia;
    @Column(name = "rqp23_mes")
    private String rqp23Mes;
    @Column(name = "rqp23_ano")
    private String rqp23Ano;
    @Column(name = "rqp24")
    private String rqp24;
    @Column(name = "rqp25")
    private String rqp25;
    @Column(name = "rqp26")
    private String rqp26;
    @Column(name = "rqp27")
    private String rqp27;
    @Column(name = "rqp28_a")
    private String rqp28A;
    @Column(name = "rqp28_b")
    private String rqp28B;
    @Column(name = "rqp28_c")
    private String rqp28C;
    @Column(name = "rqp29")
    private String rqp29;
    @Column(name = "rqp30")
    private String rqp30;
    @Column(name = "rqp31")
    private String rqp31;
    @JoinColumn(name = "cod_paciente", referencedColumnName = "id")
    @ManyToOne
    private Paciente codPaciente;

    public QuestionarioPessoal() {
    }

    public QuestionarioPessoal(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRqp1() {
        return rqp1;
    }

    public void setRqp1(String rqp1) {
        this.rqp1 = rqp1;
    }

    public String getRqp2() {
        return rqp2;
    }

    public void setRqp2(String rqp2) {
        this.rqp2 = rqp2;
    }

    public String getRqp4() {
        return rqp4;
    }

    public void setRqp4(String rqp4) {
        this.rqp4 = rqp4;
    }

    public String getRqp5() {
        return rqp5;
    }

    public void setRqp5(String rqp5) {
        this.rqp5 = rqp5;
    }

    public String getRqp6() {
        return rqp6;
    }

    public void setRqp6(String rqp6) {
        this.rqp6 = rqp6;
    }

    public String getRqp7() {
        return rqp7;
    }

    public void setRqp7(String rqp7) {
        this.rqp7 = rqp7;
    }

    public String getRqp8() {
        return rqp8;
    }

    public void setRqp8(String rqp8) {
        this.rqp8 = rqp8;
    }

    public String getRqp9() {
        return rqp9;
    }

    public void setRqp9(String rqp9) {
        this.rqp9 = rqp9;
    }

    public String getRqp10() {
        return rqp10;
    }

    public void setRqp10(String rqp10) {
        this.rqp10 = rqp10;
    }

    public String getRqp11() {
        return rqp11;
    }

    public void setRqp11(String rqp11) {
        this.rqp11 = rqp11;
    }

    public String getRqp12() {
        return rqp12;
    }

    public void setRqp12(String rqp12) {
        this.rqp12 = rqp12;
    }

    public String getRqp13() {
        return rqp13;
    }

    public void setRqp13(String rqp13) {
        this.rqp13 = rqp13;
    }

    public String getRqp15A() {
        return rqp15A;
    }

    public void setRqp15A(String rqp15A) {
        this.rqp15A = rqp15A;
    }

    public String getRqp15B() {
        return rqp15B;
    }

    public void setRqp15B(String rqp15B) {
        this.rqp15B = rqp15B;
    }

    public String getRqp15C() {
        return rqp15C;
    }

    public void setRqp15C(String rqp15C) {
        this.rqp15C = rqp15C;
    }

    public String getRqp15D() {
        return rqp15D;
    }

    public void setRqp15D(String rqp15D) {
        this.rqp15D = rqp15D;
    }

    public String getRqp15E() {
        return rqp15E;
    }

    public void setRqp15E(String rqp15E) {
        this.rqp15E = rqp15E;
    }

    public String getRqp15F() {
        return rqp15F;
    }

    public void setRqp15F(String rqp15F) {
        this.rqp15F = rqp15F;
    }

    public String getRqp15G() {
        return rqp15G;
    }

    public void setRqp15G(String rqp15G) {
        this.rqp15G = rqp15G;
    }

    public String getRqp16A() {
        return rqp16A;
    }

    public void setRqp16A(String rqp16A) {
        this.rqp16A = rqp16A;
    }

    public String getRqp16B() {
        return rqp16B;
    }

    public void setRqp16B(String rqp16B) {
        this.rqp16B = rqp16B;
    }

    public String getRqp16C() {
        return rqp16C;
    }

    public void setRqp16C(String rqp16C) {
        this.rqp16C = rqp16C;
    }

    public String getRqp16D() {
        return rqp16D;
    }

    public void setRqp16D(String rqp16D) {
        this.rqp16D = rqp16D;
    }

    public String getRqp18() {
        return rqp18;
    }

    public void setRqp18(String rqp18) {
        this.rqp18 = rqp18;
    }

    public String getRqp17A() {
        return rqp17A;
    }

    public void setRqp17A(String rqp17A) {
        this.rqp17A = rqp17A;
    }

    public String getRqp17B() {
        return rqp17B;
    }

    public void setRqp17B(String rqp17B) {
        this.rqp17B = rqp17B;
    }

    public String getRqp19A() {
        return rqp19A;
    }

    public void setRqp19A(String rqp19A) {
        this.rqp19A = rqp19A;
    }

    public String getRqp19B() {
        return rqp19B;
    }

    public void setRqp19B(String rqp19B) {
        this.rqp19B = rqp19B;
    }

    public String getRqp19C() {
        return rqp19C;
    }

    public void setRqp19C(String rqp19C) {
        this.rqp19C = rqp19C;
    }

    public String getRqp19D() {
        return rqp19D;
    }

    public void setRqp19D(String rqp19D) {
        this.rqp19D = rqp19D;
    }

    public String getRqp19E() {
        return rqp19E;
    }

    public void setRqp19E(String rqp19E) {
        this.rqp19E = rqp19E;
    }

    public String getRqp19F() {
        return rqp19F;
    }

    public void setRqp19F(String rqp19F) {
        this.rqp19F = rqp19F;
    }

    public String getRqp19G() {
        return rqp19G;
    }

    public void setRqp19G(String rqp19G) {
        this.rqp19G = rqp19G;
    }

    public String getRqp19H() {
        return rqp19H;
    }

    public void setRqp19H(String rqp19H) {
        this.rqp19H = rqp19H;
    }

    public String getRqp19I() {
        return rqp19I;
    }

    public void setRqp19I(String rqp19I) {
        this.rqp19I = rqp19I;
    }

    public String getRqp19J() {
        return rqp19J;
    }

    public void setRqp19J(String rqp19J) {
        this.rqp19J = rqp19J;
    }

    public String getRqp19K() {
        return rqp19K;
    }

    public void setRqp19K(String rqp19K) {
        this.rqp19K = rqp19K;
    }

    public String getRqp19L() {
        return rqp19L;
    }

    public void setRqp19L(String rqp19L) {
        this.rqp19L = rqp19L;
    }

    public String getRqp20A() {
        return rqp20A;
    }

    public void setRqp20A(String rqp20A) {
        this.rqp20A = rqp20A;
    }

    public String getRqp20B() {
        return rqp20B;
    }

    public void setRqp20B(String rqp20B) {
        this.rqp20B = rqp20B;
    }

    public String getRqp20C() {
        return rqp20C;
    }

    public void setRqp20C(String rqp20C) {
        this.rqp20C = rqp20C;
    }

    public String getRqp20D() {
        return rqp20D;
    }

    public void setRqp20D(String rqp20D) {
        this.rqp20D = rqp20D;
    }

    public String getRqp20E() {
        return rqp20E;
    }

    public void setRqp20E(String rqp20E) {
        this.rqp20E = rqp20E;
    }

    public String getRqp20F() {
        return rqp20F;
    }

    public void setRqp20F(String rqp20F) {
        this.rqp20F = rqp20F;
    }

    public String getRqp20G() {
        return rqp20G;
    }

    public void setRqp20G(String rqp20G) {
        this.rqp20G = rqp20G;
    }

    public String getRqp20H() {
        return rqp20H;
    }

    public void setRqp20H(String rqp20H) {
        this.rqp20H = rqp20H;
    }

    public String getRqp20I() {
        return rqp20I;
    }

    public void setRqp20I(String rqp20I) {
        this.rqp20I = rqp20I;
    }

    public String getRqp20J() {
        return rqp20J;
    }

    public void setRqp20J(String rqp20J) {
        this.rqp20J = rqp20J;
    }

    public String getRqp20K() {
        return rqp20K;
    }

    public void setRqp20K(String rqp20K) {
        this.rqp20K = rqp20K;
    }

    public String getRqp20L() {
        return rqp20L;
    }

    public void setRqp20L(String rqp20L) {
        this.rqp20L = rqp20L;
    }

    public String getRqp20M() {
        return rqp20M;
    }

    public void setRqp20M(String rqp20M) {
        this.rqp20M = rqp20M;
    }

    public String getRqp20N() {
        return rqp20N;
    }

    public void setRqp20N(String rqp20N) {
        this.rqp20N = rqp20N;
    }

    public String getRqp20O() {
        return rqp20O;
    }

    public void setRqp20O(String rqp20O) {
        this.rqp20O = rqp20O;
    }

    public String getRqp20P() {
        return rqp20P;
    }

    public void setRqp20P(String rqp20P) {
        this.rqp20P = rqp20P;
    }

    public String getRqp20Q() {
        return rqp20Q;
    }

    public void setRqp20Q(String rqp20Q) {
        this.rqp20Q = rqp20Q;
    }

    public String getRqp20R() {
        return rqp20R;
    }

    public void setRqp20R(String rqp20R) {
        this.rqp20R = rqp20R;
    }

    public String getRqp20S() {
        return rqp20S;
    }

    public void setRqp20S(String rqp20S) {
        this.rqp20S = rqp20S;
    }

    public String getRqp20T() {
        return rqp20T;
    }

    public void setRqp20T(String rqp20T) {
        this.rqp20T = rqp20T;
    }

    public String getRqp20U() {
        return rqp20U;
    }

    public void setRqp20U(String rqp20U) {
        this.rqp20U = rqp20U;
    }

    public String getRqp20V() {
        return rqp20V;
    }

    public void setRqp20V(String rqp20V) {
        this.rqp20V = rqp20V;
    }

    public String getRqp20W() {
        return rqp20W;
    }

    public void setRqp20W(String rqp20W) {
        this.rqp20W = rqp20W;
    }

    public String getRqp20X() {
        return rqp20X;
    }

    public void setRqp20X(String rqp20X) {
        this.rqp20X = rqp20X;
    }

    public String getRqp20Y() {
        return rqp20Y;
    }

    public void setRqp20Y(String rqp20Y) {
        this.rqp20Y = rqp20Y;
    }

    public String getRqp20Z() {
        return rqp20Z;
    }

    public void setRqp20Z(String rqp20Z) {
        this.rqp20Z = rqp20Z;
    }

    public String getRqp20Aa() {
        return rqp20Aa;
    }

    public void setRqp20Aa(String rqp20Aa) {
        this.rqp20Aa = rqp20Aa;
    }

    public String getRqp20Bb() {
        return rqp20Bb;
    }

    public void setRqp20Bb(String rqp20Bb) {
        this.rqp20Bb = rqp20Bb;
    }

    public String getRqp20Cc() {
        return rqp20Cc;
    }

    public void setRqp20Cc(String rqp20Cc) {
        this.rqp20Cc = rqp20Cc;
    }

    public String getRqp20Dd() {
        return rqp20Dd;
    }

    public void setRqp20Dd(String rqp20Dd) {
        this.rqp20Dd = rqp20Dd;
    }

    public String getRqp20Ee() {
        return rqp20Ee;
    }

    public void setRqp20Ee(String rqp20Ee) {
        this.rqp20Ee = rqp20Ee;
    }

    public String getRqp21() {
        return rqp21;
    }

    public void setRqp21(String rqp21) {
        this.rqp21 = rqp21;
    }

    public String getRqp22() {
        return rqp22;
    }

    public void setRqp22(String rqp22) {
        this.rqp22 = rqp22;
    }

    public String getRqp23Dia() {
        return rqp23Dia;
    }

    public void setRqp23Dia(String rqp23Dia) {
        this.rqp23Dia = rqp23Dia;
    }

    public String getRqp23Mes() {
        return rqp23Mes;
    }

    public void setRqp23Mes(String rqp23Mes) {
        this.rqp23Mes = rqp23Mes;
    }

    public String getRqp23Ano() {
        return rqp23Ano;
    }

    public void setRqp23Ano(String rqp23Ano) {
        this.rqp23Ano = rqp23Ano;
    }

    public String getRqp24() {
        return rqp24;
    }

    public void setRqp24(String rqp24) {
        this.rqp24 = rqp24;
    }

    public String getRqp25() {
        return rqp25;
    }

    public void setRqp25(String rqp25) {
        this.rqp25 = rqp25;
    }

    public String getRqp26() {
        return rqp26;
    }

    public void setRqp26(String rqp26) {
        this.rqp26 = rqp26;
    }

    public String getRqp27() {
        return rqp27;
    }

    public void setRqp27(String rqp27) {
        this.rqp27 = rqp27;
    }

    public String getRqp28A() {
        return rqp28A;
    }

    public void setRqp28A(String rqp28A) {
        this.rqp28A = rqp28A;
    }

    public String getRqp28B() {
        return rqp28B;
    }

    public void setRqp28B(String rqp28B) {
        this.rqp28B = rqp28B;
    }

    public String getRqp28C() {
        return rqp28C;
    }

    public void setRqp28C(String rqp28C) {
        this.rqp28C = rqp28C;
    }

    public String getRqp29() {
        return rqp29;
    }

    public void setRqp29(String rqp29) {
        this.rqp29 = rqp29;
    }

    public String getRqp30() {
        return rqp30;
    }

    public void setRqp30(String rqp30) {
        this.rqp30 = rqp30;
    }

    public String getRqp31() {
        return rqp31;
    }

    public void setRqp31(String rqp31) {
        this.rqp31 = rqp31;
    }

    public Paciente getCodPaciente() {
        return codPaciente;
    }

    public void setCodPaciente(Paciente codPaciente) {
        this.codPaciente = codPaciente;
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
        if (!(object instanceof QuestionarioPessoal)) {
            return false;
        }
        QuestionarioPessoal other = (QuestionarioPessoal) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.QuestionarioPessoal[ id=" + id + " ]";
    }
    
}
