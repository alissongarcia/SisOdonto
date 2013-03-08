/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.Paciente;
import negocio.Controlador;

/**
 *
 * @author Carlos
 */
public class WiewDadosPessoais extends JFrame {

    private javax.swing.JComboBox ComboBoxSexo;
    private javax.swing.JLabel GrupoI;
    private javax.swing.JLabel GrupoII;
    private javax.swing.JLabel GrupoIII;
    private javax.swing.JLabel GrupoIV;
    private javax.swing.JLabel GrupoV;
    private javax.swing.JPanel PainelResultadoGrupos;
    private javax.swing.JScrollPane ScrollPaneTabela;
    private javax.swing.JTable TabelaPesquisa;
    private javax.swing.JButton botaoAlterar;
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoLimparCampos;
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.JTextField campoBairro;
    private javax.swing.JFormattedTextField campoCelular;
    private javax.swing.JFormattedTextField campoCep;
    private javax.swing.JTextField campoCidade;
    private javax.swing.JFormattedTextField campoCpf;
    private javax.swing.JFormattedTextField campoIdade;
    private javax.swing.JTextField campoNacionalidade;
    private javax.swing.JTextField campoNaturalidade;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoNumero;
    private javax.swing.JTextField campoRaca;
    private javax.swing.JTextField campoRua;
    private javax.swing.JFormattedTextField campoTelefone;
    private javax.swing.JFormattedTextField campoUF;
    private javax.swing.JLabel erroBairro;
    private javax.swing.JLabel erroCelular;
    private javax.swing.JLabel erroCep;
    private javax.swing.JLabel erroCidade;
    private javax.swing.JLabel erroCpf;
    private javax.swing.JLabel erroIdade;
    private javax.swing.JLabel erroNacionalidade;
    private javax.swing.JLabel erroNaturalidade;
    private javax.swing.JLabel erroNome;
    private javax.swing.JLabel erroNumero;
    private javax.swing.JLabel erroRaca;
    private javax.swing.JLabel erroRua;
    private javax.swing.JLabel erroTelefone;
    private javax.swing.JLabel erroUF;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel labelBairro;
    private javax.swing.JLabel labelCPF;
    private javax.swing.JLabel labelCelular;
    private javax.swing.JLabel labelCep;
    private javax.swing.JLabel labelCidade;
    private javax.swing.JLabel labelDadosPessoais;
    private javax.swing.JLabel labelGrupoI;
    private javax.swing.JLabel labelGrupoII;
    private javax.swing.JLabel labelGrupoIII;
    private javax.swing.JLabel labelGrupoIV;
    private javax.swing.JLabel labelGrupoV;
    private javax.swing.JLabel labelIdade;
    private javax.swing.JLabel labelNacionalidade;
    private javax.swing.JLabel labelNaturalidade;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelRaca;
    private javax.swing.JLabel labelResultadoPesquisa;
    private javax.swing.JLabel labelRua;
    private javax.swing.JLabel labelSexo;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelUF;
    private javax.swing.JPanel paienlEditar;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JPanel painelCadastrar;
    private javax.swing.JPanel painelDados;
    private javax.swing.JPanel painelDiagnostico2;
    private javax.swing.JPanel painelExcluir;
    private javax.swing.JPanel painelLimpar;
    private javax.swing.JPanel painelPesquisar;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JPanel painelResultadoDiagnostico;
    private javax.swing.JPanel painelTabela;
    private javax.swing.JPanel painelTabelaInterna;
    private javax.swing.JPanel painelbotoes2;
    private javax.swing.JPanel paineltabela2;
    
    private Paciente paciente;
    private Controlador controlador;

    public WiewDadosPessoais() {

        inicializarvariaveis();
        configuracoes();
        acoesBotoes();
    }

