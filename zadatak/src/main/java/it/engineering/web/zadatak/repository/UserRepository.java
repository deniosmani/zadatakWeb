package it.engineering.web.zadatak.repository;

import javax.persistence.EntityManager;


import it.engineering.web.zadatak.domain.User;
import it.engineering.web.zadatak.persistence.*;


public class UserRepository {
	public void save(User user) {
		EntityManager em = MyEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		User contextUser = em.merge(user);
		em.flush();
		em.getTransaction().commit();
		em.close();
	}

	public User findByUsername(String username) {
		EntityManager em = MyEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		User user = em.find(User.class,username);
		System.out.println(user);
		em.close();
		return user;
	}

}
