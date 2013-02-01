/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import negocio.Controlador;
import negocio.Grupo_I;

/**
 *
 * @author Angelo
 */
public class ViewGrupos extends JFrame {

    private javax.swing.JComboBox ComboBoxQE1;
    private javax.swing.JComboBox ComboBoxQE10AD;
    private javax.swing.JComboBox ComboBoxQE10AE;
    private javax.swing.JComboBox ComboBoxQE10BD;
    private javax.swing.JComboBox ComboBoxQE10BE;
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
    private javax.swing.JComboBox ComboBoxRespostaQE3;
    private javax.swing.JPanel PanelQuestionarios;
    private javax.swing.JLabel QE3;
    private javax.swing.JFormattedTextField campoQE4A;
    private javax.swing.JFormattedTextField campoQE4B;
    private javax.swing.JFormattedTextField campoQE4C;
    private javax.swing.JFormattedTextField campoQE4D;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rotuloAQE8;
    private javax.swing.JLabel rotuloBQE8;
    private javax.swing.JLabel rotuloCQE8;
    private javax.swing.JLabel rotuloDQE8;
    private javax.swing.JLabel rotuloEQE8;
    private javax.swing.JLabel rotuloFQE8;
    private javax.swing.JLabel rotuloGQE8;
    private javax.swing.JLabel rotuloLDQE10;
    private javax.swing.JLabel rotuloLDQE8;
    private javax.swing.JLabel rotuloLEQE10;
    private javax.swing.JLabel rotuloLEQE8;
    private javax.swing.JLabel rotuloPerguntas;
    private javax.swing.JLabel rotuloQE1;
    private javax.swing.JLabel rotuloQE10;
    private javax.swing.JLabel rotuloQE10A;
    private javax.swing.JLabel rotuloQE10B;
    private javax.swing.JLabel rotuloQE4;
    private javax.swing.JLabel rotuloQE4A;
    private javax.swing.JLabel rotuloQE4B;
    private javax.swing.JLabel rotuloQE4C;
    private javax.swing.JLabel rotuloQE4D;
    private javax.swing.JLabel rotuloQE8;
    private javax.swing.JLabel rotuloQuestionario;
    private javax.swing.JLabel rotuloResultado;
    private javax.swing.JButton botaoDiagnosticar;
    private JComboBox ComboBoxQE8HE;
    private JComboBox ComboBoxQE8HD;
    private JLabel rotuloHQE8;
    private Controlador controlador;
    public Grupo_I grupo = new Grupo_I();
    String aux = "";
    int rq3, somaq8, somaq10, rq1, rq4a, rq4b, rq4c, rq4d;

    public ViewGrupos() {
    }

    public void iniciar() {
        iniciarVariaveis();
        configurarBotoes();
        configurarPainel();
    }

