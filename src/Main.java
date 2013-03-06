
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
         
//       WiewDadosPessoais viewDadosPessoais = new WiewDadosPessoais();
//       viewDadosPessoais.setVisible(true);
//       
//       ViewQuestionarioPessoal viewQuestionario = new ViewQuestionarioPessoal();
//       viewQuestionario.setVisible(true);
               

        /*PacienteJpaController daoPaciente;
        //DiagnosticoJpaController daoDiagnostico;
        //RespostaJpaController daoResposta;
        JPAUtil emf;
        Paciente paciente;
        Diagnostico diagnostico;
        Resposta resposta;
        Grupo_I grupo_1;
        Grupo_II grupo_2;


        paciente = new Paciente();
        paciente.setNome("Aragon");
        //diagnostico = new Diagnostico();
        //resposta = new Resposta();
        //grupo_1 = new Grupo_I();
        emf = new JPAUtil();
        daoPaciente = new PacienteJpaController(emf.getEmf());
        //daoDiagnostico = new DiagnosticoJpaController(emf.getEmf());
        //daoResposta = new RespostaJpaController(emf.getEmf());

        try {
            daoPaciente.create(paciente);
        } catch (Exception e) {
        }

        System.out.println(daoPaciente.getPacienteCount());*/
        
    }
}
