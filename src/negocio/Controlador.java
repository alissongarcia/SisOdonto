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
        paciente.setRua(endereco);
        paciente.setCidade(cidade);
        paciente.setUf(uf);
        paciente.setCep(cep);
        paciente.setTelefone(telefone);
        try {
            daoPaciente.create(paciente);            
        } catch (Exception e) {
        }        
    }
    
    public void diagnosticar(String resposta1, String resposta2, String resposta3, String resposta4, String resposta5, String resposta6, String resposta7,
            String resposta8, String resposta9, String resposta10, String resposta11, String resposta12, String resposta13, String resposta14, String resposta15, String resposta16, 
            String resposta17, String resposta18, String resposta19, String resposta20, String resposta21, String resposta22, String resposta23, 
            String resposta24, String resposta25, String resposta26, int q3,int somaq8,int somaq10,int q1,
            int rq4a,int rq4b,int rq4c,int rq4d){
        
        resposta= new Resposta();
        
        resposta.setRq1(resposta1);
        resposta.setRq2(resposta2);
        resposta.setRq3(resposta3);
        resposta.setRq4(resposta4);
        resposta.setRq5(resposta5);
        resposta.setRq6(resposta6);
        resposta.setRq7(resposta7);
        resposta.setRq8(resposta8);
        resposta.setRq9(resposta9);
        resposta.setRq10(resposta10);
        
        resposta.setRq11(resposta11);
        resposta.setRq12(resposta12);
        resposta.setRq13(resposta13);
        resposta.setRq14(resposta14);
        resposta.setRq15(resposta15);
        resposta.setRq16(resposta16);
        resposta.setRq17(resposta17);
        resposta.setRq18(resposta18);
        resposta.setRq19(resposta19);
        resposta.setRq20(resposta20);
        
        resposta.setRq21(resposta21);
        resposta.setRq22(resposta22);
        resposta.setRq23(resposta23);
        resposta.setRq24(resposta24);
        resposta.setRq25(resposta25);
        resposta.setRq26(resposta26);
        
        try {
            daoResposta.create(resposta);
        } catch (Exception e) {
        }       
        
        
        grupo_1.diagnostico(q3, somaq8, somaq10, q1, rq4a, rq4b, rq4c, rq4d);  
        diagnostico = new Diagnostico();
        diagnostico.setD1(grupo_1.diagnostico(q3, somaq8, somaq10, q1, rq4a, rq4b, rq4c, rq4d));
        
        try {
            
            daoDiagnostico.create(diagnostico);            
        } catch (Exception e) {
        }
        
    }
}
