package com.ust.jpql;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ust.dto.ProductInfo;

public class JpqlQuery {
public static void main(String[] args) {
	EntityManager entityManager = null;
	try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		String jpql = "select pname from ProductInfo";
		Query query = entityManager.createQuery(jpql);
		List<String> proList = query.getResultList();
		for(String pinfo : proList) {
			//System.out.println(pinfo.getPid());
			System.out.println(pinfo);
			//System.out.println(pinfo.getQuantity());
			System.out.println("------------------------------");
		}
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	entityManager.close();
}
}
