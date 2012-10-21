
import dao.DiagnosticoJpaController;
import dao.PacienteJpaController;
import dao.RespostaJpaController;
import modelo.Diagnostico;
import modelo.Paciente;
import modelo.Resposta;
import negocio.Grupo_I;
import negocio.Grupo_II;
import util.JPAUtil;
import view.ViewGrupos;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {

        /*
        ViewGrupos view = new ViewGrupos();
        view.setVisible(true);
        view.iniciar();
        * 
        */


        PacienteJpaController daoPaciente;
        DiagnosticoJpaController daoDiagnostico;
        RespostaJpaController daoResposta;
        JPAUtil emf;
        Paciente paciente;
        Diagnostico diagnostico;
        Resposta resposta;
        Grupo_I grupo_1;
        Grupo_II grupo_2;


        paciente = new Paciente();
        paciente.setNome("Aragon");
        diagnostico = new Diagnostico();
        resposta = new Resposta();
        grupo_1 = new Grupo_I();
        emf = new JPAUtil();
        daoPaciente = new PacienteJpaController(emf.getEmf());
        daoDiagnostico = new DiagnosticoJpaController(emf.getEmf());
        daoResposta = new RespostaJpaController(emf.getEmf());
        
        
        daoPaciente.create(paciente);
        System.out.println(daoPaciente.getPacienteCount());
    }
}
