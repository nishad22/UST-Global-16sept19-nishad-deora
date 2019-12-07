package com.ust.springrest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ust.springrest.dto.EmployeeBean;
@Repository
public class EmployeeDAOImpl implements IEmployeeDAO{
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean updateProfile(EmployeeBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		EmployeeBean empbean = manager.find(EmployeeBean.class, bean.getId());
		empbean.setName(bean.getName());
		empbean.setGender(bean.getGender());
		empbean.setPassword(bean.getPassword());
		empbean.setDoj(bean.getDoj());
		transaction.commit();
		return true;
	}

	@Override
	public boolean addEmployee(EmployeeBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
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
	public boolean deleteEmployee(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		EmployeeBean bean = manager.find(EmployeeBean.class, id);
		manager.remove(bean);
		transaction.commit();
		return true;
		
	}

	@Override
	public EmployeeBean getEmployee(int id) {
		// TODO Auto-generated method stub
		String jpql = "from EmployeeBean where id=:id";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<EmployeeBean> query = manager.createQuery(jpql, EmployeeBean.class);
		query.setParameter("id", id);
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
	public List<EmployeeBean> getAllEmployee() {
		String jpql = "from EmployeeBean";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<EmployeeBean> query  = manager.createQuery(jpql, EmployeeBean.class);
		try {
			List<EmployeeBean> ls = query.getResultList();
			return ls;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		
	}
}