    private void iniciarVariaveis() {

        controlador = new Controlador();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        PanelQuestionarios = new javax.swing.JPanel();
        rotuloQuestionario = new javax.swing.JLabel();
        rotuloPerguntas = new javax.swing.JLabel();
        QE3 = new javax.swing.JLabel();
        ComboBoxRespostaQE3 = new javax.swing.JComboBox();
        rotuloQE8 = new javax.swing.JLabel();
        rotuloQE10 = new javax.swing.JLabel();
        rotuloAQE8 = new javax.swing.JLabel();
        rotuloBQE8 = new javax.swing.JLabel();
        rotuloCQE8 = new javax.swing.JLabel();
        rotuloDQE8 = new javax.swing.JLabel();
        rotuloEQE8 = new javax.swing.JLabel();
        rotuloFQE8 = new javax.swing.JLabel();
        rotuloGQE8 = new javax.swing.JLabel();
        rotuloLDQE8 = new javax.swing.JLabel();
        rotuloLEQE8 = new javax.swing.JLabel();
        ComboBoxQE8AD = new javax.swing.JComboBox();
        ComboBoxQE8BD = new javax.swing.JComboBox();
        ComboBoxQE8CD = new javax.swing.JComboBox();
        ComboBoxQE8DD = new javax.swing.JComboBox();
        ComboBoxQE8AE = new javax.swing.JComboBox();
        ComboBoxQE8ED = new javax.swing.JComboBox();
        ComboBoxQE8FD = new javax.swing.JComboBox();
        ComboBoxQE8GD = new javax.swing.JComboBox();
        ComboBoxQE8BE = new javax.swing.JComboBox();
        ComboBoxQE8CE = new javax.swing.JComboBox();
        ComboBoxQE8DE = new javax.swing.JComboBox();
        ComboBoxQE8EE = new javax.swing.JComboBox();
        ComboBoxQE8FE = new javax.swing.JComboBox();
        ComboBoxQE8GE = new javax.swing.JComboBox();
        rotuloQE10A = new javax.swing.JLabel();
        rotuloQE10B = new javax.swing.JLabel();
        ComboBoxQE10AD = new javax.swing.JComboBox();
        rotuloLDQE10 = new javax.swing.JLabel();
        rotuloLEQE10 = new javax.swing.JLabel();
        ComboBoxQE10BD = new javax.swing.JComboBox();
        ComboBoxQE10AE = new javax.swing.JComboBox();
        ComboBoxQE10BE = new javax.swing.JComboBox();
        rotuloQE1 = new javax.swing.JLabel();
        ComboBoxQE1 = new javax.swing.JComboBox();
        rotuloQE4A = new javax.swing.JLabel();
        rotuloQE4B = new javax.swing.JLabel();
        rotuloQE4C = new javax.swing.JLabel();
        rotuloQE4D = new javax.swing.JLabel();
        rotuloQE4 = new javax.swing.JLabel();
        campoQE4A = new javax.swing.JFormattedTextField();
        campoQE4B = new javax.swing.JFormattedTextField();
        campoQE4C = new javax.swing.JFormattedTextField();
        campoQE4D = new javax.swing.JFormattedTextField();
        botaoDiagnosticar = new javax.swing.JButton();
        rotuloResultado = new javax.swing.JLabel();
        rotuloHQE8 = new javax.swing.JLabel();
        ComboBoxQE8HD = new javax.swing.JComboBox();
        ComboBoxQE8HE = new javax.swing.JComboBox();

        rotuloQuestionario.setText("QUESTIONÁRIO DO GRUPO I");

        rotuloPerguntas.setText("Perguntas:");

        QE3.setText("QE3 - Você já teve dor na face, nos maxilares, têmpora, na frente do ouvido, ou no ouvido no mês passado?");

        ComboBoxRespostaQE3.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"opções", "SIM", "NÃO"}));

        rotuloQE8.setText("QE8 - Dor muscular extra-oral com palpação");

        rotuloQE10.setText("QE10 - Dor muscular intra-oral com palpação");

        rotuloAQE8.setText("a) Temporal posterior (parte por trás da têmpora)");

        rotuloBQE8.setText("b) Temporal médio (meio da têmpora)");

        rotuloCQE8.setText("c) Temporal anteriror (parte anterior da têmpora)");

        rotuloDQE8.setText("d) Masseter superior (bochecha/abaixo do zigoma)");

        rotuloEQE8.setText("e) Masserter médio (bochecha/lado da face)");

        rotuloFQE8.setText("f) Masserter inferior (bochecha/linha da mandibula)");

        rotuloGQE8.setText("g) Região mandibular posterior (estilo-hiode / região posterior do digastrico) \"região da garganta\"");

        rotuloLDQE8.setText("Lado Direito");

        rotuloLEQE8.setText("Lado Esquerdo");

        ComboBoxQE8AD.setModel(new javax.swing.DefaultComboBoxModel(new String[]{ "0", "1", "2", "3"}));

        ComboBoxQE8BD.setModel(new javax.swing.DefaultComboBoxModel(new String[]{ "0", "1", "2", "3"}));

        ComboBoxQE8CD.setModel(new javax.swing.DefaultComboBoxModel(new String[]{ "0", "1", "2", "3"}));

        ComboBoxQE8DD.setModel(new javax.swing.DefaultComboBoxModel(new String[]{ "0", "1", "2", "3"}));

        ComboBoxQE8AE.setModel(new javax.swing.DefaultComboBoxModel(new String[]{ "0", "1", "2", "3"}));

        ComboBoxQE8ED.setModel(new javax.swing.DefaultComboBoxModel(new String[]{ "0", "1", "2", "3"}));

        ComboBoxQE8FD.setModel(new javax.swing.DefaultComboBoxModel(new String[]{ "0", "1", "2", "3"}));

        ComboBoxQE8GD.setModel(new javax.swing.DefaultComboBoxModel(new String[]{ "0", "1", "2", "3"}));

        ComboBoxQE8BE.setModel(new javax.swing.DefaultComboBoxModel(new String[]{ "0", "1", "2", "3"}));

        ComboBoxQE8CE.setModel(new javax.swing.DefaultComboBoxModel(new String[]{ "0", "1", "2", "3"}));

        ComboBoxQE8DE.setModel(new javax.swing.DefaultComboBoxModel(new String[]{ "0", "1", "2", "3"}));

        ComboBoxQE8EE.setModel(new javax.swing.DefaultComboBoxModel(new String[]{ "0", "1", "2", "3"}));

        ComboBoxQE8FE.setModel(new javax.swing.DefaultComboBoxModel(new String[]{ "0", "1", "2", "3"}));

        ComboBoxQE8GE.setModel(new javax.swing.DefaultComboBoxModel(new String[]{ "0", "1", "2", "3"}));

        rotuloQE10A.setText("a) Área do pterigóideo lateral (atrás dos molares superiores)");

        rotuloQE10B.setText("b) Tendão do temporal (infra-bucal)");

        ComboBoxQE10AD.setModel(new javax.swing.DefaultComboBoxModel(new String[]{ "0", "1", "2", "3"}));

        rotuloLDQE10.setText("Lado Direito");

        rotuloLEQE10.setText("Lado Esquerdo");

        ComboBoxQE10BD.setModel(new javax.swing.DefaultComboBoxModel(new String[]{ "0", "1", "2", "3"}));

        ComboBoxQE10AE.setModel(new javax.swing.DefaultComboBoxModel(new String[]{ "0", "1", "2", "3"}));

        ComboBoxQE10BE.setModel(new javax.swing.DefaultComboBoxModel(new String[]{ "0", "1", "2", "3"}));

        rotuloQE1.setText("QE1 - Você tem dor no lado direito da sua face, lado esquerdo ou ambos os lados?");

        ComboBoxQE1.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"opções", "não", "direito", "esquerdo", "ambos"}));

        rotuloQE4A.setText("a) Abertura sem auxilio sem dor em mm");

        rotuloQE4B.setText("b) Abertura máxima sem auxilio em mm");

        rotuloQE4C.setText("c) Abertura máxima com auxilio em mm");

        rotuloQE4D.setText("d) Trespasse incisal vertical em mm");

        rotuloQE4.setText("QE4 - Extensão de movimento vertical");

        botaoDiagnosticar.setText("Diagnosticar");

        rotuloResultado.setText("*");

        rotuloHQE8.setText("h) Região sumandibular posterior (pterigódeo media/suprahióide/ região anterior do digástrico) \"abaixo do queixo\"");

        ComboBoxQE8HD.setModel(new javax.swing.DefaultComboBoxModel(new String[]{ "0", "1", "2", "3"}));

        ComboBoxQE8HE.setModel(new javax.swing.DefaultComboBoxModel(new String[]{ "0", "1", "2", "3"}));

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
    }

    private void configurarBotoes() {




        botaoDiagnosticar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String rqe3 = ComboBoxRespostaQE3.getSelectedItem().toString();

                if ("sim".equalsIgnoreCase(rqe3)) {
                    rq3 = 1;
                } else {
                    rq3 = 0;
                }
                somaq8 = 0;
                String QE8AD, QE8AE, QE8BD, QE8BE, QE8CD, QE8CE,
                        QE8DD, QE8DE, QE8ED, QE8EE, QE8FD, QE8FE,
                        QE8GD, QE8GE, QE8HD, QE8HE;

                String QE10AD, QE10AE, QE10BD, QE10BE;



                //QE8 - Dor muscular extra-oral com palpação
                // A                
                QE8AD = ComboBoxQE8AD.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE8AD)) {
                    somaq8++;
                }

                QE8AE = ComboBoxQE8AE.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE8AE)) {
                    somaq8++;
                }
                // B                
                QE8BD = ComboBoxQE8BD.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE8BD)) {
                    somaq8++;
                }
                QE8BE = ComboBoxQE8BE.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE8BE)) {
                    somaq8++;
                }
                // C
                QE8CD = ComboBoxQE8CD.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE8CD)) {
                    somaq8++;
                }
                QE8CE = ComboBoxQE8CE.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE8CE)) {
                    somaq8++;
                }
                // D
                QE8DD = ComboBoxQE8DD.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE8DD)) {
                    somaq8++;
                }
                QE8DE = ComboBoxQE8DE.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE8DE)) {
                    somaq8++;
                }
                // E
                QE8ED = ComboBoxQE8ED.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE8ED)) {
                    somaq8++;
                }
                QE8EE = ComboBoxQE8EE.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE8EE)) {
                    somaq8++;
                }
                // F
                QE8FD = ComboBoxQE8FD.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE8FD)) {
                    somaq8++;
                }
                QE8FE = ComboBoxQE8FE.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE8FE)) {
                    somaq8++;
                }
                // G
                QE8GD = ComboBoxQE8GD.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE8GD)) {
                    somaq8++;
                }
                QE8GE = ComboBoxQE8GE.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE8GE)) {
                    somaq8++;
                }
                // H
                QE8HD = ComboBoxQE8HD.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE8HD)) {
                    somaq8++;
                }
                QE8HE = ComboBoxQE8HE.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE8HE)) {
                    somaq8++;
                }

                // QE10 - Dor muscular intra-oral com palpação   QE10AD, QE10AE, QE10BD, QE10BE
                QE10AD = ComboBoxQE10AD.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE10AD)) {
                    somaq10++;
                }
                QE10AE = ComboBoxQE10AE.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE10AE)) {
                    somaq10++;
                }

                QE10BD = ComboBoxQE10BD.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE10BD)) {
                    somaq10++;
                }
                QE10BE = ComboBoxQE10BE.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE10BE)) {
                    somaq10++;
                }

                //  QUESTÃO 1 QE1 
                String rqe1 = ComboBoxQE1.getSelectedItem().toString();
                if ("não".equalsIgnoreCase(rqe1)) {
                    rq1 = 0;
                } else {
                    rq1 = 1;
                }

                // QUESTÃO 4                 
                rq4a = Integer.parseInt(campoQE4A.getText());
                rq4b = Integer.parseInt(campoQE4B.getText());
                rq4c = Integer.parseInt(campoQE4C.getText());
                rq4d = Integer.parseInt(campoQE4D.getText());

                String diagnostico = "";
                diagnostico = grupo.diagnostico(rq3, somaq8, somaq10, rq1, rq4a, rq4b, rq4c, rq4d);
                rotuloResultado.setText(diagnostico);
                controlador.diagnosticar(rqe3, QE8AD, QE8AE, QE8BD, QE8BE, QE8CD, QE8CE, QE8DD, QE8DE, QE8ED, QE8EE, QE8FD, QE8FE, 
                        QE8GD, QE8GE, QE8HD, QE8HE, QE10AD, QE10AE, QE10BD, QE10BE, rqe1, campoQE4A.getText(), campoQE4B.getText(), campoQE4C.getText(),
                        campoQE4D.getText(), rq3, somaq8, somaq10, rq1, rq4a, rq4b, rq4c, rq4d);
            }
        });


        ComboBoxQE1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String rqe1 = ComboBoxQE1.getSelectedItem().toString();
                if ("não".equalsIgnoreCase(rqe1)) {
                    rq1 = 0;
                    // QUESTÃO 4                 
                    campoQE4A.setText("00");
                    campoQE4B.setText("00");
                    campoQE4C.setText("00");
                    campoQE4D.setText("00");
                }else{
                    campoQE4A.setText("");
                    campoQE4B.setText("");
                    campoQE4C.setText("");
                    campoQE4D.setText("");
                    campoQE4A.requestFocus();
                }
                
            }
        });

    }

    private void configurarPainel() {

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
                jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 0, Short.MAX_VALUE));
        jInternalFrame1Layout.setVerticalGroup(
                jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 0, Short.MAX_VALUE));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout PanelQuestionariosLayout = new javax.swing.GroupLayout(PanelQuestionarios);
        PanelQuestionarios.setLayout(PanelQuestionariosLayout);
        PanelQuestionariosLayout.setHorizontalGroup(
                PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(rotuloBQE8)
                .addComponent(rotuloCQE8)
                .addComponent(rotuloDQE8)
                .addComponent(rotuloEQE8)
                .addComponent(rotuloFQE8)
                .addComponent(rotuloAQE8)
                .addComponent(rotuloGQE8)
                .addComponent(rotuloHQE8))
                .addGap(51, 51, 51)
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ComboBoxQE8AD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(rotuloLDQE8)
                .addComponent(ComboBoxQE8BD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(ComboBoxQE8CD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(ComboBoxQE8DD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(ComboBoxQE8ED, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(ComboBoxQE8FD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(ComboBoxQE8GD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(ComboBoxQE8HD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ComboBoxQE8GE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(ComboBoxQE8FE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(ComboBoxQE8EE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(ComboBoxQE8DE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(ComboBoxQE8CE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(rotuloLEQE8)
                .addComponent(ComboBoxQE8AE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(ComboBoxQE8BE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(ComboBoxQE8HE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(rotuloQuestionario))
                .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotuloPerguntas))
                .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(QE3))
                .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotuloQE10))
                .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotuloQE8))
                .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(rotuloQE10A)
                .addComponent(rotuloQE10B))
                .addGap(85, 85, 85)
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(rotuloLDQE10)
                .addComponent(ComboBoxQE10AD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(ComboBoxQE10BD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ComboBoxQE10BE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(rotuloLEQE10)
                .addComponent(ComboBoxQE10AE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(ComboBoxRespostaQE3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotuloQE1))
                .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(ComboBoxQE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotuloQE4))
                .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                .addComponent(rotuloQE4A)
                .addGap(18, 18, 18)
                .addComponent(campoQE4A, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                .addComponent(rotuloQE4B)
                .addGap(18, 18, 18)
                .addComponent(campoQE4B, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(rotuloQE4C)
                .addComponent(rotuloQE4D))
                .addGap(18, 18, 18)
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(campoQE4D, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(campoQE4C, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoDiagnosticar)
                .addGap(47, 47, 47)
                .addComponent(rotuloResultado)))
                .addContainerGap(226, Short.MAX_VALUE)));
        PanelQuestionariosLayout.setVerticalGroup(
                PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(rotuloQuestionario)
                .addGap(57, 57, 57)
                .addComponent(rotuloPerguntas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(QE3)
                .addGap(11, 11, 11)
                .addComponent(ComboBoxRespostaQE3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rotuloQE8)
                .addGap(9, 9, 9)
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rotuloLDQE8)
                .addComponent(rotuloLEQE8))
                .addGap(10, 10, 10)
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rotuloAQE8)
                .addComponent(ComboBoxQE8AD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(ComboBoxQE8AE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rotuloBQE8)
                .addComponent(ComboBoxQE8BD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(ComboBoxQE8BE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rotuloCQE8)
                .addComponent(ComboBoxQE8CD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(ComboBoxQE8CE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rotuloDQE8)
                .addComponent(ComboBoxQE8DD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(ComboBoxQE8DE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rotuloEQE8)
                .addComponent(ComboBoxQE8ED, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(ComboBoxQE8EE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rotuloFQE8)
                .addComponent(ComboBoxQE8FD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(ComboBoxQE8FE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rotuloGQE8)
                .addComponent(ComboBoxQE8GD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(ComboBoxQE8GE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rotuloHQE8)
                .addComponent(ComboBoxQE8HE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(ComboBoxQE8HD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(rotuloQE10)
                .addGap(28, 28, 28))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelQuestionariosLayout.createSequentialGroup()
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rotuloLDQE10)
                .addComponent(rotuloLEQE10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rotuloQE10A)
                .addComponent(ComboBoxQE10AD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rotuloQE10B)
                .addComponent(ComboBoxQE10BD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                .addComponent(ComboBoxQE10AE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ComboBoxQE10BE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addComponent(rotuloQE1)
                .addGap(18, 18, 18)
                .addComponent(ComboBoxQE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rotuloQE4)
                .addGap(18, 18, 18)
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rotuloQE4A)
                .addComponent(campoQE4A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rotuloQE4B)
                .addComponent(campoQE4B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rotuloQE4C)
                .addComponent(campoQE4C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rotuloQE4D)
                .addComponent(campoQE4D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(botaoDiagnosticar)
                .addComponent(rotuloResultado))
                .addContainerGap(117, Short.MAX_VALUE)));

        jScrollPane1.setViewportView(PanelQuestionarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1023, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE));

        pack();
    }
}
