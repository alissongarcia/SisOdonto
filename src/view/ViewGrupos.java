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
    private javax.swing.JComboBox ComboBoxQE14a;
    private javax.swing.JComboBox ComboBoxQE14b;
    private javax.swing.JComboBox ComboBoxQE2LadoDireito;
    private javax.swing.JComboBox ComboBoxQE2LadoEsquerdo;
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
    private javax.swing.JComboBox ComboBoxRespostaQE3;
    private javax.swing.JPanel PanelQuestionarios;
    private javax.swing.JLabel QE3;
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
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rotuloAQE8;
    private javax.swing.JLabel rotuloBQE8;
    private javax.swing.JLabel rotuloCQE8;
    private javax.swing.JLabel rotuloDQE8;
    private javax.swing.JLabel rotuloEQE8;
    private javax.swing.JLabel rotuloFQE8;
    private javax.swing.JLabel rotuloGQE8;
    private javax.swing.JLabel rotuloHQE8;
    private javax.swing.JLabel rotuloLDQE10;
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
    private javax.swing.JLabel rotuloLEQE8;
    private javax.swing.JLabel rotuloPerguntas;
    private javax.swing.JLabel rotuloQE1;
    private javax.swing.JLabel rotuloQE10;
    private javax.swing.JLabel rotuloQE10A;
    private javax.swing.JLabel rotuloQE10B;
    private javax.swing.JLabel rotuloQE14A;
    private javax.swing.JLabel rotuloQE14B;
    private javax.swing.JLabel rotuloQE2;
    private javax.swing.JLabel rotuloQE2Direito;
    private javax.swing.JLabel rotuloQE2Esquerdo;
    private javax.swing.JLabel rotuloQE3;
    private javax.swing.JLabel rotuloQE3Especifique;
    private javax.swing.JLabel rotuloQE3Tipo;
    private javax.swing.JLabel rotuloQE4;
    private javax.swing.JLabel rotuloQE4A;
    private javax.swing.JLabel rotuloQE4B;
    private javax.swing.JLabel rotuloQE4C;
    private javax.swing.JLabel rotuloQE4D;
    private javax.swing.JLabel rotuloQE5A;
    private javax.swing.JLabel rotuloQE5B;
    private javax.swing.JLabel rotuloQE5C;
    private javax.swing.JLabel rotuloQE5p;
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
    private javax.swing.JLabel rotuloQuestionario;
    private javax.swing.JLabel rotuloQuestionarioII;
    private javax.swing.JLabel rotuloResultado;
    private Controlador controlador;
    public Grupo_I grupo = new Grupo_I();
    String aux = "";
    
    int rq3, somaqE8, somaqE10, rqE1, rqE4a, rqE4b, rqE4c, rqE4d;
    
    int rqE5a, rqE5amm, rqE5b, rqE5bmm, rqE5c, rqE7_dir, rqE7_esq, rq14a, rqE6a, rqE6b, rqE3;

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
        rotuloQuestionarioII = new javax.swing.JLabel();
        rotuloQE5p = new javax.swing.JLabel();
        rotuloQE5A = new javax.swing.JLabel();
        rotuloLDQE5ADireito = new javax.swing.JLabel();
        rotuloLDQE5AEsquerdo = new javax.swing.JLabel();
        ComboBoxQE5ADireito = new javax.swing.JComboBox();
        ComboBoxQE5AEsquerdo = new javax.swing.JComboBox();
        rotuloLDQE5AA = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        rotuloQE5B = new javax.swing.JLabel();
        rotuloLDQE5BDireito = new javax.swing.JLabel();
        rotuloLDQE5BEsquerdo = new javax.swing.JLabel();
        ComboBoxQE5BDireito = new javax.swing.JComboBox();
        ComboBoxQE5BEsquerdo = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        rotuloLDQE5BB = new javax.swing.JLabel();
        campoQE5ADireito = new javax.swing.JFormattedTextField();
        campoQE5AEsquerdo = new javax.swing.JFormattedTextField();
        campoQE5BEsquerdo = new javax.swing.JFormattedTextField();
        campoQE5BDireito = new javax.swing.JFormattedTextField();
        rotuloQE5C = new javax.swing.JLabel();
        rotuloLDQE5CDireito = new javax.swing.JLabel();
        rotuloLDQE5CEsquerdo = new javax.swing.JLabel();
        ComboBoxQE5CDireito = new javax.swing.JComboBox();
        ComboBoxQE5CEsquerdo = new javax.swing.JComboBox();
        rotuloQE7 = new javax.swing.JLabel();
        rotuloQE7A = new javax.swing.JLabel();
        rotuloQE7AExcusãoDireita = new javax.swing.JLabel();
        ComboBoxQE7AExcusãoDireita = new javax.swing.JComboBox();
        rotuloQE7AExcusãoEsquerda = new javax.swing.JLabel();
        ComboBoxQE7AExcusãoEsquerda = new javax.swing.JComboBox();
        rotuloQE7AProtusão = new javax.swing.JLabel();
        ComboBoxQE7AProtusão = new javax.swing.JComboBox();
        rotuloQE7B = new javax.swing.JLabel();
        rotuloQE7BExcusãoDireita = new javax.swing.JLabel();
        ComboBoxQE7BExcusãoDireita = new javax.swing.JComboBox();
        ComboBoxQE7BExcusãoEsquerda = new javax.swing.JComboBox();
        rotuloQE7BExcusãoEsquerda = new javax.swing.JLabel();
        rotuloQE7BProtusão = new javax.swing.JLabel();
        ComboBoxQE7BExcusão = new javax.swing.JComboBox();
        rotuloQE14A = new javax.swing.JLabel();
        ComboBoxQE14a = new javax.swing.JComboBox();
        rotuloQE6 = new javax.swing.JLabel();
        rotuloQE6A = new javax.swing.JLabel();
        campoQE6A = new javax.swing.JFormattedTextField();
        rotuloQE6B = new javax.swing.JLabel();
        campoQE6B = new javax.swing.JFormattedTextField();
        rotuloQE6C = new javax.swing.JLabel();
        campoQE6AC = new javax.swing.JFormattedTextField();
        rotuloQE6D = new javax.swing.JLabel();
        campoQE6D = new javax.swing.JFormattedTextField();
        rotuloQE6Muscular = new javax.swing.JLabel();
        rotuloQE6Articular = new javax.swing.JLabel();
        ComboBoxQE6AMuscular = new javax.swing.JComboBox();
        ComboBoxQE6BMuscular = new javax.swing.JComboBox();
        ComboBoxQE6CMuscular = new javax.swing.JComboBox();
        ComboBoxQE6DDesvio = new javax.swing.JComboBox();
        ComboBoxQE6AArticular = new javax.swing.JComboBox();
        ComboBoxQE6BArticular = new javax.swing.JComboBox();
        ComboBoxQE6CArticular = new javax.swing.JComboBox();
        rotuloQE6Desvio = new javax.swing.JLabel();
        ComboBoxQE4DMuscular = new javax.swing.JComboBox();
        rotuloLDQE4Muscular = new javax.swing.JLabel();
        rotuloLDQE4Articular = new javax.swing.JLabel();
        ComboBoxQE4CMuscular = new javax.swing.JComboBox();
        ComboBoxQE4CArticular = new javax.swing.JComboBox();
        ComboBoxQE4DArticular = new javax.swing.JComboBox();
        rotuloQE2 = new javax.swing.JLabel();
        ComboBoxQE2LadoDireito = new javax.swing.JComboBox();
        rotuloQE2Direito = new javax.swing.JLabel();
        rotuloQE2Esquerdo = new javax.swing.JLabel();
        ComboBoxQE2LadoEsquerdo = new javax.swing.JComboBox();
        rotuloQE14B = new javax.swing.JLabel();
        ComboBoxQE14b = new javax.swing.JComboBox();
        rotuloQE3 = new javax.swing.JLabel();
        ComboBoxQE3Abertura = new javax.swing.JComboBox();
        rotuloQE3Tipo = new javax.swing.JLabel();
        campoQE3 = new javax.swing.JTextField();
        rotuloQE3Especifique = new javax.swing.JLabel();

        PanelQuestionarios.setBackground(new java.awt.Color(255, 255, 255));

        rotuloQuestionario.setText("QUESTIONÁRIO DO GRUPO I");

        rotuloPerguntas.setText("Perguntas:");

        QE3.setText("QE3 - Você já teve dor na face, nos maxilares, têmpora, na frente do ouvido, ou no ouvido no mês passado?");

        ComboBoxRespostaQE3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Não", "Sim" }));

        rotuloQE8.setText("QE8 - Dor muscular extra-oral com palpação");

        rotuloQE10.setText("QE10 - Dor muscular intra-oral com palpação");

        rotuloAQE8.setText("Temporal posterior (parte por trás da têmpora)");

        rotuloBQE8.setText("Temporal médio (meio da têmpora)");

        rotuloCQE8.setText("Temporal anteriror (parte anterior da têmpora)");

        rotuloDQE8.setText("Masseter superior (bochecha/abaixo do zigoma)");

        rotuloEQE8.setText("Masserter médio (bochecha/lado da face)");

        rotuloFQE8.setText("Masserter inferior (bochecha/linha da mandibula)");

        rotuloGQE8.setText("Região mandibular posterior (estilo-hiode / região posterior do digastrico) \"região da garganta\"");

        rotuloLDQE8.setText("Lado Direito");

        rotuloLEQE8.setText("Lado Esquerdo");

        ComboBoxQE8AD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));

        ComboBoxQE8BD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));

        ComboBoxQE8CD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));

        ComboBoxQE8DD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));

        ComboBoxQE8AE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));

        ComboBoxQE8ED.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));

        ComboBoxQE8FD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));

        ComboBoxQE8GD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));

        ComboBoxQE8BE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));

        ComboBoxQE8CE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));

        ComboBoxQE8DE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));

        ComboBoxQE8EE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));

        ComboBoxQE8FE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));

        ComboBoxQE8GE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));

        rotuloQE10A.setText("Área do pterigóideo lateral (atrás dos molares superiores)");

        rotuloQE10B.setText("Tendão do temporal (infra-bucal)");

        ComboBoxQE10AD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));

        rotuloLDQE10.setText("Lado Direito");

        rotuloLEQE10.setText("Lado Esquerdo");

        ComboBoxQE10BD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));

        ComboBoxQE10AE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));

        ComboBoxQE10BE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));

        rotuloQE1.setText("QE1 - Você tem dor no lado direito da sua face, lado esquerdo ou ambos os lados?");

        ComboBoxQE1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Não", "Direito", "Esquerdo", "Ambos", " " }));

        rotuloQE4A.setText("Abertura sem auxilio sem dor em mm");

        rotuloQE4B.setText("Abertura máxima sem auxilio em mm");

        rotuloQE4C.setText("Abertura máxima com auxilio em mm");

        rotuloQE4D.setText("Trespasse incisal vertical em mm");

        rotuloQE4.setText("QE4 - Extensão de movimento vertical");

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

        rotuloResultado.setText("*");

        rotuloHQE8.setText("Região sumandibular posterior (pterigódeo media/suprahióide/ região anterior do digástrico) \"abaixo do queixo\"");

        ComboBoxQE8HD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));

        ComboBoxQE8HE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));

        rotuloQuestionarioII.setText("QUESTIONÁRIO DO GRUPO II");

        rotuloQE5p.setText("QE5- Ruídos articulares (palpação)");

        rotuloQE5A.setText("Abertura");

        rotuloLDQE5ADireito.setText("Direito");

        rotuloLDQE5AEsquerdo.setText("Esquerdo");

        ComboBoxQE5ADireito.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum - 0", "Estalido - 1", "Crepitação Grosseira- 2", "Crepitação Fina - 3" }));

        ComboBoxQE5AEsquerdo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum - 0", "Estalido - 1", "Crepitação Grosseira- 2", "Crepitação Fina - 3" }));

        rotuloLDQE5AA.setText("Medida do estalido na abertura:");

        jLabel11.setText("mm");

        jLabel12.setText("mm");

        rotuloQE5B.setText("Fechamento");

        rotuloLDQE5BDireito.setText("Direito");

        rotuloLDQE5BEsquerdo.setText("Esquerdo");

        ComboBoxQE5BDireito.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum - 0", "Estalido - 1", "Crepitação Grosseira- 2", "Crepitação Fina - 3" }));

        ComboBoxQE5BEsquerdo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum - 0", "Estalido - 1", "Crepitação Grosseira- 2", "Crepitação Fina - 3" }));

        jLabel13.setText("mm");

        jLabel14.setText("mm");

        rotuloLDQE5BB.setText("Medida do estalido na abertura:");

        rotuloQE5C.setText("Estalido reciproco eliminado durante abertura protrusiva");

        rotuloLDQE5CDireito.setText("Direito");

        rotuloLDQE5CEsquerdo.setText("Esquerdo");

        ComboBoxQE5CDireito.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sim - 0", "Não - 1", "N/A - 8" }));

        ComboBoxQE5CEsquerdo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sim - 0", "Não - 1", "N/A - 8" }));

        rotuloQE7.setText("QE7 - Ruídos articulares nas excursões");

        rotuloQE7A.setText("Ruídos -  Direito");

        rotuloQE7AExcusãoDireita.setText("Excusão Direita");

        ComboBoxQE7AExcusãoDireita.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum - 0", "Estalido - 1", "Crepitação Grosseira- 2", "Crepitação Fina - 3" }));

        rotuloQE7AExcusãoEsquerda.setText("Excusão Esquerda");

        ComboBoxQE7AExcusãoEsquerda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum - 0", "Estalido - 1", "Crepitação Grosseira- 2", "Crepitação Fina - 3" }));

        rotuloQE7AProtusão.setText("Protrusão");

        ComboBoxQE7AProtusão.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum - 0", "Estalido - 1", "Crepitação Grosseira- 2", "Crepitação Fina - 3" }));

        rotuloQE7B.setText("Ruídos -  Esquerdo");

        rotuloQE7BExcusãoDireita.setText("Excusão Direita");

        ComboBoxQE7BExcusãoDireita.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum - 0", "Estalido - 1", "Crepitação Grosseira- 2", "Crepitação Fina - 3" }));

        ComboBoxQE7BExcusãoEsquerda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum - 0", "Estalido - 1", "Crepitação Grosseira- 2", "Crepitação Fina - 3" }));

        rotuloQE7BExcusãoEsquerda.setText("Excusão Esquerda");

        rotuloQE7BProtusão.setText("Protrusão");

        ComboBoxQE7BExcusão.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum - 0", "Estalido - 1", "Crepitação Grosseira- 2", "Crepitação Fina - 3" }));

        rotuloQE14A.setText("QE14a - Você alguma vez teve travamento de forma que não foi possivel abrir a boca por todo o trajeto?");

        ComboBoxQE14a.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sim", "Não" }));

        rotuloQE6.setText("QE6 - Excursões");

        rotuloQE6A.setText("Excursão Lateral Direita");

        try {
            campoQE6A.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        rotuloQE6B.setText("Excursão Lateral Esquerda");

        try {
            campoQE6B.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        rotuloQE6C.setText("Protusão");

        try {
            campoQE6AC.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        rotuloQE6D.setText("Desvio de linha média");

        try {
            campoQE6D.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        

        rotuloQE6Muscular.setText("Dor Muscular");

        rotuloQE6Articular.setText("Dor Articular");

        ComboBoxQE6AMuscular.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum - 0", "direito - 1", "esquerdo- 2", "ambos - 3" }));

        ComboBoxQE6BMuscular.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum - 0", "direito - 1", "esquerdo- 2", "ambos - 3" }));

        ComboBoxQE6CMuscular.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum - 0", "direito - 1", "esquerdo- 2", "ambos - 3" }));

        ComboBoxQE6DDesvio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "direito - 1", "esquerdo- 2", "nenhum - 8" }));

        ComboBoxQE6AArticular.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum - 0", "direito - 1", "esquerdo- 2", "ambos - 3" }));

        ComboBoxQE6BArticular.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum - 0", "direito - 1", "esquerdo- 2", "ambos - 3" }));

        ComboBoxQE6CArticular.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum - 0", "direito - 1", "esquerdo- 2", "ambos - 3" }));

        rotuloQE6Desvio.setText("Desvio");

        ComboBoxQE4DMuscular.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum - 0", "direito - 1", "esquerdo- 2", "ambos - 3" }));

        rotuloLDQE4Muscular.setText("Dor Muscular");

        rotuloLDQE4Articular.setText("Dor Articular");

        ComboBoxQE4CMuscular.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum - 0", "direito - 1", "esquerdo- 2", "ambos - 3" }));

        ComboBoxQE4CArticular.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum - 0", "direito - 1", "esquerdo- 2", "ambos - 3" }));

        ComboBoxQE4DArticular.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum - 0", "direito - 1", "esquerdo- 2", "ambos - 3" }));

        rotuloQE2.setText("QE2 - Você poderia apontar aa áreas aonde você sente dor? ");

        ComboBoxQE2LadoDireito.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum - 0", "Articulação - 1", "Músculos - 2", "Ambos - 3", " ", " " }));

        rotuloQE2Direito.setText("Lado Direito");

        rotuloQE2Esquerdo.setText("Lado Esquerdo");

        ComboBoxQE2LadoEsquerdo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum - 0", "Articulação - 1", "Músculos - 2", "Ambos - 3", " ", " " }));

        rotuloQE14B.setText("QE14b - Esta limitação de abertura mandibular foi severa a ponto de interferir com a sua capacidade de mastigar?");

        ComboBoxQE14b.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sim", "Não" }));

        rotuloQE3.setText("QE3 - Padrão de Abertura");

        ComboBoxQE3Abertura.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Reto - 1", "Desvio lateral direito (não corrigido) - 1", "Desvio lateral direito (S) - 2", "Desvio lateral esquerdo (não corrigido) - 3", "Desvio lateral direito (S) - 4", "Outro - 5" }));

        rotuloQE3Tipo.setText("Tipo");

        rotuloQE3Especifique.setText("(especifique)");
    }
    
    private void analiseGrupoII_direita(){
        
        //ESTALIDO NA ABERTURA E NO FECHO
        if("Estalido - 1".equalsIgnoreCase(ComboBoxQE5ADireito.getSelectedItem().toString()) && "Estalido - 1".equalsIgnoreCase(ComboBoxQE5BDireito.getSelectedItem().toString())){
            rqE5a = 1;
            rqE5b = 1;
            
            rqE5amm = Integer.parseInt(campoQE5ADireito.getText());
            rqE5bmm = Integer.parseInt(campoQE5BDireito.getText());
            
            //PAREI AQUI EM 03/02/2013
        }
        
        //ESTALIDO NA ABERTURA OU NO FECHO
        else if("Estalido - 1".equalsIgnoreCase(ComboBoxQE5ADireito.getSelectedItem().toString()) || "Estalido - 1".equalsIgnoreCase(ComboBoxQE5BDireito.getSelectedItem().toString())){
            
            if ("Estalido - 1".equalsIgnoreCase(ComboBoxQE5ADireito.getSelectedItem().toString())){
                rqE5a = 1;
            }
            
            else{
                rqE5b = 1;
            }
        }
        
        //SEM ESTALIDO NO MOVIMENTO VERTICAL
        else{
            
        }
    }

    private void configurarBotoes() {
        
        botaoDiagnosticar.setText("Diagnosticar");
        botaoDiagnosticar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String rqe3 = ComboBoxRespostaQE3.getSelectedItem().toString();

                if ("sim".equalsIgnoreCase(rqe3)) {
                    rq3 = 1;
                } else {
                    rq3 = 0;
                }
                somaqE8 = 0;
                String QE8AD, QE8AE, QE8BD, QE8BE, QE8CD, QE8CE,
                        QE8DD, QE8DE, QE8ED, QE8EE, QE8FD, QE8FE,
                        QE8GD, QE8GE, QE8HD, QE8HE;

                String QE10AD, QE10AE, QE10BD, QE10BE;



                //QE8 - Dor muscular extra-oral com palpação
                // A                
                QE8AD = ComboBoxQE8AD.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE8AD)) {
                    somaqE8++;
                }

                QE8AE = ComboBoxQE8AE.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE8AE)) {
                    somaqE8++;
                }
                // B                
                QE8BD = ComboBoxQE8BD.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE8BD)) {
                    somaqE8++;
                }
                QE8BE = ComboBoxQE8BE.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE8BE)) {
                    somaqE8++;
                }
                // C
                QE8CD = ComboBoxQE8CD.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE8CD)) {
                    somaqE8++;
                }
                QE8CE = ComboBoxQE8CE.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE8CE)) {
                    somaqE8++;
                }
                // D
                QE8DD = ComboBoxQE8DD.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE8DD)) {
                    somaqE8++;
                }
                QE8DE = ComboBoxQE8DE.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE8DE)) {
                    somaqE8++;
                }
                // E
                QE8ED = ComboBoxQE8ED.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE8ED)) {
                    somaqE8++;
                }
                QE8EE = ComboBoxQE8EE.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE8EE)) {
                    somaqE8++;
                }
                // F
                QE8FD = ComboBoxQE8FD.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE8FD)) {
                    somaqE8++;
                }
                QE8FE = ComboBoxQE8FE.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE8FE)) {
                    somaqE8++;
                }
                // G
                QE8GD = ComboBoxQE8GD.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE8GD)) {
                    somaqE8++;
                }
                QE8GE = ComboBoxQE8GE.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE8GE)) {
                    somaqE8++;
                }
                // H
                QE8HD = ComboBoxQE8HD.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE8HD)) {
                    somaqE8++;
                }
                QE8HE = ComboBoxQE8HE.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE8HE)) {
                    somaqE8++;
                }

                // QE10 - Dor muscular intra-oral com palpação   QE10AD, QE10AE, QE10BD, QE10BE
                QE10AD = ComboBoxQE10AD.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE10AD)) {
                    somaqE10++;
                }
                QE10AE = ComboBoxQE10AE.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE10AE)) {
                    somaqE10++;
                }

                QE10BD = ComboBoxQE10BD.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE10BD)) {
                    somaqE10++;
                }
                QE10BE = ComboBoxQE10BE.getSelectedItem().toString();
                if (!"O".equalsIgnoreCase(QE10BE)) {
                    somaqE10++;
                }

                //  QUESTÃO 1 QE1 
                String rqe1 = ComboBoxQE1.getSelectedItem().toString();
                if ("não".equalsIgnoreCase(rqe1)) {
                    rqE1 = 0;
                } else {
                    rqE1 = 1;
                }

                // QUESTÃO 4                 
                rqE4a = Integer.parseInt(campoQE4A.getText());
                rqE4b = Integer.parseInt(campoQE4B.getText());
                rqE4c = Integer.parseInt(campoQE4C.getText());
                rqE4d = Integer.parseInt(campoQE4D.getText());

                String diagnostico = "";
                diagnostico = grupo.diagnostico(rq3, somaqE8, somaqE10, rqE1, rqE4a, rqE4b, rqE4c, rqE4d);
                rotuloResultado.setText(diagnostico);
                controlador.diagnosticar(rqe3, QE8AD, QE8AE, QE8BD, QE8BE, QE8CD, QE8CE, QE8DD, QE8DE, QE8ED, QE8EE, QE8FD, QE8FE, 
                        QE8GD, QE8GE, QE8HD, QE8HE, QE10AD, QE10AE, QE10BD, QE10BE, rqe1, campoQE4A.getText(), campoQE4B.getText(), campoQE4C.getText(),
                        campoQE4D.getText(), rq3, somaqE8, somaqE10, rqE1, rqE4a, rqE4b, rqE4c, rqE4d);
            }
        });


        ComboBoxQE1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String rqe1 = ComboBoxQE1.getSelectedItem().toString();
                if ("não".equalsIgnoreCase(rqe1)) {
                    rqE1 = 0;
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
                        .addContainerGap()
                        .addComponent(rotuloQE7))
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
                        .addGap(278, 278, 278)
                        .addComponent(rotuloQuestionario))
                    .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rotuloQE10A)
                                    .addComponent(rotuloQE10B))
                                .addGap(107, 107, 107)
                                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rotuloLDQE10)
                                    .addComponent(ComboBoxQE10AD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ComboBoxQE10BD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                                    .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rotuloQE4C)
                                        .addComponent(rotuloQE4D))
                                    .addGap(18, 18, 18)
                                    .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(campoQE4D, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campoQE4C, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(49, 49, 49)
                                    .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                                            .addComponent(rotuloLDQE4Muscular)
                                            .addGap(28, 28, 28)
                                            .addComponent(rotuloLDQE4Articular))
                                        .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                                            .addComponent(ComboBoxQE4DMuscular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(ComboBoxQE4DArticular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                                            .addComponent(ComboBoxQE4CMuscular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(ComboBoxQE4CArticular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                                    .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                                            .addComponent(rotuloQE4A)
                                            .addGap(18, 18, 18)
                                            .addComponent(campoQE4A, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                                            .addComponent(rotuloQE4B)
                                            .addGap(18, 18, 18)
                                            .addComponent(campoQE4B, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(49, 49, 49)
                                    .addComponent(rotuloQuestionarioII))))
                        .addGap(38, 38, 38)
                        .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboBoxQE10BE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotuloLEQE10)
                            .addComponent(ComboBoxQE10AE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rotuloQE5p))
                    .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                                .addComponent(rotuloQE5A)
                                .addGap(116, 116, 116)
                                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ComboBoxQE5ADireito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rotuloLDQE5ADireito)))
                            .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                                .addComponent(rotuloLDQE5AA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoQE5ADireito, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)))
                        .addGap(18, 18, 18)
                        .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                                .addComponent(campoQE5AEsquerdo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12))
                            .addComponent(rotuloLDQE5AEsquerdo)
                            .addComponent(ComboBoxQE5AEsquerdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rotuloQE5C))
                    .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rotuloLDQE5CDireito)
                            .addComponent(ComboBoxQE5CDireito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboBoxQE5CEsquerdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotuloLDQE5CEsquerdo)))
                    .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rotuloQE7A))
                    .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                                .addGap(314, 314, 314)
                                .addComponent(campoQE5BEsquerdo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13))
                            .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                                .addComponent(rotuloLDQE5BB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoQE5BDireito, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel14))))
                    .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rotuloQE7B))
                    .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rotuloQE14A))
                    .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rotuloQE6)
                            .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                                        .addComponent(rotuloQE6A)
                                        .addGap(18, 18, 18)
                                        .addComponent(campoQE6A, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                                        .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rotuloQE6B)
                                            .addComponent(rotuloQE6C)
                                            .addComponent(rotuloQE6D))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(campoQE6AC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(campoQE6B, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(campoQE6D, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(47, 47, 47)
                        .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboBoxQE6DDesvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rotuloQE6Muscular)
                                    .addComponent(ComboBoxQE6AMuscular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                                        .addGap(64, 64, 64)
                                        .addComponent(rotuloQE6Articular))
                                    .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ComboBoxQE6BArticular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ComboBoxQE6AArticular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ComboBoxQE6CArticular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(ComboBoxQE6BMuscular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxQE6CMuscular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotuloQE6Desvio)))
                    .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(ComboBoxQE14a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                                    .addComponent(rotuloQE7BExcusãoDireita)
                                    .addGap(75, 75, 75)
                                    .addComponent(rotuloQE7BExcusãoEsquerda)
                                    .addGap(61, 61, 61)
                                    .addComponent(rotuloQE7BProtusão))
                                .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                                    .addComponent(ComboBoxQE7BExcusãoDireita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ComboBoxQE7BExcusãoEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ComboBoxQE7BExcusão, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                                .addComponent(rotuloQE5B)
                                .addGap(100, 100, 100)
                                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ComboBoxQE5BDireito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rotuloLDQE5BDireito))
                                .addGap(18, 18, 18)
                                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rotuloLDQE5BEsquerdo)
                                    .addComponent(ComboBoxQE5BEsquerdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                                    .addComponent(ComboBoxQE7AExcusãoDireita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ComboBoxQE7AExcusãoEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ComboBoxQE7AProtusão, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                                    .addComponent(rotuloQE7AExcusãoDireita)
                                    .addGap(75, 75, 75)
                                    .addComponent(rotuloQE7AExcusãoEsquerda)
                                    .addGap(61, 61, 61)
                                    .addComponent(rotuloQE7AProtusão)))))
                    .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rotuloQE2))
                    .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rotuloQE2Direito)
                            .addComponent(ComboBoxQE2LadoDireito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboBoxQE2LadoEsquerdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotuloQE2Esquerdo)))
                    .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botaoDiagnosticar)
                        .addGap(18, 18, 18)
                        .addComponent(rotuloResultado))
                    .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rotuloQE14B))
                    .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(ComboBoxQE14b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rotuloQE3))
                    .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelQuestionariosLayout.createSequentialGroup()
                                .addComponent(rotuloQE3Tipo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoQE3))
                            .addComponent(ComboBoxQE3Abertura, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rotuloQE3Especifique)))
                .addContainerGap(284, Short.MAX_VALUE))
        );
        PanelQuestionariosLayout.setVerticalGroup(
            PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelQuestionariosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(rotuloQuestionario)
                .addGap(58, 58, 58)
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
                .addGap(18, 18, 18)
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloLDQE4Muscular)
                    .addComponent(rotuloLDQE4Articular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloQE4C)
                    .addComponent(campoQE4C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxQE4CMuscular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxQE4CArticular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloQE4D)
                    .addComponent(campoQE4D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxQE4DMuscular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxQE4DArticular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addComponent(rotuloQuestionarioII)
                .addGap(32, 32, 32)
                .addComponent(rotuloQE5p)
                .addGap(39, 39, 39)
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloLDQE5ADireito)
                    .addComponent(rotuloLDQE5AEsquerdo)
                    .addComponent(rotuloQE5A))
                .addGap(18, 18, 18)
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxQE5ADireito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxQE5AEsquerdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloLDQE5AA)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(campoQE5ADireito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoQE5AEsquerdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloLDQE5BDireito)
                    .addComponent(rotuloLDQE5BEsquerdo)
                    .addComponent(rotuloQE5B))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxQE5BDireito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxQE5BEsquerdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloLDQE5BB)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(campoQE5BDireito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoQE5BEsquerdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(rotuloQE5C)
                .addGap(18, 18, 18)
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloLDQE5CDireito)
                    .addComponent(rotuloLDQE5CEsquerdo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxQE5CDireito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxQE5CEsquerdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(rotuloQE7)
                .addGap(32, 32, 32)
                .addComponent(rotuloQE7A)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloQE7AExcusãoDireita)
                    .addComponent(rotuloQE7AExcusãoEsquerda)
                    .addComponent(rotuloQE7AProtusão))
                .addGap(18, 18, 18)
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxQE7AExcusãoDireita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxQE7AExcusãoEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxQE7AProtusão, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(rotuloQE7B)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloQE7BExcusãoDireita)
                    .addComponent(rotuloQE7BExcusãoEsquerda)
                    .addComponent(rotuloQE7BProtusão))
                .addGap(18, 18, 18)
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxQE7BExcusãoDireita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxQE7BExcusãoEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxQE7BExcusão, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(rotuloQE14A)
                .addGap(18, 18, 18)
                .addComponent(ComboBoxQE14a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rotuloQE14B)
                .addGap(18, 18, 18)
                .addComponent(ComboBoxQE14b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloQE6)
                    .addComponent(rotuloQE6Muscular)
                    .addComponent(rotuloQE6Articular))
                .addGap(18, 18, 18)
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloQE6A)
                    .addComponent(campoQE6A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxQE6AMuscular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxQE6AArticular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloQE6B)
                    .addComponent(campoQE6B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxQE6BMuscular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxQE6BArticular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloQE6C)
                    .addComponent(campoQE6AC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxQE6CMuscular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxQE6CArticular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(rotuloQE6Desvio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxQE6DDesvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotuloQE6D)
                    .addComponent(campoQE6D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(rotuloQE3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ComboBoxQE3Abertura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloQE3Tipo)
                    .addComponent(campoQE3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotuloQE3Especifique))
                .addGap(34, 34, 34)
                .addComponent(rotuloQE2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloQE2Direito)
                    .addComponent(rotuloQE2Esquerdo))
                .addGap(18, 18, 18)
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxQE2LadoDireito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxQE2LadoEsquerdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(PanelQuestionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoDiagnosticar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rotuloResultado, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(221, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(PanelQuestionarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 38, Short.MAX_VALUE))
        );

        pack();
    }
}
