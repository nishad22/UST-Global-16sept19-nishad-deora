package com.ust.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust.onetomany.Pencil;
import com.ust.onetomany.PencilBox;

public class TestManyToOne {
	public static void main(String[] args) {
		
		PencilBox pbox = new PencilBox();
		pbox.setBid(1);
		pbox.setBname("Natraj");
		
		PencilBox pbox1 = new PencilBox();
		pbox1.setBid(2);
		pbox1.setBname("Apsara");
	
		Pencil pencil = new Pencil();
		pencil.setPid(3);
		pencil.setColor("red");
		pencil.setPencilBox(pbox1);
		
		Pencil pencil1 = new Pencil();
		pencil1.setPid(4);
		pencil1.setColor("green");
		pencil1.setPencilBox(pbox);
		
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(pencil);
			entityManager.persist(pencil1);
			
			
			entityTransaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}
