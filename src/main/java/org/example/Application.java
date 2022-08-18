package org.example;

import java.sql.Array;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class Application {

    public static void main(String[] args)  {


        final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("br.com.fredericci.pu");
        final EntityManager entityManager = entityManagerFactory.createEntityManager();

        Immeuble immo = new Immeuble();
        immo.setNoimm("15");
        immo.setAdresse("avenue lolaL");
        immo.setVille("lyon");



        entityManager.getTransaction().begin();

       //Immeuble tableImmo = entityManager.find(Immeuble.class,"");
        //System.out.println(tableImmo);
        entityManager.persist(immo);
        List<Immeuble> imm;
    Query query = entityManager.createNamedQuery("trouverVille");
    query.setParameter("ville", "lyon");
    query.setParameter("numImm", "2");

        System.out.println(query.getResultList());

    //imm = entityManager.createNativeQuery("SELECT immeu FROM Immeuble immeu where immeu.ville = :ville").getResultList();
        entityManager.getTransaction().commit();





    }


}
