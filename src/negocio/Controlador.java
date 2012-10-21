/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import dao.DiagnosticoJpaController;
import dao.PacienteJpaController;
import dao.RespostaJpaController;
import modelo.*;
import util.JPAUtil;


/**
 *
 * @author Aragon
 */
public class Controlador {
    
    private PacienteJpaController daoPaciente;
    private DiagnosticoJpaController daoDiagnostico;
    private RespostaJpaController daoResposta;
    private JPAUtil emf;
    private Paciente paciente;
    private Diagnostico diagnostico;
    private Resposta resposta;
    private Grupo_I grupo_1;
    private Grupo_II grupo_2;
    
    
    public Controlador(){
        grupo_1= new Grupo_I();
        emf= new JPAUtil();
        daoPaciente = new PacienteJpaController(emf.getEmf());
        daoDiagnostico= new DiagnosticoJpaController(emf.getEmf());
        daoResposta= new RespostaJpaController(emf.getEmf());
    }
    
    public void cadastrarPaciente(String nome, String raca, String sexo, int idade, String naturalidade, String nacionalidade, 
            String endereco, String cidade, String uf, String cep, String telefone){
        paciente= new Paciente();
        paciente.setNome(nome);
        paciente.setRaca(raca);
        paciente.setSexo(sexo);
        paciente.setIdade(idade);
        paciente.setNaturalidade(naturalidade);
        paciente.setNacionalidade(nacionalidade);
        paciente.setEndereco(endereco);
        paciente.setCidade(cidade);
        paciente.setUf(uf);
        paciente.setCep(cep);
        paciente.setTelefone(telefone);
        daoPaciente.create(paciente);
    }
    
    public void diagnosticar(String rq1, String rq2, String rq3, String rq4,int q3,int somaq8,int somaq10,int q1,
            int rq4a,int rq4b,int rq4c,int rq4d){
        resposta= new Resposta();
        resposta.setRq1(rq1);
        resposta.setRq2(rq2);
        resposta.setRq3(rq3);
        resposta.setRq4(rq4);
        grupo_1.diagnostico(q3, somaq8, somaq10, q1, rq4a, rq4b, rq4c, rq4d);
        
        
    }
    
    
}
