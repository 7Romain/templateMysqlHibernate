package org.example;

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
        immo.setNoimm("17");
        immo.setAdresse("14 avenue des champs");
        immo.setVille("lyon");



        entityManager.getTransaction().begin();

       //Immeuble tableImmo = entityManager.find(Immeuble.class,"");
        //System.out.println(tableImmo);
        entityManager.persist(immo);

    Query query = entityManager.createNamedQuery("trouverVille");
    query.setParameter("ville", "lyon");
    query.setParameter("numImm", "2");

        System.out.println(query.getResultList());

      Query nquery = entityManager.createNativeQuery("SELECT * FROM Immeuble where ville ='paris' AND noimm = 1");
        System.out.println(nquery.getResultList());
        entityManager.getTransaction().commit();





    }


}
