package main;


import dao.QuestionarioPessoalJpaController;
import dao.exceptions.PreexistingEntityException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.QuestionarioPessoal;
import util.JPAUtil;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alisson
 */
public class TesteNamedQuery {
    
    
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("SisOdontoPU");
    static QuestionarioPessoalJpaController dao;
    static QuestionarioPessoal quest = new QuestionarioPessoal();
    static int codPaciente = 1;
    static String rqp3 = "Sim";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws PreexistingEntityException, Exception {
        dao = new QuestionarioPessoalJpaController(emf);
        //quest.setId(id);
        //dao.create(quest);
        
        QuestionarioPessoal o = dao.buscarCampos(codPaciente);
    //    System.out.println("\n\n\n\n\n\n\n\n\n" + o.getRqp3());
    //    System.out.println(o.getRqp14A());
    //    System.out.println(o.getRqp14B());
//        System.out.println("\n\n\n\n\n\n\n\n\n" + o.get(0));
//        System.out.println(o.get(1));
//        System.out.println(o.get(2));
//        Object[] vo = (Object[])o;
//        System.out.println(vo[0]);
//        System.out.println(vo[1]);
//        System.out.println(vo[2]);
        
    }
}
