package main;


import dao.DiagnosticoJpaController;
import dao.PacienteJpaController;
import modelo.Diagnostico;
import modelo.Paciente;
import negocio.Grupo_I;
import negocio.Grupo_II;
import util.JPAUtil;
import util.TelaGrupoI;
import view.ViewExameClinico;
import view.ViewGrupos;
import view.ViewQuestionarioPessoal;
import view.WiewDadosPessoais;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaGrupoI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGrupoI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGrupoI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGrupoI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

      
//         ViewGrupos view = new ViewGrupos();
//         view.setVisible(true);
//         view.iniciar();
         
         ViewExameClinico viewExameClinico = new ViewExameClinico();
         viewExameClinico.setVisible(true);
         
       WiewDadosPessoais viewDadosPessoais = new WiewDadosPessoais();
       viewDadosPessoais.setVisible(true);
       
       ViewQuestionarioPessoal viewQuestionario = new ViewQuestionarioPessoal();
       viewQuestionario.setVisible(true);
        
    }
}
