package com.ust.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust.dto.ProductInfo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ProductInfo productinfo = new ProductInfo();
        productinfo.setPid(102);
        productinfo.setPname("Pencil");
        productinfo.setQuantity(10);
        
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(productinfo);
        System.out.println("Record Saved");
        entityTransaction.commit();
        entityManager.close();
        
    }
}
