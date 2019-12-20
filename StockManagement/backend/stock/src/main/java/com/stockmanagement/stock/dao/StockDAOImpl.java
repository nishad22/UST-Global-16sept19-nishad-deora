package com.stockmanagement.stock.dao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.stockmanagement.stock.dto.OrderInfo;
import com.stockmanagement.stock.dto.ProductInfo;

@Repository
public class StockDAOImpl implements IStockDAO{

	@PersistenceUnit
	private EntityManagerFactory factory;
	EntityManager manager = null;
	EntityTransaction transaction =null;
	 
	
	@Override
	public boolean addProduct(ProductInfo bean) {
		// TODO Auto-generated method stub
		 manager = factory.createEntityManager();
		 transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateProductInfo(int id, String name, String category, String company, int quantity, double price) {
		// TODO Auto-generated method stub
		 manager = factory.createEntityManager();
		 transaction = manager.getTransaction();
		try {
			transaction.begin();
			ProductInfo info = manager.find(ProductInfo.class, id);
			info.setName(name);
			info.setCategory(category);
			info.setCompany(company);
			info.setQuantity(quantity);
			info.setPrice(price);
			manager.persist(info);
			transaction.commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public List<ProductInfo> findByName(String name) {
		// TODO Auto-generated method stub
		manager = factory.createEntityManager();
		String jpql = "from ProductInfo where name=:name";
		TypedQuery<ProductInfo> query =  manager.createQuery(jpql, ProductInfo.class);
		query.setParameter("name", name);
		List<ProductInfo> ls = query.getResultList();
		return ls;
	}

	@Override
	public List<ProductInfo> findByCompany(String company) {
		// TODO Auto-generated method stub
		manager = factory.createEntityManager();
		String jpql = "from ProductInfo where company=:company";
		TypedQuery<ProductInfo> query =  manager.createQuery(jpql, ProductInfo.class);
		query.setParameter("company", company);
		List<ProductInfo> ls = query.getResultList();
		return ls;
	}

	@Override
	public List<ProductInfo> findByCategory(String category) {
		// TODO Auto-generated method stub
		manager = factory.createEntityManager();
		String jpql = "from ProductInfo where category=:category";
		TypedQuery<ProductInfo> query =  manager.createQuery(jpql, ProductInfo.class);
		query.setParameter("category", category);
		List<ProductInfo> ls = query.getResultList();
		return ls;
	}

	@Override
	public boolean addToCart(int pid) {
		// TODO Auto-generated method stub
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
		try {
			transaction.begin();
			ProductInfo info = manager.find(ProductInfo.class, pid);
			info.setQuantity(info.getQuantity()-1);
			OrderInfo order = new OrderInfo();
//			OrderInfo order = new OrderInfo();
			order.setTotal_price(info.getPrice());
			order.setPrice_gst(info.getPrice()+(0.18*info.getPrice()));
			order.setProduct(Arrays.asList(info));
			manager.persist(order);
			transaction.commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}

}
