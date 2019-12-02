package com.ust.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateJpql {
public static void main(String[] args) {
	EntityManager entityManager = null;
	EntityTransaction entityTransaction = null;
	try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		String jpql = "update ProductInfo set pname = 'HP' where pid = 102";
		Query query = entityManager.createQuery(jpql);
		int count = query.executeUpdate();
		System.out.println(count+" row updated");
		entityTransaction.commit();
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	entityManager.close();
}
}
