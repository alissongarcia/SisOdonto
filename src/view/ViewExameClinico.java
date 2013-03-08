/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import negocio.Controlador;

import javax.swing.JFrame;
import modelo.*;

/**
 *
 * @author Carlos
 */
public class ViewExameClinico extends JFrame {
    
    private javax.swing.JComboBox ComboBoxQE1;
    private javax.swing.JComboBox ComboBoxQE10ALD;
    private javax.swing.JComboBox ComboBoxQE10ALE;
    private javax.swing.JComboBox ComboBoxQE10BLD;
    private javax.swing.JComboBox ComboBoxQE10BLE;
    private javax.swing.JComboBox ComboBoxQE2ALadoDireito;
    private javax.swing.JComboBox ComboBoxQE2ALadoEsquerdo;
    private javax.swing.JComboBox ComboBoxQE3Abertura;
    private javax.swing.JComboBox ComboBoxQE4CArticular;
    private javax.swing.JComboBox ComboBoxQE4CMuscular;
    private javax.swing.JComboBox ComboBoxQE4DArticular;
    private javax.swing.JComboBox ComboBoxQE4DMuscular;
    private javax.swing.JComboBox ComboBoxQE5ADireito;
    private javax.swing.JComboBox ComboBoxQE5AEsquerdo;
    private javax.swing.JComboBox ComboBoxQE5BDireito;
    private javax.swing.JComboBox ComboBoxQE5BEsquerdo;
    private javax.swing.JComboBox ComboBoxQE5CDireito;
    private javax.swing.JComboBox ComboBoxQE5CEsquerdo;
    private javax.swing.JComboBox ComboBoxQE6AArticular;
    private javax.swing.JComboBox ComboBoxQE6AMuscular;
    private javax.swing.JComboBox ComboBoxQE6BArticular;
    private javax.swing.JComboBox ComboBoxQE6BMuscular;
    private javax.swing.JComboBox ComboBoxQE6CArticular;
    private javax.swing.JComboBox ComboBoxQE6CMuscular;
    private javax.swing.JComboBox ComboBoxQE6DDesvio;
    private javax.swing.JComboBox ComboBoxQE7AExcusãoDireita;
    private javax.swing.JComboBox ComboBoxQE7AExcusãoEsquerda;
    private javax.swing.JComboBox ComboBoxQE7AProtusão;
    private javax.swing.JComboBox ComboBoxQE7BExcusão;
    private javax.swing.JComboBox ComboBoxQE7BExcusãoDireita;
    private javax.swing.JComboBox ComboBoxQE7BExcusãoEsquerda;
    private javax.swing.JComboBox ComboBoxQE8AD;
    private javax.swing.JComboBox ComboBoxQE8AE;
    private javax.swing.JComboBox ComboBoxQE8BD;
    private javax.swing.JComboBox ComboBoxQE8BE;
    private javax.swing.JComboBox ComboBoxQE8CD;
    private javax.swing.JComboBox ComboBoxQE8CE;
    private javax.swing.JComboBox ComboBoxQE8DD;
    private javax.swing.JComboBox ComboBoxQE8DE;
    private javax.swing.JComboBox ComboBoxQE8ED;
    private javax.swing.JComboBox ComboBoxQE8EE;
    private javax.swing.JComboBox ComboBoxQE8FD;
    private javax.swing.JComboBox ComboBoxQE8FE;
    private javax.swing.JComboBox ComboBoxQE8GD;
    private javax.swing.JComboBox ComboBoxQE8GE;
    private javax.swing.JComboBox ComboBoxQE8HD;
    private javax.swing.JComboBox ComboBoxQE8HE;
    private javax.swing.JComboBox ComboBoxQuestao14aQuestionario;
    private javax.swing.JComboBox ComboBoxQuestao14bQuestionario;
    private javax.swing.JComboBox ComboBoxQuestaoQuestionario03;
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JButton botaoDiagnosticar;
    private javax.swing.JTextField campoQE3;
    private javax.swing.JFormattedTextField campoQE4A;
    private javax.swing.JFormattedTextField campoQE4B;
    private javax.swing.JFormattedTextField campoQE4C;
    private javax.swing.JFormattedTextField campoQE4D;
    private javax.swing.JFormattedTextField campoQE5ADireito;
    private javax.swing.JFormattedTextField campoQE5AEsquerdo;
    private javax.swing.JFormattedTextField campoQE5BDireito;
    private javax.swing.JFormattedTextField campoQE5BEsquerdo;
    private javax.swing.JFormattedTextField campoQE6A;
    private javax.swing.JFormattedTextField campoQE6AC;
    private javax.swing.JFormattedTextField campoQE6B;
    private javax.swing.JFormattedTextField campoQE6D;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel labelPerguntas;
    private javax.swing.JLabel labelQ02;
    private javax.swing.JLabel labelQ02Direito;
    private javax.swing.JLabel labelQ02Esquerdo;
    private javax.swing.JLabel labelQuestao3Questionario;
    private javax.swing.JLabel labelQuestionario;
    private javax.swing.JLabel labelQuestionario1;
    private javax.swing.JLabel rotuloAQE8;
    private javax.swing.JLabel rotuloBQE8;
    private javax.swing.JLabel rotuloCQE8;
    private javax.swing.JLabel rotuloDQE8;
    private javax.swing.JLabel rotuloEQE8;
    private javax.swing.JLabel rotuloFQE8;
    private javax.swing.JLabel rotuloGQE8;
    private javax.swing.JLabel rotuloHQE8;
    private javax.swing.JLabel rotuloLDQE10;
    private javax.swing.JLabel rotuloLDQE11;
    private javax.swing.JLabel rotuloLDQE4Articular;
    private javax.swing.JLabel rotuloLDQE4Muscular;
    private javax.swing.JLabel rotuloLDQE5AA;
    private javax.swing.JLabel rotuloLDQE5ADireito;
    private javax.swing.JLabel rotuloLDQE5AEsquerdo;
    private javax.swing.JLabel rotuloLDQE5BB;
    private javax.swing.JLabel rotuloLDQE5BDireito;
    private javax.swing.JLabel rotuloLDQE5BEsquerdo;
    private javax.swing.JLabel rotuloLDQE5CDireito;
    private javax.swing.JLabel rotuloLDQE5CEsquerdo;
    private javax.swing.JLabel rotuloLDQE8;
    private javax.swing.JLabel rotuloLEQE10;
    private javax.swing.JLabel rotuloLEQE11;
    private javax.swing.JLabel rotuloLEQE8;
    private javax.swing.JLabel rotuloQE09;
    private javax.swing.JComboBox rotuloQE09ALD;
    private javax.swing.JComboBox rotuloQE09ALE;
    private javax.swing.JComboBox rotuloQE09BLD;
    private javax.swing.JComboBox rotuloQE09BLE;
    private javax.swing.JLabel rotuloQE10;
    private javax.swing.JLabel rotuloQE10A;
    private javax.swing.JLabel rotuloQE10A1;
    private javax.swing.JLabel rotuloQE10B;
    private javax.swing.JLabel rotuloQE10B1;
    private javax.swing.JLabel rotuloQE3;
    private javax.swing.JLabel rotuloQE3Especifique;
    private javax.swing.JLabel rotuloQE3Tipo;
    private javax.swing.JLabel rotuloQE4;
    private javax.swing.JLabel rotuloQE4A;
    private javax.swing.JLabel rotuloQE4B;
    private javax.swing.JLabel rotuloQE4C;
    private javax.swing.JLabel rotuloQE4D;
    private javax.swing.JLabel rotuloQE5;
    private javax.swing.JLabel rotuloQE5A;
    private javax.swing.JLabel rotuloQE5B;
    private javax.swing.JLabel rotuloQE5C;
    private javax.swing.JLabel rotuloQE6;
    private javax.swing.JLabel rotuloQE6A;
    private javax.swing.JLabel rotuloQE6Articular;
    private javax.swing.JLabel rotuloQE6B;
    private javax.swing.JLabel rotuloQE6C;
    private javax.swing.JLabel rotuloQE6D;
    private javax.swing.JLabel rotuloQE6Desvio;
    private javax.swing.JLabel rotuloQE6Muscular;
    private javax.swing.JLabel rotuloQE7;
    private javax.swing.JLabel rotuloQE7A;
    private javax.swing.JLabel rotuloQE7AExcusãoDireita;
    private javax.swing.JLabel rotuloQE7AExcusãoEsquerda;
    private javax.swing.JLabel rotuloQE7AProtusão;
    private javax.swing.JLabel rotuloQE7B;
    private javax.swing.JLabel rotuloQE7BExcusãoDireita;
    private javax.swing.JLabel rotuloQE7BExcusãoEsquerda;
    private javax.swing.JLabel rotuloQE7BProtusão;
    private javax.swing.JLabel rotuloQE8;
    private javax.swing.JLabel rotuloQuestao01;
    private javax.swing.JLabel rotuloResultado;
    
