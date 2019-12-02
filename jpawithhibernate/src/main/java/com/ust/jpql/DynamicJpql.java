package com.ust.jpql;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicJpql {
public static void main(String[] args) {
	EntityManager entityManager = null;
	EntityTransaction entityTransaction = null;
	
	try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		String jpql = "update ProductInfo set pname:name where pid:id";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("name", "Book");
		query.setParameter("id", 102);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	finally {
		
	}
}
}
