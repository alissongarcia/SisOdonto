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
 * @author Aragon
 */
@Entity
@Table(name = "DIAGNOSTICO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Diagnostico.findAll", query = "SELECT d FROM Diagnostico d"),
    @NamedQuery(name = "Diagnostico.findById", query = "SELECT d FROM Diagnostico d WHERE d.id = :id"),
    @NamedQuery(name = "Diagnostico.findByD1", query = "SELECT d FROM Diagnostico d WHERE d.d1 = :d1"),
    @NamedQuery(name = "Diagnostico.findByD2", query = "SELECT d FROM Diagnostico d WHERE d.d2 = :d2"),
    @NamedQuery(name = "Diagnostico.findByD3", query = "SELECT d FROM Diagnostico d WHERE d.d3 = :d3"),
    @NamedQuery(name = "Diagnostico.findByD4", query = "SELECT d FROM Diagnostico d WHERE d.d4 = :d4"),
    @NamedQuery(name = "Diagnostico.findByD5", query = "SELECT d FROM Diagnostico d WHERE d.d5 = :d5")})
public class Diagnostico implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "D1")
    private String d1;
    @Basic(optional = false)
    @Column(name = "D2")
    private String d2;
    @Basic(optional = false)
    @Column(name = "D3")
    private String d3;
    @Basic(optional = false)
    @Column(name = "D4")
    private String d4;
    @Basic(optional = false)
    @Column(name = "D5")
    private String d5;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iddiagnostico")
    private List<Paciente> pacienteList;

    public Diagnostico() {
    }

    public Diagnostico(Long id) {
        this.id = id;
    }

    public Diagnostico(Long id, String d1, String d2, String d3, String d4, String d5) {
        this.id = id;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.d4 = d4;
        this.d5 = d5;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getD1() {
        return d1;
    }

    public void setD1(String d1) {
        this.d1 = d1;
    }

    public String getD2() {
        return d2;
    }

    public void setD2(String d2) {
        this.d2 = d2;
    }

    public String getD3() {
        return d3;
    }

    public void setD3(String d3) {
        this.d3 = d3;
    }

    public String getD4() {
        return d4;
    }

    public void setD4(String d4) {
        this.d4 = d4;
    }

    public String getD5() {
        return d5;
    }

    public void setD5(String d5) {
        this.d5 = d5;
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
        if (!(object instanceof Diagnostico)) {
            return false;
        }
        Diagnostico other = (Diagnostico) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Diagnostico[ id=" + id + " ]";
    }
    
}
