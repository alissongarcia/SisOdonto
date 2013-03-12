/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author alisson
 */
@Entity
@Table(name = "resposta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Resposta.findAll", query = "SELECT r FROM Resposta r"),
    @NamedQuery(name = "Resposta.findById", query = "SELECT r FROM Resposta r WHERE r.id = :id"),
    @NamedQuery(name = "Resposta.findByRq1", query = "SELECT r FROM Resposta r WHERE r.rq1 = :rq1"),
    @NamedQuery(name = "Resposta.findByRq2", query = "SELECT r FROM Resposta r WHERE r.rq2 = :rq2"),
    @NamedQuery(name = "Resposta.findByRq3", query = "SELECT r FROM Resposta r WHERE r.rq3 = :rq3"),
    @NamedQuery(name = "Resposta.findByRq4", query = "SELECT r FROM Resposta r WHERE r.rq4 = :rq4"),
    @NamedQuery(name = "Resposta.findByRq5", query = "SELECT r FROM Resposta r WHERE r.rq5 = :rq5"),
    @NamedQuery(name = "Resposta.findByRq6", query = "SELECT r FROM Resposta r WHERE r.rq6 = :rq6"),
    @NamedQuery(name = "Resposta.findByRq7", query = "SELECT r FROM Resposta r WHERE r.rq7 = :rq7"),
    @NamedQuery(name = "Resposta.findByRq8", query = "SELECT r FROM Resposta r WHERE r.rq8 = :rq8"),
    @NamedQuery(name = "Resposta.findByRq9", query = "SELECT r FROM Resposta r WHERE r.rq9 = :rq9"),
    @NamedQuery(name = "Resposta.findByRq10", query = "SELECT r FROM Resposta r WHERE r.rq10 = :rq10"),
    @NamedQuery(name = "Resposta.findByRq11", query = "SELECT r FROM Resposta r WHERE r.rq11 = :rq11"),
    @NamedQuery(name = "Resposta.findByRq12", query = "SELECT r FROM Resposta r WHERE r.rq12 = :rq12"),
    @NamedQuery(name = "Resposta.findByRq13", query = "SELECT r FROM Resposta r WHERE r.rq13 = :rq13"),
    @NamedQuery(name = "Resposta.findByRq14", query = "SELECT r FROM Resposta r WHERE r.rq14 = :rq14"),
    @NamedQuery(name = "Resposta.findByRq15", query = "SELECT r FROM Resposta r WHERE r.rq15 = :rq15"),
    @NamedQuery(name = "Resposta.findByRq16", query = "SELECT r FROM Resposta r WHERE r.rq16 = :rq16"),
    @NamedQuery(name = "Resposta.findByRq17", query = "SELECT r FROM Resposta r WHERE r.rq17 = :rq17"),
    @NamedQuery(name = "Resposta.findByRq18", query = "SELECT r FROM Resposta r WHERE r.rq18 = :rq18"),
    @NamedQuery(name = "Resposta.findByRq19", query = "SELECT r FROM Resposta r WHERE r.rq19 = :rq19"),
    @NamedQuery(name = "Resposta.findByRq20", query = "SELECT r FROM Resposta r WHERE r.rq20 = :rq20"),
    @NamedQuery(name = "Resposta.findByRq21", query = "SELECT r FROM Resposta r WHERE r.rq21 = :rq21"),
    @NamedQuery(name = "Resposta.findByRq22", query = "SELECT r FROM Resposta r WHERE r.rq22 = :rq22"),
    @NamedQuery(name = "Resposta.findByRq23", query = "SELECT r FROM Resposta r WHERE r.rq23 = :rq23"),
    @NamedQuery(name = "Resposta.findByRq24", query = "SELECT r FROM Resposta r WHERE r.rq24 = :rq24"),
    @NamedQuery(name = "Resposta.findByRq25", query = "SELECT r FROM Resposta r WHERE r.rq25 = :rq25"),
    @NamedQuery(name = "Resposta.findByRq26", query = "SELECT r FROM Resposta r WHERE r.rq26 = :rq26")})
