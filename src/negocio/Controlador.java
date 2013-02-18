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
    
    String diagnostico_GrupoI = "";
    String diagnostico_GrupoII = "";
    
    int somaqE8 = 0;
    int somaqE10 = 0;
    int rqE4a, rqE4b, rqE4c, rqE4d;
    
    
    public Controlador(){
        grupo_1 = new Grupo_I();
        grupo_2 = new Grupo_II();
        emf = new JPAUtil();
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
            String resposta24, String resposta25, String resposta26){
        
        resposta = new Resposta();
        
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
        
        
        
         diagnostico = new Diagnostico();
        diagnostico.setD1(diagnostico_GrupoI);
        
        try {
            
            daoDiagnostico.create(diagnostico);            
        } catch (Exception e) {
        }
        
    }
    
    public String grupo_I(String q3, String QE8AD, String QE8AE, String QE8BD, String QE8BE, String QE8CD, String QE8CE,
                        String QE8DD, String QE8DE, String QE8ED, String QE8EE, String QE8FD, String QE8FE, String QE8GD, 
                        String QE8GE, String QE8HD, String QE8HE, String QE10AD, String QE10AE, String QE10BD, String QE10BE, 
                        String q1, String rq4a, String rq4b, String rq4c, String rq4d){
                
                //QE8 - Dor muscular extra-oral com palpação
                // A                
                //QE8AD = ComboBoxQE8AD.getSelectedItem().toString();
                if (!"O".equals(QE8AD)) {
                    somaqE8++;
                }

                //QE8AE = ComboBoxQE8AE.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE8AE)) {
                    somaqE8++;
                }
                // B                
                //QE8BD = ComboBoxQE8BD.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE8BD)) {
                    somaqE8++;
                }
                //QE8BE = ComboBoxQE8BE.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE8BE)) {
                    somaqE8++;
                }
                // C
                //QE8CD = ComboBoxQE8CD.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE8CD)) {
                    somaqE8++;
                }
                //QE8CE = ComboBoxQE8CE.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE8CE)) {
                    somaqE8++;
                }
                
                // D
                //QE8DD = ComboBoxQE8DD.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE8DD)) {
                    somaqE8++;
                }
                
                //QE8DE = ComboBoxQE8DE.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE8DE)) {
                    somaqE8++;
                }
                
                // E
                //QE8ED = ComboBoxQE8ED.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE8ED)) {
                    somaqE8++;
                }
                
                //QE8EE = ComboBoxQE8EE.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE8EE)) {
                    somaqE8++;
                }
                
                // F
                //QE8FD = ComboBoxQE8FD.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE8FD)) {
                    somaqE8++;
                }
                
                //QE8FE = ComboBoxQE8FE.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE8FE)) {
                    somaqE8++;
                }
                
                // G
                //QE8GD = ComboBoxQE8GD.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE8GD)) {
                    somaqE8++;
                }
                
                //QE8GE = ComboBoxQE8GE.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE8GE)) {
                    somaqE8++;
                }
                
                // H
                //QE8HD = ComboBoxQE8HD.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE8HD)) {
                    somaqE8++;
                }
                
                //QE8HE = ComboBoxQE8HE.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE8HE)) {
                    somaqE8++;
                }

                // QE10 - Dor muscular intra-oral com palpação   QE10AD, QE10AE, QE10BD, QE10BE
                //QE10AD = ComboBoxQE10AD.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE10AD)) {
                    somaqE10++;
                }
                //QE10AE = ComboBoxQE10AE.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE10AE)) {
                    somaqE10++;
                }

                //QE10BD = ComboBoxQE10BD.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE10BD)) {
                    somaqE10++;
                }
                //QE10BE = ComboBoxQE10BE.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE10BE)) {
                    somaqE10++;
                }
                
                rqE4a = Integer.parseInt(rq4a);
                rqE4b = Integer.parseInt(rq4b);
                rqE4c = Integer.parseInt(rq4c);
                rqE4d = Integer.parseInt(rq4d);
                
                diagnostico_GrupoI = grupo_1.diagnostico(q3, somaqE8, somaqE10, q1, rqE4a, rqE4b, rqE4c, rqE4d);
                
                return diagnostico_GrupoI;        
    }
    
    public String diagnostico_grupo_II(String rqE5A_Abertura_Dir, String rqE5B_Fecho_Dir, String rqE5A_Medida_Abert_Dir, String rqE5B_Medida_Fecho_Dir, String rqE5C_Direito, String rqE7A_Dir_Excursão_Direita, String rqE7A_Dir_Excursão_Esquerda, String rqE7A_Dir_Protusao, String rqE6_Medida_Excursao_Esquerda, String rqE3_Combo, String rqE3_Campo, String rq14A){
        int rE5A_Med_Abert_Direita;
        int rE5B_Med_Fecho_Direita;
        int rqE6_Med_Excursao_Esquerda;
        
        rE5A_Med_Abert_Direita = Integer.parseInt(rqE5A_Medida_Abert_Dir);
        rE5B_Med_Fecho_Direita = Integer.parseInt(rqE5B_Medida_Fecho_Dir);
        rqE6_Med_Excursao_Esquerda = Integer.parseInt(rqE6_Medida_Excursao_Esquerda);
        
        diagnostico_GrupoII = grupo_2.diagnostico(rqE5A_Abertura_Dir, rE5A_Med_Abert_Direita, rE5B_Med_Fecho_Direita, rqE5B_Fecho_Dir, rqE5C_Direito, rqE7A_Dir_Excursão_Direita, rqE7A_Dir_Excursão_Esquerda, rqE7A_Dir_Protusao, rq14A, rqE4d, rqE4c, rqE4d, rqE6_Med_Excursao_Esquerda, rqE3_Combo);
        return diagnostico_GrupoII;
        
    }
}
