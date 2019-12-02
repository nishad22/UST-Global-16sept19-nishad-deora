package com.ust.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust.dto.ProductInfo;

public class ReattchingDemo {
	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			
			ProductInfo proInfo = entityManager.find(ProductInfo.class, 102);
			System.out.println(entityManager.contains(proInfo));
			entityManager.detach(proInfo);
			System.out.println(entityManager.contains(proInfo));
			ProductInfo proInfo1 = entityManager.merge(proInfo);
//			proInfo1.setPid(101);
			proInfo1.setPname("Samsung");
			proInfo1.setQuantity(10);
			System.out.println("Record is updated");
			entityTransaction.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			entityTransaction.rollback();
		}

		entityManager.close();
	}
}
