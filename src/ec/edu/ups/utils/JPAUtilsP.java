/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;

/**
 *
 * @author braya
 */
public class JPAUtilsP {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Proyecto_I2JPAPU");
    
    /**
     *
     * @return
     */
    public static EntityManager getEntityManagerP(){
        return emf.createEntityManager();
    }
}