    private Controlador controlador;
    private QuestionarioPessoal questPessoal;
    private ExameClinico exame;
    private List<Paciente> pacientes = new ArrayList();
    
    
    public ViewExameClinico(){   
        inciar();        
    }
    
    private void inciar() {
        inicializarVariaveis();
        configurações();        
        acoesBotoes();
    }
    
    
    private void inicializarVariaveis() {
        ScrollPane = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        rotuloQE10 = new javax.swing.JLabel();
        rotuloQE10A = new javax.swing.JLabel();
        rotuloQE10B = new javax.swing.JLabel();
        ComboBoxQE10BLD = new javax.swing.JComboBox();
        ComboBoxQE10ALD = new javax.swing.JComboBox();
        rotuloLDQE10 = new javax.swing.JLabel();
        rotuloLEQE10 = new javax.swing.JLabel();
        ComboBoxQE10ALE = new javax.swing.JComboBox();
        ComboBoxQE10BLE = new javax.swing.JComboBox();
        jPanel11 = new javax.swing.JPanel();
        rotuloQE09BLE = new javax.swing.JComboBox();
        rotuloQE09BLD = new javax.swing.JComboBox();
        rotuloQE10B1 = new javax.swing.JLabel();
        rotuloQE10A1 = new javax.swing.JLabel();
        rotuloQE09ALD = new javax.swing.JComboBox();
        rotuloQE09ALE = new javax.swing.JComboBox();
        rotuloLEQE11 = new javax.swing.JLabel();
        rotuloLDQE11 = new javax.swing.JLabel();
        rotuloQE09 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        rotuloQE8 = new javax.swing.JLabel();
        rotuloAQE8 = new javax.swing.JLabel();
        rotuloBQE8 = new javax.swing.JLabel();
        rotuloCQE8 = new javax.swing.JLabel();
        rotuloDQE8 = new javax.swing.JLabel();
        rotuloEQE8 = new javax.swing.JLabel();
        rotuloFQE8 = new javax.swing.JLabel();
        rotuloGQE8 = new javax.swing.JLabel();
        rotuloHQE8 = new javax.swing.JLabel();
        ComboBoxQE8HD = new javax.swing.JComboBox();
        ComboBoxQE8HE = new javax.swing.JComboBox();
        ComboBoxQE8GE = new javax.swing.JComboBox();
        ComboBoxQE8GD = new javax.swing.JComboBox();
        ComboBoxQE8FD = new javax.swing.JComboBox();
        ComboBoxQE8FE = new javax.swing.JComboBox();
        ComboBoxQE8EE = new javax.swing.JComboBox();
        ComboBoxQE8ED = new javax.swing.JComboBox();
        ComboBoxQE8DD = new javax.swing.JComboBox();
        ComboBoxQE8DE = new javax.swing.JComboBox();
        ComboBoxQE8CE = new javax.swing.JComboBox();
        ComboBoxQE8CD = new javax.swing.JComboBox();
        ComboBoxQE8BD = new javax.swing.JComboBox();
        ComboBoxQE8BE = new javax.swing.JComboBox();
        ComboBoxQE8AE = new javax.swing.JComboBox();
        ComboBoxQE8AD = new javax.swing.JComboBox();
        rotuloLDQE8 = new javax.swing.JLabel();
        rotuloLEQE8 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        rotuloQE7 = new javax.swing.JLabel();
        ComboBoxQE7BExcusãoDireita = new javax.swing.JComboBox();
        ComboBoxQE7BExcusãoEsquerda = new javax.swing.JComboBox();
        ComboBoxQE7BExcusão = new javax.swing.JComboBox();
        rotuloQE7BProtusão = new javax.swing.JLabel();
        rotuloQE7BExcusãoEsquerda = new javax.swing.JLabel();
        rotuloQE7BExcusãoDireita = new javax.swing.JLabel();
        rotuloQE7B = new javax.swing.JLabel();
        ComboBoxQE7AExcusãoDireita = new javax.swing.JComboBox();
        ComboBoxQE7AExcusãoEsquerda = new javax.swing.JComboBox();
        ComboBoxQE7AProtusão = new javax.swing.JComboBox();
        rotuloQE7AProtusão = new javax.swing.JLabel();
        rotuloQE7AExcusãoEsquerda = new javax.swing.JLabel();
        rotuloQE7AExcusãoDireita = new javax.swing.JLabel();
        rotuloQE7A = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        rotuloQE6 = new javax.swing.JLabel();
        rotuloQE6A = new javax.swing.JLabel();
        campoQE6A = new javax.swing.JFormattedTextField();
        rotuloQE6Muscular = new javax.swing.JLabel();
        rotuloQE6Articular = new javax.swing.JLabel();
        ComboBoxQE6AArticular = new javax.swing.JComboBox();
        ComboBoxQE6AMuscular = new javax.swing.JComboBox();
        rotuloQE6B = new javax.swing.JLabel();
        campoQE6B = new javax.swing.JFormattedTextField();
        ComboBoxQE6BMuscular = new javax.swing.JComboBox();
        ComboBoxQE6BArticular = new javax.swing.JComboBox();
        ComboBoxQE6CArticular = new javax.swing.JComboBox();
        ComboBoxQE6CMuscular = new javax.swing.JComboBox();
        rotuloQE6C = new javax.swing.JLabel();
        campoQE6AC = new javax.swing.JFormattedTextField();
        rotuloQE6D = new javax.swing.JLabel();
        campoQE6D = new javax.swing.JFormattedTextField();
        ComboBoxQE6DDesvio = new javax.swing.JComboBox();
        rotuloQE6Desvio = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        rotuloQE5 = new javax.swing.JLabel();
        rotuloQE5A = new javax.swing.JLabel();
        rotuloLDQE5ADireito = new javax.swing.JLabel();
        rotuloLDQE5AEsquerdo = new javax.swing.JLabel();
        ComboBoxQE5ADireito = new javax.swing.JComboBox();
        ComboBoxQE5AEsquerdo = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        campoQE5AEsquerdo = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        campoQE5ADireito = new javax.swing.JFormattedTextField();
        rotuloLDQE5AA = new javax.swing.JLabel();
        rotuloQE5B = new javax.swing.JLabel();
        rotuloLDQE5BDireito = new javax.swing.JLabel();
        rotuloLDQE5BEsquerdo = new javax.swing.JLabel();
        ComboBoxQE5BEsquerdo = new javax.swing.JComboBox();
        ComboBoxQE5BDireito = new javax.swing.JComboBox();
        campoQE5BDireito = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        campoQE5BEsquerdo = new javax.swing.JFormattedTextField();
        rotuloLDQE5BB = new javax.swing.JLabel();
        rotuloQE5C = new javax.swing.JLabel();
        rotuloLDQE5CEsquerdo = new javax.swing.JLabel();
        rotuloLDQE5CDireito = new javax.swing.JLabel();
        ComboBoxQE5CDireito = new javax.swing.JComboBox();
        ComboBoxQE5CEsquerdo = new javax.swing.JComboBox();
        jPanel6 = new javax.swing.JPanel();
        rotuloQE4 = new javax.swing.JLabel();
        rotuloQE4A = new javax.swing.JLabel();
        campoQE4A = new javax.swing.JFormattedTextField();
        campoQE4B = new javax.swing.JFormattedTextField();
        rotuloQE4B = new javax.swing.JLabel();
        rotuloQE4C = new javax.swing.JLabel();
        campoQE4C = new javax.swing.JFormattedTextField();
        campoQE4D = new javax.swing.JFormattedTextField();
        rotuloQE4D = new javax.swing.JLabel();
        ComboBoxQE4DMuscular = new javax.swing.JComboBox();
        ComboBoxQE4CMuscular = new javax.swing.JComboBox();
        rotuloLDQE4Muscular = new javax.swing.JLabel();
        rotuloLDQE4Articular = new javax.swing.JLabel();
        ComboBoxQE4CArticular = new javax.swing.JComboBox();
        ComboBoxQE4DArticular = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        rotuloQE3 = new javax.swing.JLabel();
        ComboBoxQE3Abertura = new javax.swing.JComboBox();
        rotuloQE3Tipo = new javax.swing.JLabel();
        campoQE3 = new javax.swing.JTextField();
        rotuloQE3Especifique = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        labelQ02 = new javax.swing.JLabel();
        ComboBoxQE2ALadoDireito = new javax.swing.JComboBox();
        ComboBoxQE2ALadoEsquerdo = new javax.swing.JComboBox();
        labelQ02Direito = new javax.swing.JLabel();
        labelQ02Esquerdo = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        labelPerguntas = new javax.swing.JLabel();
        rotuloQuestao01 = new javax.swing.JLabel();
        ComboBoxQE1 = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        labelQuestionario1 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        botaoDiagnosticar = new javax.swing.JButton();
        rotuloResultado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        labelQuestionario = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        labelQuestao3Questionario = new javax.swing.JLabel();
        ComboBoxQuestaoQuestionario03 = new javax.swing.JComboBox();
        jPanel17 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        ComboBoxQuestao14aQuestionario = new javax.swing.JComboBox();
        jPanel18 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        ComboBoxQuestao14bQuestionario = new javax.swing.JComboBox();
        
        controlador = new Controlador();
        questPessoal = new QuestionarioPessoal();        
        preencherComboPaciente();
    }

