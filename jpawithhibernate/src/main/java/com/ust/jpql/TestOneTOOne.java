package com.ust.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust.onetoone.Person;
import com.ust.onetoone.VoteCard;

public class TestOneTOOne {
	public static void main(String[] args) {

		VoteCard vc = new VoteCard();
		vc.setVid(1233);
		vc.setVname("Nishad");

		Person person = new Person();
		person.setId(1);
		person.setName("Nishad");
		person.setVoteCard(vc);
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
//			entityManager.persist(person);
			VoteCard vc1 = entityManager.find(VoteCard.class, 1233);
			System.out.println(vc1.getPerson().getId());
			System.out.println();
			entityTransaction.commit();

		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}