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
 * @author Aragon
 */
@Entity
@Table(name = "PACIENTE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Paciente.findAll", query = "SELECT p FROM Paciente p"),
    @NamedQuery(name = "Paciente.findById", query = "SELECT p FROM Paciente p WHERE p.id = :id"),
    @NamedQuery(name = "Paciente.findByNome", query = "SELECT p FROM Paciente p WHERE p.nome = :nome"),
    @NamedQuery(name = "Paciente.findByRaca", query = "SELECT p FROM Paciente p WHERE p.raca = :raca"),
    @NamedQuery(name = "Paciente.findBySexo", query = "SELECT p FROM Paciente p WHERE p.sexo = :sexo"),
    @NamedQuery(name = "Paciente.findByIdade", query = "SELECT p FROM Paciente p WHERE p.idade = :idade"),
    @NamedQuery(name = "Paciente.findByNaturalidade", query = "SELECT p FROM Paciente p WHERE p.naturalidade = :naturalidade"),
    @NamedQuery(name = "Paciente.findByNacionalidade", query = "SELECT p FROM Paciente p WHERE p.nacionalidade = :nacionalidade"),
    @NamedQuery(name = "Paciente.findByEndereco", query = "SELECT p FROM Paciente p WHERE p.endereco = :endereco"),
    @NamedQuery(name = "Paciente.findByCidade", query = "SELECT p FROM Paciente p WHERE p.cidade = :cidade"),
    @NamedQuery(name = "Paciente.findByUf", query = "SELECT p FROM Paciente p WHERE p.uf = :uf"),
    @NamedQuery(name = "Paciente.findByCep", query = "SELECT p FROM Paciente p WHERE p.cep = :cep"),
    @NamedQuery(name = "Paciente.findByTelefone", query = "SELECT p FROM Paciente p WHERE p.telefone = :telefone")})
public class Paciente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "NOME")
    private String nome;
    @Basic(optional = false)
    @Column(name = "RACA")
    private String raca;
    @Basic(optional = false)
    @Column(name = "SEXO")
    private String sexo;
    @Basic(optional = false)
    @Column(name = "IDADE")
    private int idade;
    @Basic(optional = false)
    @Column(name = "NATURALIDADE")
    private String naturalidade;
    @Basic(optional = false)
    @Column(name = "NACIONALIDADE")
    private String nacionalidade;
    @Basic(optional = false)
    @Column(name = "ENDERECO")
    private String endereco;
    @Basic(optional = false)
    @Column(name = "CIDADE")
    private String cidade;
    @Basic(optional = false)
    @Column(name = "UF")
    private String uf;
    @Basic(optional = false)
    @Column(name = "CEP")
    private String cep;
    @Basic(optional = false)
    @Column(name = "TELEFONE")
    private String telefone;
    @JoinColumn(name = "IDRESPOSTA", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Resposta idresposta;
    @JoinColumn(name = "IDDIAGNOSTICO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Diagnostico iddiagnostico;

    public Paciente() {
    }

    public Paciente(Long id) {
        this.id = id;
    }

    public Paciente(Long id, String nome, String raca, String sexo, int idade, String naturalidade, String nacionalidade, String endereco, String cidade, String uf, String cep, String telefone) {
        this.id = id;
        this.nome = nome;
        this.raca = raca;
        this.sexo = sexo;
        this.idade = idade;
        this.naturalidade = naturalidade;
        this.nacionalidade = nacionalidade;
        this.endereco = endereco;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.telefone = telefone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Resposta getIdresposta() {
        return idresposta;
    }

    public void setIdresposta(Resposta idresposta) {
        this.idresposta = idresposta;
    }

    public Diagnostico getIddiagnostico() {
        return iddiagnostico;
    }

    public void setIddiagnostico(Diagnostico iddiagnostico) {
        this.iddiagnostico = iddiagnostico;
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
        if (!(object instanceof Paciente)) {
            return false;
        }
        Paciente other = (Paciente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Paciente[ id=" + id + " ]";
    }
    
}
