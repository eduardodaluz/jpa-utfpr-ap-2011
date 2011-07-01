/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author eduardo
 */
public class PadraoCtrl {
    
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("botiquePU");
    protected EntityManager em = emf.createEntityManager();
    private EntityTransaction tx = em.getTransaction();
        
    public void abrirTransacao() {
        tx.begin();
    }
    
    public void concluirTransacao() {
        tx.commit();
    }
    
    public void cancelarTransacao() {
        tx.rollback();
    }
    
}