public class Resposta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "rq1")
    private String rq1;
    @Column(name = "rq2")
    private String rq2;
    @Column(name = "rq3")
    private String rq3;
    @Column(name = "rq4")
    private String rq4;
    @Column(name = "rq5")
    private String rq5;
    @Column(name = "rq6")
    private String rq6;
    @Column(name = "rq7")
    private String rq7;
    @Column(name = "rq8")
    private String rq8;
    @Column(name = "rq9")
    private String rq9;
    @Column(name = "rq10")
    private String rq10;
    @Column(name = "rq11")
    private String rq11;
    @Column(name = "rq12")
    private String rq12;
    @Column(name = "rq13")
    private String rq13;
    @Column(name = "rq14")
    private String rq14;
    @Column(name = "rq15")
    private String rq15;
    @Column(name = "rq16")
    private String rq16;
    @Column(name = "rq17")
    private String rq17;
    @Column(name = "rq18")
    private String rq18;
    @Column(name = "rq19")
    private String rq19;
    @Column(name = "rq20")
    private String rq20;
    @Column(name = "rq21")
    private String rq21;
    @Column(name = "rq22")
    private String rq22;
    @Column(name = "rq23")
    private String rq23;
    @Column(name = "rq24")
    private String rq24;
    @Column(name = "rq25")
    private String rq25;
    @Column(name = "rq26")
    private String rq26;
    @OneToMany(mappedBy = "codresposta")
    private List<Paciente> pacienteList;

    public Resposta() {
    }

    public Resposta(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRq1() {
        return rq1;
    }

    public void setRq1(String rq1) {
        this.rq1 = rq1;
    }

    public String getRq2() {
        return rq2;
    }

    public void setRq2(String rq2) {
        this.rq2 = rq2;
    }

    public String getRq3() {
        return rq3;
    }

    public void setRq3(String rq3) {
        this.rq3 = rq3;
    }

    public String getRq4() {
        return rq4;
    }

    public void setRq4(String rq4) {
        this.rq4 = rq4;
    }

    public String getRq5() {
        return rq5;
    }

    public void setRq5(String rq5) {
        this.rq5 = rq5;
    }

    public String getRq6() {
        return rq6;
    }

    public void setRq6(String rq6) {
        this.rq6 = rq6;
    }

    public String getRq7() {
        return rq7;
    }

    public void setRq7(String rq7) {
        this.rq7 = rq7;
    }

    public String getRq8() {
        return rq8;
    }

    public void setRq8(String rq8) {
        this.rq8 = rq8;
    }

    public String getRq9() {
        return rq9;
    }

    public void setRq9(String rq9) {
        this.rq9 = rq9;
    }

    public String getRq10() {
        return rq10;
    }

    public void setRq10(String rq10) {
        this.rq10 = rq10;
    }

    public String getRq11() {
        return rq11;
    }

    public void setRq11(String rq11) {
        this.rq11 = rq11;
    }

    public String getRq12() {
        return rq12;
    }

    public void setRq12(String rq12) {
        this.rq12 = rq12;
    }

    public String getRq13() {
        return rq13;
    }

    public void setRq13(String rq13) {
        this.rq13 = rq13;
    }

    public String getRq14() {
        return rq14;
    }

    public void setRq14(String rq14) {
        this.rq14 = rq14;
    }

    public String getRq15() {
        return rq15;
    }

    public void setRq15(String rq15) {
        this.rq15 = rq15;
    }

    public String getRq16() {
        return rq16;
    }

    public void setRq16(String rq16) {
        this.rq16 = rq16;
    }

    public String getRq17() {
        return rq17;
    }

    public void setRq17(String rq17) {
        this.rq17 = rq17;
    }

    public String getRq18() {
        return rq18;
    }

    public void setRq18(String rq18) {
        this.rq18 = rq18;
    }

    public String getRq19() {
        return rq19;
    }

    public void setRq19(String rq19) {
        this.rq19 = rq19;
    }

    public String getRq20() {
        return rq20;
    }

    public void setRq20(String rq20) {
        this.rq20 = rq20;
    }

    public String getRq21() {
        return rq21;
    }

    public void setRq21(String rq21) {
        this.rq21 = rq21;
    }

    public String getRq22() {
        return rq22;
    }

    public void setRq22(String rq22) {
        this.rq22 = rq22;
    }

    public String getRq23() {
        return rq23;
    }

    public void setRq23(String rq23) {
        this.rq23 = rq23;
    }

    public String getRq24() {
        return rq24;
    }

    public void setRq24(String rq24) {
        this.rq24 = rq24;
    }

    public String getRq25() {
        return rq25;
    }

    public void setRq25(String rq25) {
        this.rq25 = rq25;
    }

    public String getRq26() {
        return rq26;
    }

    public void setRq26(String rq26) {
        this.rq26 = rq26;
    }

    @XmlTransient
    public List<Paciente> getPacienteList() {
        return pacienteList;
    }

    public void setPacienteList(List<Paciente> pacienteList) {
        this.pacienteList = pacienteList;
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
        if (!(object instanceof Resposta)) {
            return false;
        }
        Resposta other = (Resposta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Resposta[ id=" + id + " ]";
    }
    
}
