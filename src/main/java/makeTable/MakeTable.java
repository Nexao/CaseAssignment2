/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makeTable;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author Emil
 */
public class MakeTable {
    public static void main(String[] args) {
        Persistence.generateSchema("pu", null);
//        EntityManager em = Persistence.createEntityManagerFactory("pu").createEntityManager();
//        em.getTransaction().begin();
//        // Do persist stuff! Hpudi dabidi
//        em.getTransaction().commit();
    }
}
