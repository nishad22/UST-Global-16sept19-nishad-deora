package com.ust.jpawithhibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust.manytomany.Course;
import com.ust.manytomany.Student;

public class TestManyToMany {
	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction  = entityManager.getTransaction();
			entityTransaction.begin();
			Course c1 = new Course();
			c1.setCid(102);
			c1.setCname("Angular");

			Course c2 =  new Course();
			c2.setCid(103);
			c2.setCname("Python");

			ArrayList<Course> courseList = new ArrayList<Course>();
			courseList.add(c1);
			courseList.add(c2);

			Student s = new Student();
			s.setSid(2);
			s.setSname("Poirei");
			s.setCourse(courseList);

			Course co = entityManager.find(Course.class, 101);
			
			entityManager.persist(s);
			entityTransaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}