    private void inicializarvariaveis() {
        painelPrincipal = new javax.swing.JPanel();
        labelDadosPessoais = new javax.swing.JLabel();
        painelDados = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        labelRua = new javax.swing.JLabel();
        labelBairro = new javax.swing.JLabel();
        labelNumero = new javax.swing.JLabel();
        labelCidade = new javax.swing.JLabel();
        labelCep = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        campoRua = new javax.swing.JTextField();
        campoBairro = new javax.swing.JTextField();
        campoNumero = new javax.swing.JTextField();
        campoCidade = new javax.swing.JTextField();
        campoCep = new javax.swing.JFormattedTextField();
        labelUF = new javax.swing.JLabel();
        campoUF = new javax.swing.JFormattedTextField();
        labelNaturalidade = new javax.swing.JLabel();
        campoNaturalidade = new javax.swing.JTextField();
        labelNacionalidade = new javax.swing.JLabel();
        campoNacionalidade = new javax.swing.JTextField();
        labelIdade = new javax.swing.JLabel();
        campoIdade = new javax.swing.JFormattedTextField();
        labelSexo = new javax.swing.JLabel();
        ComboBoxSexo = new javax.swing.JComboBox();
        labelTelefone = new javax.swing.JLabel();
        labelCelular = new javax.swing.JLabel();
        campoTelefone = new javax.swing.JFormattedTextField();
        campoCelular = new javax.swing.JFormattedTextField();
        painelResultadoDiagnostico = new javax.swing.JPanel();
        painelDiagnostico2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        PainelResultadoGrupos = new javax.swing.JPanel();
        GrupoI = new javax.swing.JLabel();
        GrupoII = new javax.swing.JLabel();
        GrupoIII = new javax.swing.JLabel();
        GrupoIV = new javax.swing.JLabel();
        GrupoV = new javax.swing.JLabel();
        labelGrupoI = new javax.swing.JLabel();
        labelGrupoII = new javax.swing.JLabel();
        labelGrupoIII = new javax.swing.JLabel();
        labelGrupoIV = new javax.swing.JLabel();
        labelGrupoV = new javax.swing.JLabel();
        labelCPF = new javax.swing.JLabel();
        campoCpf = new javax.swing.JFormattedTextField();
        erroNome = new javax.swing.JLabel();
        erroRua = new javax.swing.JLabel();
        erroBairro = new javax.swing.JLabel();
        erroNumero = new javax.swing.JLabel();
        erroCidade = new javax.swing.JLabel();
        erroUF = new javax.swing.JLabel();
        erroCep = new javax.swing.JLabel();
        erroCpf = new javax.swing.JLabel();
        erroNaturalidade = new javax.swing.JLabel();
        erroNacionalidade = new javax.swing.JLabel();
        erroTelefone = new javax.swing.JLabel();
        erroCelular = new javax.swing.JLabel();
        erroIdade = new javax.swing.JLabel();
        labelRaca = new javax.swing.JLabel();
        campoRaca = new javax.swing.JTextField();
        erroRaca = new javax.swing.JLabel();
        painelBotoes = new javax.swing.JPanel();
        painelbotoes2 = new javax.swing.JPanel();
        painelCadastrar = new javax.swing.JPanel();
        botaoCadastrar = new javax.swing.JButton();
        painelPesquisar = new javax.swing.JPanel();
        botaoPesquisar = new javax.swing.JButton();
        painelExcluir = new javax.swing.JPanel();
        botaoExcluir = new javax.swing.JButton();
        paienlEditar = new javax.swing.JPanel();
        botaoAlterar = new javax.swing.JButton();
        painelLimpar = new javax.swing.JPanel();
        botaoLimparCampos = new javax.swing.JButton();
        painelTabela = new javax.swing.JPanel();
        paineltabela2 = new javax.swing.JPanel();
        labelResultadoPesquisa = new javax.swing.JLabel();
        painelTabelaInterna = new javax.swing.JPanel();
        ScrollPaneTabela = new javax.swing.JScrollPane();
        TabelaPesquisa = new javax.swing.JTable();

        controlador = new Controlador();

    }

