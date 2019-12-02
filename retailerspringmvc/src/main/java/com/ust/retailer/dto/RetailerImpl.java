package com.ust.retailer.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ust.retailer.dao.OrderBean;
import com.ust.retailer.dao.ProductBean;
import com.ust.retailer.dao.RetailerBean;

@Repository
public class RetailerImpl implements IRetailerDAO{
	
	@PersistenceUnit
	private EntityManagerFactory factory;
	@Override
	public RetailerBean login(int id, String password) {
		// TODO Auto-generated method stub
		String jpql = "from RetailerBean where id=:id and password=:pass";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<RetailerBean>query = manager.createQuery(jpql,RetailerBean.class);
		query.setParameter("id", id);
		query.setParameter("pass", password);
		try {
			RetailerBean bean = query.getSingleResult();
			return bean;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public int register(RetailerBean retailer) {
		// TODO Auto-generated method stub
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transction = manager.getTransaction();
		transction.begin();
		try {
			manager.persist(retailer);
			transction.commit();
			return retailer.getRid();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public ProductBean searchProduct(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updatePassword(String password, int id) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int calAmount(int price, int quantity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public OrderBean searchOrder(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
