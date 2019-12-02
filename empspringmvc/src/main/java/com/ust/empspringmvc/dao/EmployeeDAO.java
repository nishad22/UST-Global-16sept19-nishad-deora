package com.ust.empspringmvc.dao;

import javax.persistence.Embeddable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ust.empspringmvc.dto.EmployeeBean;

import javassist.bytecode.Mnemonic;

@Repository
public class EmployeeDAO implements IEmployeeDAO{

	@PersistenceUnit
	private EntityManagerFactory factory;
	@Override
	public EmployeeBean login(int id, String password) {
		String jpql = "from EmployeeBean where id=:id and password=:pass";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<EmployeeBean>query = manager.createQuery(jpql,EmployeeBean.class);
		query.setParameter("id", id);
		query.setParameter("pass", password);
		try {
			EmployeeBean bean = query.getSingleResult();
			return bean;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public int register(EmployeeBean bean) {
		// TODO Auto-generated method stub
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			 manager.persist(bean);
			 transaction.commit();
			return bean.getId();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
		
		
	}

	@Override
	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			EmployeeBean bean = manager.find(EmployeeBean.class, id);
			manager.remove(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
		
		
	}

	@Override
	public EmployeeBean searchEmpolyee(int id) {
		// TODO Auto-generated method stub
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		return manager.find(EmployeeBean.class, id);
	}

	@Override
	public boolean updateEmployee(EmployeeBean bean) {
		// TODO Auto-generated method stub
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		EmployeeBean empBean = manager.find(EmployeeBean.class, bean.getId());
		empBean.setName(bean.getName());
		empBean.setEmail(bean.getEmail());
//		empBean.setGender(bean.getGender());
//		empBean.setPassword(bean.getPassword());
		empBean.setDoj(bean.getDoj());
		transaction.commit();
		
		return true;
	}

	@Override
	public boolean changePassword(String password,int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		EmployeeBean bean = manager.find(EmployeeBean.class, id);
		bean.setPassword(password);
		transaction.commit();
		manager.close();
		return true;
	}

}