    private void configuracoes() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        painelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        painelPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelDadosPessoais.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelDadosPessoais.setText("Dados Pessoais do Paciente");

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelDadosPessoais)
                .addGap(189, 189, 189))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelDadosPessoais)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelDados.setBackground(new java.awt.Color(255, 255, 255));
        painelDados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelNome.setText("Nome:");

        labelRua.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelRua.setText("Rua:");

        labelBairro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelBairro.setText("Bairro");

        labelNumero.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelNumero.setText("Numero:");

        labelCidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelCidade.setText("Cidade");

        labelCep.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelCep.setText("Cep:");       

        labelUF.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelUF.setText("UF:");

        labelNaturalidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelNaturalidade.setText("Naturalidade:");

        labelNacionalidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelNacionalidade.setText("Nacionalidade:");

        labelIdade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelIdade.setText("Idade:");

        labelSexo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelSexo.setText("Sexo:");

        ComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M- Masculino ", "F - Feminino " }));

        labelTelefone.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelTelefone.setText("Telefone:");

        labelCelular.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelCelular.setText("Celular:");

        painelResultadoDiagnostico.setBackground(new java.awt.Color(255, 255, 255));
        painelResultadoDiagnostico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        painelDiagnostico2.setBackground(new java.awt.Color(255, 255, 255));
        painelDiagnostico2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel15.setText("Diagnosticos");

        javax.swing.GroupLayout painelDiagnostico2Layout = new javax.swing.GroupLayout(painelDiagnostico2);
        painelDiagnostico2.setLayout(painelDiagnostico2Layout);
        painelDiagnostico2Layout.setHorizontalGroup(
            painelDiagnostico2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDiagnostico2Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel15)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        painelDiagnostico2Layout.setVerticalGroup(
            painelDiagnostico2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDiagnostico2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PainelResultadoGrupos.setBackground(new java.awt.Color(255, 255, 255));
        PainelResultadoGrupos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        GrupoI.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        GrupoI.setText("Grupo I:");

        GrupoII.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        GrupoII.setText("Grupo II:");

        GrupoIII.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        GrupoIII.setText("Grupo III:");

        GrupoIV.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        GrupoIV.setText("Grupo IV:");

        GrupoV.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        GrupoV.setText("Grupo V:");

        labelGrupoI.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelGrupoI.setForeground(new java.awt.Color(255, 0, 51));
        labelGrupoI.setText("resultado do diagnostico");
        labelGrupoI.setToolTipText("resultado do diagnostico");

        labelGrupoII.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelGrupoII.setForeground(new java.awt.Color(255, 0, 51));
        labelGrupoII.setText("resultado do diagnostico");
        labelGrupoII.setToolTipText("resultado do diagnostico");

        labelGrupoIII.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelGrupoIII.setForeground(new java.awt.Color(255, 0, 51));
        labelGrupoIII.setText("resultado do diagnostico");
        labelGrupoIII.setToolTipText("resultado do diagnostico");

        labelGrupoIV.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelGrupoIV.setForeground(new java.awt.Color(255, 0, 51));
        labelGrupoIV.setText("resultado do diagnostico");
        labelGrupoIV.setToolTipText("resultado do diagnostico");

        labelGrupoV.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelGrupoV.setForeground(new java.awt.Color(255, 0, 51));
        labelGrupoV.setText("resultado do diagnostico");
        labelGrupoV.setToolTipText("resultado do diagnostico");

        javax.swing.GroupLayout PainelResultadoGruposLayout = new javax.swing.GroupLayout(PainelResultadoGrupos);
        PainelResultadoGrupos.setLayout(PainelResultadoGruposLayout);
        PainelResultadoGruposLayout.setHorizontalGroup(
            PainelResultadoGruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelResultadoGruposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelResultadoGruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GrupoIII)
                    .addComponent(GrupoI)
                    .addComponent(labelGrupoI)
                    .addComponent(GrupoII)
                    .addComponent(labelGrupoII)
                    .addComponent(labelGrupoIII)
                    .addComponent(GrupoIV)
                    .addComponent(labelGrupoIV)
                    .addComponent(GrupoV)
                    .addComponent(labelGrupoV))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelResultadoGruposLayout.setVerticalGroup(
            PainelResultadoGruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelResultadoGruposLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GrupoI)
                .addGap(10, 10, 10)
                .addComponent(labelGrupoI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(GrupoII)
                .addGap(15, 15, 15)
                .addComponent(labelGrupoII)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(GrupoIII)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelGrupoIII)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(GrupoIV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelGrupoIV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(GrupoV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelGrupoV)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelResultadoDiagnosticoLayout = new javax.swing.GroupLayout(painelResultadoDiagnostico);
        painelResultadoDiagnostico.setLayout(painelResultadoDiagnosticoLayout);
        painelResultadoDiagnosticoLayout.setHorizontalGroup(
            painelResultadoDiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelResultadoDiagnosticoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelResultadoDiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PainelResultadoGrupos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelDiagnostico2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelResultadoDiagnosticoLayout.setVerticalGroup(
            painelResultadoDiagnosticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelResultadoDiagnosticoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelDiagnostico2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelResultadoGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelCPF.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelCPF.setText("Cpf:");

        erroNome.setForeground(new java.awt.Color(255, 0, 51));
        erroNome.setText("*");

        erroRua.setForeground(new java.awt.Color(255, 0, 51));
        erroRua.setText("*");

        erroBairro.setForeground(new java.awt.Color(255, 0, 51));
        erroBairro.setText("*");

        erroNumero.setForeground(new java.awt.Color(255, 0, 51));
        erroNumero.setText("*");

        erroCidade.setForeground(new java.awt.Color(255, 0, 51));
        erroCidade.setText("*");

        erroUF.setForeground(new java.awt.Color(255, 0, 51));
        erroUF.setText("*");

        erroCep.setForeground(new java.awt.Color(255, 0, 51));
        erroCep.setText("*");

        erroCpf.setForeground(new java.awt.Color(255, 0, 51));
        erroCpf.setText("*");

        erroNaturalidade.setForeground(new java.awt.Color(255, 0, 51));
        erroNaturalidade.setText("*");

        erroNacionalidade.setForeground(new java.awt.Color(255, 0, 51));
        erroNacionalidade.setText("*");

        erroTelefone.setForeground(new java.awt.Color(255, 0, 51));
        erroTelefone.setText("*");

        erroCelular.setForeground(new java.awt.Color(255, 0, 51));
        erroCelular.setText("*");

        erroIdade.setForeground(new java.awt.Color(255, 0, 51));
        erroIdade.setText("*");

        labelRaca.setText("Raça:");

        erroRaca.setForeground(new java.awt.Color(255, 0, 51));
        erroRaca.setText("*");

        javax.swing.GroupLayout painelDadosLayout = new javax.swing.GroupLayout(painelDados);
        painelDados.setLayout(painelDadosLayout);
        painelDadosLayout.setHorizontalGroup(
            painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTelefone)
                    .addComponent(labelCelular)
                    .addComponent(labelNacionalidade)
                    .addComponent(labelIdade)
                    .addGroup(painelDadosLayout.createSequentialGroup()
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNaturalidade)
                            .addComponent(labelNome)
                            .addComponent(labelRua)
                            .addComponent(labelBairro)
                            .addComponent(labelCidade)
                            .addComponent(labelNumero)
                            .addComponent(labelCep)
                            .addComponent(labelCPF)
                            .addComponent(labelUF)
                            .addComponent(labelSexo)
                            .addComponent(labelRaca))
                        .addGap(18, 18, 18)
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoRua)
                            .addGroup(painelDadosLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelDadosLayout.createSequentialGroup()
                                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(campoCidade, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(campoNumero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(campoUF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(erroNumero)
                                            .addComponent(erroCidade)
                                            .addComponent(erroUF)))
                                    .addGroup(painelDadosLayout.createSequentialGroup()
                                        .addComponent(campoCep, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(erroCep))
                                    .addGroup(painelDadosLayout.createSequentialGroup()
                                        .addComponent(campoNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(erroNacionalidade))
                                    .addGroup(painelDadosLayout.createSequentialGroup()
                                        .addComponent(campoNaturalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(erroNaturalidade))
                                    .addGroup(painelDadosLayout.createSequentialGroup()
                                        .addComponent(campoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(erroCpf))
                                    .addComponent(ComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(painelDadosLayout.createSequentialGroup()
                                        .addComponent(campoIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(83, 83, 83)
                                        .addComponent(erroIdade))
                                    .addGroup(painelDadosLayout.createSequentialGroup()
                                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(campoRaca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                            .addComponent(campoTelefone, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(campoCelular, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(erroTelefone)
                                            .addComponent(erroCelular)
                                            .addComponent(erroRaca))))
                                .addGap(84, 84, 84)
                                .addComponent(painelResultadoDiagnostico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(campoNome)
                            .addComponent(campoBairro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(erroNome)
                            .addComponent(erroRua)
                            .addComponent(erroBairro))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelDadosLayout.setVerticalGroup(
            painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(erroNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRua)
                    .addComponent(campoRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(erroRua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBairro)
                    .addComponent(campoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(erroBairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadosLayout.createSequentialGroup()
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNumero)
                            .addComponent(campoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(erroNumero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCidade)
                            .addComponent(campoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(erroCidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelUF)
                            .addComponent(campoUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(erroUF))
                        .addGap(7, 7, 7)
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCep)
                            .addComponent(campoCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(erroCep))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCPF)
                            .addComponent(campoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(erroCpf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNaturalidade)
                            .addComponent(campoNaturalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(erroNaturalidade))
                        .addGap(8, 8, 8)
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNacionalidade)
                            .addComponent(campoNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(erroNacionalidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelIdade)
                            .addComponent(campoIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(erroIdade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTelefone)
                            .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(erroTelefone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCelular)
                            .addComponent(campoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(erroCelular))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelSexo)
                            .addComponent(ComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelRaca)
                            .addComponent(campoRaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(erroRaca)))
                    .addComponent(painelResultadoDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelBotoes.setBackground(new java.awt.Color(255, 255, 255));
        painelBotoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        painelbotoes2.setBackground(new java.awt.Color(255, 255, 255));
        painelbotoes2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        painelCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        painelCadastrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        
        javax.swing.GroupLayout painelCadastrarLayout = new javax.swing.GroupLayout(painelCadastrar);
        painelCadastrar.setLayout(painelCadastrarLayout);
        painelCadastrarLayout.setHorizontalGroup(
            painelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastrarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoCadastrar)
                .addGap(18, 18, 18))
        );
        painelCadastrarLayout.setVerticalGroup(
            painelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoCadastrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelPesquisar.setBackground(new java.awt.Color(255, 255, 255));
        painelPesquisar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        
        javax.swing.GroupLayout painelPesquisarLayout = new javax.swing.GroupLayout(painelPesquisar);
        painelPesquisar.setLayout(painelPesquisarLayout);
        painelPesquisarLayout.setHorizontalGroup(
            painelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPesquisarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoPesquisar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelPesquisarLayout.setVerticalGroup(
            painelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPesquisarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoPesquisar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelExcluir.setBackground(new java.awt.Color(255, 255, 255));
        painelExcluir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout painelExcluirLayout = new javax.swing.GroupLayout(painelExcluir);
        painelExcluir.setLayout(painelExcluirLayout);
        painelExcluirLayout.setHorizontalGroup(
            painelExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelExcluirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoExcluir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelExcluirLayout.setVerticalGroup(
            painelExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelExcluirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoExcluir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        paienlEditar.setBackground(new java.awt.Color(255, 255, 255));
        paienlEditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));        

        javax.swing.GroupLayout paienlEditarLayout = new javax.swing.GroupLayout(paienlEditar);
        paienlEditar.setLayout(paienlEditarLayout);
        paienlEditarLayout.setHorizontalGroup(
            paienlEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paienlEditarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoAlterar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paienlEditarLayout.setVerticalGroup(
            paienlEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paienlEditarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoAlterar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelLimpar.setBackground(new java.awt.Color(255, 255, 255));
        painelLimpar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout painelLimparLayout = new javax.swing.GroupLayout(painelLimpar);
        painelLimpar.setLayout(painelLimparLayout);
        painelLimparLayout.setHorizontalGroup(
            painelLimparLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLimparLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoLimparCampos, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelLimparLayout.setVerticalGroup(
            painelLimparLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLimparLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoLimparCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout painelbotoes2Layout = new javax.swing.GroupLayout(painelbotoes2);
        painelbotoes2.setLayout(painelbotoes2Layout);
        painelbotoes2Layout.setHorizontalGroup(
            painelbotoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelbotoes2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paienlEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelbotoes2Layout.setVerticalGroup(
            painelbotoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelbotoes2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelbotoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paienlEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelBotoesLayout = new javax.swing.GroupLayout(painelBotoes);
        painelBotoes.setLayout(painelBotoesLayout);
        painelBotoesLayout.setHorizontalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelbotoes2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelBotoesLayout.setVerticalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelbotoes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelTabela.setBackground(new java.awt.Color(255, 255, 255));
        painelTabela.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        paineltabela2.setBackground(new java.awt.Color(255, 255, 255));
        paineltabela2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelResultadoPesquisa.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelResultadoPesquisa.setText("Resultado da pesquisa:");

        javax.swing.GroupLayout paineltabela2Layout = new javax.swing.GroupLayout(paineltabela2);
        paineltabela2.setLayout(paineltabela2Layout);
        paineltabela2Layout.setHorizontalGroup(
            paineltabela2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paineltabela2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelResultadoPesquisa)
                .addGap(175, 175, 175))
        );
        paineltabela2Layout.setVerticalGroup(
            paineltabela2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineltabela2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelResultadoPesquisa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelTabelaInterna.setBackground(new java.awt.Color(255, 255, 255));
        painelTabelaInterna.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TabelaPesquisa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TabelaPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOME", "CPF", "Cidade", "Telefone", "Celular"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaPesquisa.setColumnSelectionAllowed(true);
        TabelaPesquisa.getTableHeader().setReorderingAllowed(false);
        ScrollPaneTabela.setViewportView(TabelaPesquisa);
        TabelaPesquisa.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout painelTabelaInternaLayout = new javax.swing.GroupLayout(painelTabelaInterna);
        painelTabelaInterna.setLayout(painelTabelaInternaLayout);
        painelTabelaInternaLayout.setHorizontalGroup(
            painelTabelaInternaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaInternaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollPaneTabela, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelTabelaInternaLayout.setVerticalGroup(
            painelTabelaInternaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaInternaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollPaneTabela)
                .addContainerGap())
        );

        javax.swing.GroupLayout painelTabelaLayout = new javax.swing.GroupLayout(painelTabela);
        painelTabela.setLayout(painelTabelaLayout);
        painelTabelaLayout.setHorizontalGroup(
            painelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paineltabela2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelTabelaInterna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelTabelaLayout.setVerticalGroup(
            painelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paineltabela2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelTabelaInterna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(painelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }

    private void acoesBotoes() {


        botaoCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/cadastrar.gif"))); // NOI18N
        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.setToolTipText("Cadastrar Paciente");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paciente = new Paciente();
                
                paciente.setNome(campoNome.getText());
                paciente.setRua(campoRua.getText());
                paciente.setBairro(campoBairro.getText());
                paciente.setNumero(Integer.parseInt(campoNumero.getText()));
                paciente.setCidade(campoCidade.getText());
                paciente.setUf(campoUF.getText());
                paciente.setCep(campoCep.getText());
                paciente.setCpf(campoCpf.getText());
                paciente.setNaturalidade(campoNaturalidade.getText());
                paciente.setNacionalidade(campoNacionalidade.getText());
                paciente.setIdade(Integer.parseInt(campoIdade.getText()));
                paciente.setTelefone(campoTelefone.getText());
                paciente.setCelular(campoCelular.getText());
                paciente.setSexo(ComboBoxSexo.getSelectedItem().toString());
                paciente.setRaca(campoRaca.getText());
                
                try{
                    JOptionPane.showConfirmDialog(null, "Deseja cadastrar esse Paciente?");

                    controlador.inserirPaciente(paciente);
                    
                    JOptionPane.showMessageDialog(null, "Paciente:" + paciente.getNome() + "Cadastardo com sucesso!");
                    
                }catch(Exception e){
                    e.printStackTrace();
                }
                
                
            }
        });


        botaoPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/pesquisar.gif"))); // NOI18N
        botaoPesquisar.setText("Pesquisar");
        botaoPesquisar.setToolTipText("Pesquisar Paciente");
        botaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });




        botaoExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/excluir.gif"))); // NOI18N
        botaoExcluir.setText("Excluir");
        botaoExcluir.setToolTipText("Excluir Paciente");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });


        botaoAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/editar.gif"))); // NOI18N
        botaoAlterar.setText("Alterar");
        botaoAlterar.setToolTipText("Alterar Paciente");
        botaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });


        botaoLimparCampos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/eraser.gif"))); // NOI18N
        botaoLimparCampos.setToolTipText("Limpar Campos do Cadastro");
        botaoLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                paciente = null;
                apagarCampos();
            }
        });
    }
    
    public void apagarCampos(){
        campoNome.setText("");
        campoRua.setText("");
        campoBairro.setText("");
        campoNumero.setText(null);
        campoCidade.setText("");
        campoUF.setText("");
        campoCep.setText("");
        campoCpf.setText("");
        campoNaturalidade.setText("");
        campoNacionalidade.setText("");
        campoIdade.setText(null);
        campoTelefone.setText("");
        campoCelular.setText("");
        campoRaca.setText("");
    }
}
