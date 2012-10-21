/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Aragon
 */
public class JPAUtil{
    
    public static EntityManagerFactory emf;

    public JPAUtil() {
        emf = Persistence.createEntityManagerFactory("SisOdontoPU");
    }
    
    public EntityManagerFactory getEmf(){
        return emf;
    }
    
}
