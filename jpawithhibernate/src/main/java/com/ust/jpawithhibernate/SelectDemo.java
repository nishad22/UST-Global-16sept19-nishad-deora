package com.ust.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust.dto.ProductInfo;

public class SelectDemo {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager  = entityManagerFactory.createEntityManager();
		ProductInfo proInfo = entityManager.find(ProductInfo.class, 102);
		System.out.println("Product id "+proInfo.getPid());
		System.out.println("Product name "+proInfo.getPname());
		System.out.println("Product Quantity "+proInfo.getQuantity());
		entityManager.close();
		
	}
}
