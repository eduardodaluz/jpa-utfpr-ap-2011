package botique;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Botique {
    
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("botiquePU");
    
    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        tx.commit();
        em.close();
        emf.close();
    }
}
