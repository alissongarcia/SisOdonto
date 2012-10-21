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
@Table(name = "RESPOSTA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Resposta.findAll", query = "SELECT r FROM Resposta r"),
    @NamedQuery(name = "Resposta.findById", query = "SELECT r FROM Resposta r WHERE r.id = :id"),
    @NamedQuery(name = "Resposta.findByRq1", query = "SELECT r FROM Resposta r WHERE r.rq1 = :rq1"),
    @NamedQuery(name = "Resposta.findByRq2", query = "SELECT r FROM Resposta r WHERE r.rq2 = :rq2"),
    @NamedQuery(name = "Resposta.findByRq3", query = "SELECT r FROM Resposta r WHERE r.rq3 = :rq3"),
    @NamedQuery(name = "Resposta.findByRq4", query = "SELECT r FROM Resposta r WHERE r.rq4 = :rq4")})
public class Resposta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "RQ1")
    private String rq1;
    @Basic(optional = false)
    @Column(name = "RQ2")
    private String rq2;
    @Basic(optional = false)
    @Column(name = "RQ3")
    private String rq3;
    @Basic(optional = false)
    @Column(name = "RQ4")
    private String rq4;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idresposta")
    private List<Paciente> pacienteList;

    public Resposta() {
    }

    public Resposta(Long id) {
        this.id = id;
    }

    public Resposta(Long id, String rq1, String rq2, String rq3, String rq4) {
        this.id = id;
        this.rq1 = rq1;
        this.rq2 = rq2;
        this.rq3 = rq3;
        this.rq4 = rq4;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
