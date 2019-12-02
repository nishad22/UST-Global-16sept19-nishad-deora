package com.ust.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust.dto.ProductInfo;

public class UpdateDemo {
	public static void main(String[] args) {

		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			ProductInfo productInfo = entityManager.find(ProductInfo.class, 101);
			//productInfo.setPid(103);
			productInfo.setPname("Mobil");
			productInfo.setQuantity(1);
			System.out.println("Updated Record");
			entityTransaction.commit();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		entityManager.close();
	}
}