    private void configurações() {
        
        
       setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rotuloQE10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloQE10.setText("Questão 10 - Dor muscular intra-oral com palpação");

        rotuloQE10A.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloQE10A.setText("Área do pterigóideo lateral (atrás dos molares superiores)");

        rotuloQE10B.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloQE10B.setText("Tendão do temporal (infra-bucal)");

        ComboBoxQE10BLD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));

        ComboBoxQE10ALD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));

        rotuloLDQE10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloLDQE10.setText("Lado Direito");

        rotuloLEQE10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloLEQE10.setText("Lado Esquerdo");

        ComboBoxQE10ALE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));

        ComboBoxQE10BLE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rotuloQE10)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rotuloQE10A)
                            .addComponent(rotuloQE10B))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rotuloLDQE10)
                            .addComponent(ComboBoxQE10ALD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxQE10BLD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboBoxQE10BLE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotuloLEQE10)
                            .addComponent(ComboBoxQE10ALE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotuloQE10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloLDQE10)
                    .addComponent(rotuloLEQE10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rotuloQE10A)
                            .addComponent(ComboBoxQE10ALD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rotuloQE10B)
                            .addComponent(ComboBoxQE10BLD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(ComboBoxQE10ALE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComboBoxQE10BLE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rotuloQE09BLE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));

        rotuloQE09BLD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));

        rotuloQE10B1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloQE10B1.setText("Ligamento posterior(dentro do ouvido)");

        rotuloQE10A1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloQE10A1.setText("Pólo lateral(por fora)");

        rotuloQE09ALD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));

        rotuloQE09ALE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));

        rotuloLEQE11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloLEQE11.setText("Lado Esquerdo");

        rotuloLDQE11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloLDQE11.setText("Lado Direito");

        rotuloQE09.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloQE09.setText("Questão 09 - Dor muscularl com palpação");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rotuloQE09)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rotuloQE10A1)
                            .addComponent(rotuloQE10B1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rotuloLDQE11)
                            .addComponent(rotuloQE09ALD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotuloQE09BLD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rotuloQE09BLE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotuloLEQE11)
                            .addComponent(rotuloQE09ALE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotuloQE09)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloLDQE11)
                    .addComponent(rotuloLEQE11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rotuloQE10A1)
                            .addComponent(rotuloQE09ALD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rotuloQE10B1)
                            .addComponent(rotuloQE09BLD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(rotuloQE09ALE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rotuloQE09BLE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rotuloQE8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloQE8.setText("Questão 08 - Dor muscular extra-oral com palpação");

        rotuloAQE8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloAQE8.setText("Temporal posterior (parte por trás da têmpora)");

        rotuloBQE8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloBQE8.setText("Temporal médio (meio da têmpora)");

        rotuloCQE8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloCQE8.setText("Temporal anteriror (parte anterior da têmpora)");

        rotuloDQE8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloDQE8.setText("Masseter superior (bochecha/abaixo do zigoma)");

        rotuloEQE8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloEQE8.setText("Masserter médio (bochecha/lado da face)");

        rotuloFQE8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloFQE8.setText("Masserter inferior (bochecha/linha da mandibula)");

        rotuloGQE8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloGQE8.setText("Região mandibular posterior (estilo-hiode / região posterior do digastrico) \"região da garganta\"");

        rotuloHQE8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloHQE8.setText("Região sumandibular posterior (pterigódeo media/suprahióide/ região anterior do digástrico) \"abaixo do queixo\"");

        ComboBoxQE8HD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));

        ComboBoxQE8HE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));

        ComboBoxQE8GE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));

        ComboBoxQE8GD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));

        ComboBoxQE8FD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));

        ComboBoxQE8FE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));

        ComboBoxQE8EE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));

        ComboBoxQE8ED.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));

        ComboBoxQE8DD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));

        ComboBoxQE8DE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));

        ComboBoxQE8CE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));

        ComboBoxQE8CD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));

        ComboBoxQE8BD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));

        ComboBoxQE8BE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));

        ComboBoxQE8AE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));

        ComboBoxQE8AD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));

        rotuloLDQE8.setText("Lado Direito");

        rotuloLEQE8.setText("Lado Esquerdo");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rotuloQE8)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rotuloBQE8)
                            .addComponent(rotuloCQE8)
                            .addComponent(rotuloDQE8)
                            .addComponent(rotuloEQE8)
                            .addComponent(rotuloFQE8)
                            .addComponent(rotuloAQE8)
                            .addComponent(rotuloGQE8)
                            .addComponent(rotuloHQE8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboBoxQE8AD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotuloLDQE8)
                            .addComponent(ComboBoxQE8BD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxQE8CD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxQE8DD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxQE8ED, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxQE8FD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxQE8GD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxQE8HD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboBoxQE8GE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxQE8FE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxQE8EE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxQE8DE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxQE8CE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotuloLEQE8)
                            .addComponent(ComboBoxQE8AE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxQE8BE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxQE8HE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(273, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotuloQE8)
                .addGap(9, 9, 9)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloLDQE8)
                    .addComponent(rotuloLEQE8))
                .addGap(10, 10, 10)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloAQE8)
                    .addComponent(ComboBoxQE8AD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxQE8AE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloBQE8)
                    .addComponent(ComboBoxQE8BD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxQE8BE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloCQE8)
                    .addComponent(ComboBoxQE8CD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxQE8CE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloDQE8)
                    .addComponent(ComboBoxQE8DD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxQE8DE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloEQE8)
                    .addComponent(ComboBoxQE8ED, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxQE8EE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloFQE8)
                    .addComponent(ComboBoxQE8FD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxQE8FE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloGQE8)
                    .addComponent(ComboBoxQE8GD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxQE8GE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloHQE8)
                    .addComponent(ComboBoxQE8HE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxQE8HD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rotuloQE7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloQE7.setText("Questão 07 - Ruídos articulares nas excursões");

        ComboBoxQE7BExcusãoDireita.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum - 0", "Estalido - 1", "Crepitação Grosseira- 2", "Crepitação Fina - 3" }));

        ComboBoxQE7BExcusãoEsquerda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum - 0", "Estalido - 1", "Crepitação Grosseira- 2", "Crepitação Fina - 3" }));

        ComboBoxQE7BExcusão.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum - 0", "Estalido - 1", "Crepitação Grosseira- 2", "Crepitação Fina - 3" }));

        rotuloQE7BProtusão.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloQE7BProtusão.setText("Protrusão");

        rotuloQE7BExcusãoEsquerda.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloQE7BExcusãoEsquerda.setText("Excusão Esquerda");

        rotuloQE7BExcusãoDireita.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloQE7BExcusãoDireita.setText("Excusão Direita");

        rotuloQE7B.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloQE7B.setText("Ruídos -  Esquerdo");

        ComboBoxQE7AExcusãoDireita.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum - 0", "Estalido - 1", "Crepitação Grosseira- 2", "Crepitação Fina - 3" }));

        ComboBoxQE7AExcusãoEsquerda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum - 0", "Estalido - 1", "Crepitação Grosseira- 2", "Crepitação Fina - 3" }));

        ComboBoxQE7AProtusão.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum - 0", "Estalido - 1", "Crepitação Grosseira- 2", "Crepitação Fina - 3" }));

        rotuloQE7AProtusão.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloQE7AProtusão.setText("Protrusão");

        rotuloQE7AExcusãoEsquerda.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloQE7AExcusãoEsquerda.setText("Excusão Esquerda");

        rotuloQE7AExcusãoDireita.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloQE7AExcusãoDireita.setText("Excusão Direita");

        rotuloQE7A.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloQE7A.setText("Ruídos -  Direito");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rotuloQE7)
                    .addComponent(rotuloQE7A)
                    .addComponent(rotuloQE7B)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(rotuloQE7BExcusãoDireita)
                                .addGap(75, 75, 75)
                                .addComponent(rotuloQE7BExcusãoEsquerda)
                                .addGap(61, 61, 61)
                                .addComponent(rotuloQE7BProtusão))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(ComboBoxQE7BExcusãoDireita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComboBoxQE7BExcusãoEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ComboBoxQE7BExcusão, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(ComboBoxQE7AExcusãoDireita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComboBoxQE7AExcusãoEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ComboBoxQE7AProtusão, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(rotuloQE7AExcusãoDireita)
                                .addGap(75, 75, 75)
                                .addComponent(rotuloQE7AExcusãoEsquerda)
                                .addGap(61, 61, 61)
                                .addComponent(rotuloQE7AProtusão)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotuloQE7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rotuloQE7A)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloQE7AExcusãoDireita)
                    .addComponent(rotuloQE7AExcusãoEsquerda)
                    .addComponent(rotuloQE7AProtusão))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxQE7AExcusãoDireita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxQE7AExcusãoEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxQE7AProtusão, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(rotuloQE7B)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloQE7BExcusãoDireita)
                    .addComponent(rotuloQE7BExcusãoEsquerda)
                    .addComponent(rotuloQE7BProtusão))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxQE7BExcusãoDireita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxQE7BExcusãoEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxQE7BExcusão, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rotuloQE6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloQE6.setText("Questão 06 - Excursões");

        rotuloQE6A.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloQE6A.setText("Excursão Lateral Direita");

        try {
            campoQE6A.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        rotuloQE6Muscular.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloQE6Muscular.setText("Dor Muscular");

        rotuloQE6Articular.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloQE6Articular.setText("Dor Articular");

        ComboBoxQE6AArticular.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum - 0", "direito - 1", "esquerdo- 2", "ambos - 3" }));

        ComboBoxQE6AMuscular.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum - 0", "direito - 1", "esquerdo- 2", "ambos - 3" }));

        rotuloQE6B.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloQE6B.setText("Excursão Lateral Esquerda");

        try {
            campoQE6B.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        ComboBoxQE6BMuscular.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum - 0", "direito - 1", "esquerdo- 2", "ambos - 3" }));

        ComboBoxQE6BArticular.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum - 0", "direito - 1", "esquerdo- 2", "ambos - 3" }));

        ComboBoxQE6CArticular.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum - 0", "direito - 1", "esquerdo- 2", "ambos - 3" }));
        
        ComboBoxQE6CMuscular.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum - 0", "direito - 1", "esquerdo- 2", "ambos - 3" }));

        rotuloQE6C.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloQE6C.setText("Protusão");

        try {
            campoQE6AC.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        rotuloQE6D.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloQE6D.setText("Desvio de linha média");

        try {
            campoQE6D.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ComboBoxQE6DDesvio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "direito - 1", "esquerdo- 2", "nenhum - 8" }));

        rotuloQE6Desvio.setText("Desvio");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rotuloQE6)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rotuloQE6B)
                            .addComponent(rotuloQE6C)
                            .addComponent(rotuloQE6D)
                            .addComponent(rotuloQE6A))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoQE6A, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoQE6AC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoQE6B, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoQE6D, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboBoxQE6DDesvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rotuloQE6Muscular)
                                    .addComponent(ComboBoxQE6AMuscular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(64, 64, 64)
                                        .addComponent(rotuloQE6Articular))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ComboBoxQE6BArticular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ComboBoxQE6AArticular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ComboBoxQE6CArticular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(ComboBoxQE6BMuscular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxQE6CMuscular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotuloQE6Desvio))))
                .addContainerGap(629, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotuloQE6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloQE6Muscular)
                    .addComponent(rotuloQE6Articular))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloQE6A)
                    .addComponent(campoQE6A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxQE6AMuscular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxQE6AArticular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloQE6B)
                    .addComponent(campoQE6B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxQE6BMuscular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxQE6BArticular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloQE6C)
                    .addComponent(campoQE6AC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxQE6CMuscular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxQE6CArticular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(rotuloQE6Desvio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxQE6DDesvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotuloQE6D)
                    .addComponent(campoQE6D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rotuloQE5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloQE5.setText("Questão 05- Ruídos articulares (palpação)");

        rotuloQE5A.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloQE5A.setText("Abertura");

        rotuloLDQE5ADireito.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloLDQE5ADireito.setText("Direito");

        rotuloLDQE5AEsquerdo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloLDQE5AEsquerdo.setText("Esquerdo");

        ComboBoxQE5ADireito.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum - 0", "Estalido - 1", "Crepitação Grosseira- 2", "Crepitação Fina - 3" }));

        ComboBoxQE5AEsquerdo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum - 0", "Estalido - 1", "Crepitação Grosseira- 2", "Crepitação Fina - 3" }));

        jLabel12.setText("mm");

        jLabel11.setText("mm");

        rotuloLDQE5AA.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloLDQE5AA.setText("Medida do estalido na abertura:");

        rotuloQE5B.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloQE5B.setText("Fechamento");

        rotuloLDQE5BDireito.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloLDQE5BDireito.setText("Direito");

        rotuloLDQE5BEsquerdo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloLDQE5BEsquerdo.setText("Esquerdo");

        ComboBoxQE5BEsquerdo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum - 0", "Estalido - 1", "Crepitação Grosseira- 2", "Crepitação Fina - 3" }));

        ComboBoxQE5BDireito.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum - 0", "Estalido - 1", "Crepitação Grosseira- 2", "Crepitação Fina - 3" }));

        jLabel14.setText("mm");

        jLabel13.setText("mm");

        rotuloLDQE5BB.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloLDQE5BB.setText("Medida do estalido na abertura:");

        rotuloQE5C.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloQE5C.setText("Estalido reciproco eliminado durante abertura protrusiva");

        rotuloLDQE5CEsquerdo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloLDQE5CEsquerdo.setText("Esquerdo");

        rotuloLDQE5CDireito.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloLDQE5CDireito.setText("Direito");

        ComboBoxQE5CDireito.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sim - 0", "Não - 1", "N/A - 8" }));

        ComboBoxQE5CEsquerdo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sim - 0", "Não - 1", "N/A - 8" }));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rotuloQE5)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(rotuloQE5A)
                                .addGap(116, 116, 116)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ComboBoxQE5ADireito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rotuloLDQE5ADireito)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(rotuloLDQE5AA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoQE5ADireito, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(campoQE5AEsquerdo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12))
                            .addComponent(rotuloLDQE5AEsquerdo)
                            .addComponent(ComboBoxQE5AEsquerdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(rotuloQE5C)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rotuloLDQE5CDireito)
                            .addComponent(ComboBoxQE5CDireito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboBoxQE5CEsquerdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotuloLDQE5CEsquerdo)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(campoQE5BEsquerdo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(rotuloLDQE5BB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoQE5BDireito, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel14))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(rotuloQE5B)
                        .addGap(100, 100, 100)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboBoxQE5BDireito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotuloLDQE5BDireito))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rotuloLDQE5BEsquerdo)
                            .addComponent(ComboBoxQE5BEsquerdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotuloQE5)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloLDQE5ADireito)
                    .addComponent(rotuloLDQE5AEsquerdo)
                    .addComponent(rotuloQE5A))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxQE5ADireito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxQE5AEsquerdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloLDQE5AA)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(campoQE5ADireito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoQE5AEsquerdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloLDQE5BDireito)
                    .addComponent(rotuloLDQE5BEsquerdo)
                    .addComponent(rotuloQE5B))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxQE5BDireito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxQE5BEsquerdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloLDQE5BB)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(campoQE5BDireito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoQE5BEsquerdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rotuloQE5C)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloLDQE5CDireito)
                    .addComponent(rotuloLDQE5CEsquerdo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxQE5CDireito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxQE5CEsquerdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rotuloQE4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloQE4.setText("Questão 04 - Extensão de movimento vertical");

        rotuloQE4A.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloQE4A.setText("Abertura sem auxilio sem dor em mm");

        try {
            campoQE4A.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            campoQE4B.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        rotuloQE4B.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloQE4B.setText("Abertura máxima sem auxilio em mm");

        rotuloQE4C.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloQE4C.setText("Abertura máxima com auxilio em mm");

        try {
            campoQE4C.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            campoQE4D.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        rotuloQE4D.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloQE4D.setText("Trespasse incisal vertical em mm");

        ComboBoxQE4DMuscular.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum - 0", "direito - 1", "esquerdo- 2", "ambos - 3" }));

        ComboBoxQE4CMuscular.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum - 0", "direito - 1", "esquerdo- 2", "ambos - 3" }));

        rotuloLDQE4Muscular.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloLDQE4Muscular.setText("Dor Muscular");

        rotuloLDQE4Articular.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloLDQE4Articular.setText("Dor Articular");

        ComboBoxQE4CArticular.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum - 0", "direito - 1", "esquerdo- 2", "ambos - 3" }));

        ComboBoxQE4DArticular.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum - 0", "direito - 1", "esquerdo- 2", "ambos - 3" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rotuloQE4)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rotuloQE4A)
                            .addComponent(rotuloQE4B)
                            .addComponent(rotuloQE4D)
                            .addComponent(rotuloQE4C))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoQE4B, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoQE4C, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoQE4D, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rotuloLDQE4Muscular)
                                    .addComponent(ComboBoxQE4CMuscular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ComboBoxQE4DMuscular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ComboBoxQE4DArticular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ComboBoxQE4CArticular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rotuloLDQE4Articular)))
                            .addComponent(campoQE4A, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotuloQE4)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloQE4A)
                    .addComponent(campoQE4A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloQE4B)
                    .addComponent(campoQE4B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotuloLDQE4Muscular)
                    .addComponent(rotuloLDQE4Articular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloQE4C)
                    .addComponent(campoQE4C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxQE4CMuscular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxQE4CArticular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloQE4D)
                    .addComponent(campoQE4D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxQE4DMuscular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxQE4DArticular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rotuloQE3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloQE3.setText("Questão 03 - Padrão de Abertura");

        ComboBoxQE3Abertura.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Reto - 1", "Desvio lateral direito (não corrigido) - 1", "Desvio lateral direito (S) - 2", "Desvio lateral esquerdo (não corrigido) - 3", "Desvio lateral direito (S) - 4", "Outro - 5" }));

        rotuloQE3Tipo.setText("Tipo");

        rotuloQE3Especifique.setText("(especifique)");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rotuloQE3)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(ComboBoxQE3Abertura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rotuloQE3Tipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoQE3)
                        .addGap(18, 18, 18)
                        .addComponent(rotuloQE3Especifique)))
                .addGap(77, 77, 77))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotuloQE3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rotuloQE3Tipo)
                        .addComponent(campoQE3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rotuloQE3Especifique))
                    .addComponent(ComboBoxQE3Abertura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelQ02.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelQ02.setText("Questão 02 - Você poderia apontar as áreas onde você sente dor? ");

        ComboBoxQE2ALadoDireito.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum - 0", "Articulação - 1", "Músculos- 2", "ambos - 3" }));

        ComboBoxQE2ALadoEsquerdo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum - 0", "Articulação - 1", "Músculos- 2", "ambos - 3" }));

        labelQ02Direito.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelQ02Direito.setText("Lado Direito");

        labelQ02Esquerdo.setText("Lado Esquerdo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelQ02)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboBoxQE2ALadoDireito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelQ02Direito))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelQ02Esquerdo)
                            .addComponent(ComboBoxQE2ALadoEsquerdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(670, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelQ02)
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQ02Direito)
                    .addComponent(labelQ02Esquerdo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxQE2ALadoDireito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxQE2ALadoEsquerdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelPerguntas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelPerguntas.setText("Perguntas:");

        rotuloQuestao01.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rotuloQuestao01.setText("Questão 01 - Você tem dor no lado direito da sua face, lado esquerdo ou ambos os lados?");

        ComboBoxQE1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Não", "Direito", "Esquerdo", "Ambos", " " }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(labelPerguntas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(556, 556, 556))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(rotuloQuestao01)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(ComboBoxQE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPerguntas)
                .addGap(18, 18, 18)
                .addComponent(rotuloQuestao01)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboBoxQE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelQuestionario1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelQuestionario1.setText("EXAME CLÍNICO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(414, 414, 414)
                .addComponent(labelQuestionario1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelQuestionario1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(0, 0, 0));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel13.setForeground(new java.awt.Color(255, 255, 255));

        rotuloResultado.setForeground(new java.awt.Color(255, 255, 255));
        rotuloResultado.setText("*");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("*");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("*");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("*");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("*");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoDiagnosticar)
                    .addComponent(rotuloResultado)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(946, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoDiagnosticar)
                .addGap(26, 26, 26)
                .addComponent(rotuloResultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelQuestionario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelQuestionario.setText("QUESTÕES DO QUESTIONÁRIO:");

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelQuestao3Questionario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelQuestao3Questionario.setText("Questão 03 - Teve dor na face, maxilares, têmporas, à frente do ouvido ou no ouvido no último mês?");

        ComboBoxQuestaoQuestionario03.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Não - 0", "Sim - 1" }));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelQuestao3Questionario)
                    .addComponent(ComboBoxQuestaoQuestionario03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelQuestao3Questionario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ComboBoxQuestaoQuestionario03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setText("Questão 14a - Aguma vez teve a mandíbula bloqueada ou presa de forma que não abrisse completamente a boca?");

        ComboBoxQuestao14aQuestionario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Não - 0", "Sim - 1" }));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(ComboBoxQuestao14aQuestionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboBoxQuestao14aQuestionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setText("Questão 14b - Esta Limitação da abertura mandibular foi suficientemente severa para interferir com a capacidade de comer?");

        ComboBoxQuestao14bQuestionario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Não - 0", "Sim - 1" }));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(ComboBoxQuestao14bQuestionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboBoxQuestao14bQuestionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel14Layout.createSequentialGroup()
                        .addComponent(labelQuestionario)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelQuestionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        ScrollPane.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void acoesBotoes() {
        botaoDiagnosticar.setText("Diagnosticar");
        botaoDiagnosticar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                String diagnostico_I = diagnostico_Grupo_I();
                rotuloResultado.setText(diagnostico_I);
                
            }
        });
    }
    
    public String diagnostico_Grupo_I(){
                
        DefaultComboBoxModel modeloPaciente = new DefaultComboBoxModel(pacientes.toArray());
    //    ComboBoxSelecionarPaciente.setModel(modeloPaciente);
        
        //Pegar o Objeto Paciente com todos os atributos e não somente o nome
   //     Paciente p = (Paciente) ComboBoxSelecionarPaciente.getSelectedItem();
        //Passa por parâmetro o id do Paciente selecionado no combobox
//        questPessoal = controlador.buscarCamposQuestPessoal(p.getId());
        
        
        String rqp3;
        String QE8AD, QE8AE, QE8BD, QE8BE, QE8CD, QE8CE,
                        QE8DD, QE8DE, QE8ED, QE8EE, QE8FD, QE8FE,
                        QE8GD, QE8GE, QE8HD, QE8HE;
                String QE10AD, QE10AE, QE10BD, QE10BE;
                String rqe1;
                String rqE4a, rqE4b, rqE4c, rqE4d;

                //Aqui deve ser o resultado vindo da Query
                rqp3 = questPessoal.getRqp3();

                //QE8 - Dor muscular extra-oral com palpação
                // A                
                QE8AD = ComboBoxQE8AD.getSelectedItem().toString();
                QE8AE = ComboBoxQE8AE.getSelectedItem().toString();
                
                // B                
                QE8BD = ComboBoxQE8BD.getSelectedItem().toString();
                QE8BE = ComboBoxQE8BE.getSelectedItem().toString();
  
                // C
                QE8CD = ComboBoxQE8CD.getSelectedItem().toString();
                QE8CE = ComboBoxQE8CE.getSelectedItem().toString();
                
                // D
                QE8DD = ComboBoxQE8DD.getSelectedItem().toString();
                QE8DE = ComboBoxQE8DE.getSelectedItem().toString();
                
                // E
                QE8ED = ComboBoxQE8ED.getSelectedItem().toString();
                QE8EE = ComboBoxQE8EE.getSelectedItem().toString();
                
                // F
                QE8FD = ComboBoxQE8FD.getSelectedItem().toString();
                QE8FE = ComboBoxQE8FE.getSelectedItem().toString();
                
                // G
                QE8GD = ComboBoxQE8GD.getSelectedItem().toString();
                QE8GE = ComboBoxQE8GE.getSelectedItem().toString();
                
                // H
                QE8HD = ComboBoxQE8HD.getSelectedItem().toString();
                QE8HE = ComboBoxQE8HE.getSelectedItem().toString();
                
                
                
                // QE10 - Dor muscular intra-oral com palpação   QE10AD, QE10AE, QE10BD, QE10BE
                // A
                QE10AD = ComboBoxQE10ALD.getSelectedItem().toString();
                QE10AE = ComboBoxQE10ALE.getSelectedItem().toString();
                
                // B
                QE10BD = ComboBoxQE10BLD.getSelectedItem().toString();
                QE10BE = ComboBoxQE10BLE.getSelectedItem().toString();
                

                //  QUESTÃO 1 QE1 
                rqe1 = ComboBoxQE1.getSelectedItem().toString();
                

                // QUESTÃO 4                 
                rqE4a = campoQE4A.getText();
                rqE4b = campoQE4B.getText();
                rqE4c = campoQE4C.getText();
                rqE4d = campoQE4D.getText();
                
                //DIAGNOSTICO DO GRUPO 1
                String diagnostico = "";
                
                exame = new ExameClinico();
                exame.setRq1(ComboBoxQE1.getSelectedItem().toString());
                exame.setRq21Dir(ComboBoxQE2ALadoDireito.getSelectedItem().toString());
                exame.setRq22Esq(ComboBoxQE2ALadoEsquerdo.getSelectedItem().toString());
                //Questão sugeita a alteração
                exame.setRq3(ComboBoxQE3Abertura.getSelectedItem().toString());
                
                exame.setRq4AMm(rqE4a);
                exame.setRq4BMm(rqE4b);
                exame.setRq4CMm(rqE4c);
                exame.setRq4DMm(rqE4d);
                
                //Modificar o código aqui
                exame.setRq5ADir(ComboBoxQE5ADireito.getSelectedItem().toString());
                exame.setRq5AEsq(ComboBoxQE5AEsquerdo.getSelectedItem().toString());
                exame.setRq5AMedEstMm(campoQE5ADireito.getText());
                //controlador.inserirExameClinico(exame);
                
                diagnostico = controlador.grupo_I(rqp3, QE8AD, QE8AE, QE8BD, QE8BE, QE8CD, QE8CE, QE8DD, QE8DE, QE8ED, QE8EE, QE8FD, QE8FE, QE8GD, QE8GE, QE8HD, QE8HE, QE10AD, QE10AE, QE10BD, QE10BE, rqe1, rqE4a, rqE4b, rqE4c, rqE4d);
                return diagnostico;
                
                
                
                /*controlador.diagnosticar(rqe3, QE8AD, QE8AE, QE8BD, QE8BE, QE8CD, QE8CE, QE8DD, QE8DE, QE8ED, QE8EE, QE8FD, QE8FE, 
                        QE8GD, QE8GE, QE8HD, QE8HE, QE10AD, QE10AE, QE10BD, QE10BE, rqe1, campoQE4A.getText(), campoQE4B.getText(), campoQE4C.getText(),
                        campoQE4D.getText());*/
    }
    
    public void preencherComboPaciente(){
        pacientes = controlador.BuscarPacientes();
        
        for(Object p : pacientes){
//            ComboBoxSelecionarPaciente.addItem(p);
        }
    }
    
}
