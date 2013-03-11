/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Carlos
 */
@Entity
@Table(name = "paciente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Paciente.findAll", query = "SELECT p FROM Paciente p"),
    @NamedQuery(name = "Paciente.findById", query = "SELECT p FROM Paciente p WHERE p.id = :id"),
    @NamedQuery(name = "Paciente.findByNome", query = "SELECT p FROM Paciente p WHERE p.nome = :nome"),
    @NamedQuery(name = "Paciente.findByRua", query = "SELECT p FROM Paciente p WHERE p.rua = :rua"),
    @NamedQuery(name = "Paciente.findByBairro", query = "SELECT p FROM Paciente p WHERE p.bairro = :bairro"),
    @NamedQuery(name = "Paciente.findByNumero", query = "SELECT p FROM Paciente p WHERE p.numero = :numero"),
    @NamedQuery(name = "Paciente.findByCidade", query = "SELECT p FROM Paciente p WHERE p.cidade = :cidade"),
    @NamedQuery(name = "Paciente.findByRaca", query = "SELECT p FROM Paciente p WHERE p.raca = :raca"),
    @NamedQuery(name = "Paciente.findByCep", query = "SELECT p FROM Paciente p WHERE p.cep = :cep"),
    @NamedQuery(name = "Paciente.findByCpf", query = "SELECT p FROM Paciente p WHERE p.cpf = :cpf"),
    @NamedQuery(name = "Paciente.findByUf", query = "SELECT p FROM Paciente p WHERE p.uf = :uf"),
    @NamedQuery(name = "Paciente.findByTelefone", query = "SELECT p FROM Paciente p WHERE p.telefone = :telefone"),
    @NamedQuery(name = "Paciente.findByCelular", query = "SELECT p FROM Paciente p WHERE p.celular = :celular"),
    @NamedQuery(name = "Paciente.findBySexo", query = "SELECT p FROM Paciente p WHERE p.sexo = :sexo"),
    @NamedQuery(name = "Paciente.findByIdade", query = "SELECT p FROM Paciente p WHERE p.idade = :idade"),
    @NamedQuery(name = "Paciente.findByNaturalidade", query = "SELECT p FROM Paciente p WHERE p.naturalidade = :naturalidade"),
    @NamedQuery(name = "Paciente.findByNacionalidade", query = "SELECT p FROM Paciente p WHERE p.nacionalidade = :nacionalidade")})

public class Paciente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "RUA")
    private String rua;
    @Column(name = "BAIRRO")
    private String bairro;
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "CIDADE")
    private String cidade;
    @Column(name = "RACA")
    private String raca;
    @Column(name = "CEP")
    private String cep;
    @Column(name = "CPF")
    private String cpf;
    @Column(name = "UF")
    private String uf;
    @Column(name = "TELEFONE")
    private String telefone;
    @Column(name = "CELULAR")
    private String celular;
    @Column(name = "SEXO")
    private String sexo;
    @Column(name = "IDADE")
    private Integer idade;
    @Column(name = "NATURALIDADE")
    private String naturalidade;
    @Column(name = "NACIONALIDADE")
    private String nacionalidade;
    @OneToMany(mappedBy = "codPaciente")
    private List<QuestionarioPessoal> questionarioPessoalList;
    @OneToMany(mappedBy = "codPacienteExame")
    private List<ExameClinico> exameClinicoList;
    @OneToMany(mappedBy = "codPacienteDiag")
    private List<Diagnostico> diagnosticoList;
    

    public Paciente() {
    }

    public Paciente(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
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

    @XmlTransient
    public List<ExameClinico> getExameClinicoList() {
        return exameClinicoList;
    }

    public void setExameClinicoList(List<ExameClinico> exameClinicoList) {
        this.exameClinicoList = exameClinicoList;
    }

    @XmlTransient
    public List<Diagnostico> getDiagnosticoList() {
        return diagnosticoList;
    }

    public void setDiagnosticoList(List<Diagnostico> diagnosticoList) {
        this.diagnosticoList = diagnosticoList;
    }

    @XmlTransient
    public List<QuestionarioPessoal> getQuestionarioPessoalList() {
        return questionarioPessoalList;
    }

    public void setQuestionarioPessoalList(List<QuestionarioPessoal> questionarioPessoalList) {
        this.questionarioPessoalList = questionarioPessoalList;
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
        return this.nome;
    }
}