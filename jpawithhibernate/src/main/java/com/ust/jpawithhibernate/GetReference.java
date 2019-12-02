package com.ust.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust.dto.ProductInfo;

public class GetReference {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory  = Persistence.createEntityManagerFactory("TestPersistence");
	EntityManager entityManager = null;
//	EntityTransaction entityTransaction  = null;
	try {
		entityManager = entityManagerFactory.createEntityManager();
//		entityTransaction = entityManager.getTransaction();
//		entityTransaction.begin();
		ProductInfo proInfo = entityManager.getReference(ProductInfo.class, 101);
//		ProductInfo proInfo = entityManager.find(ProductInfo.class, 101);
//		System.out.println("Product id "+proInfo.getPid());
//		System.out.println("Product name "+proInfo.getPname());
//		System.out.println("Product Quantity "+proInfo.getQuantity());
		System.out.println(proInfo.getClass());
		entityManager.close();
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
}
