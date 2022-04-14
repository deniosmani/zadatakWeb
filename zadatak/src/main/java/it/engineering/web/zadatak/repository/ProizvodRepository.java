package it.engineering.web.zadatak.repository;

import java.util.List;

import javax.persistence.EntityManager;

import it.engineering.web.zadatak.domain.Proizvod;
import it.engineering.web.zadatak.domain.User;
import it.engineering.web.zadatak.persistence.MyEntityManagerFactory;



public class ProizvodRepository {

	public List<Proizvod> getAll(){
		EntityManager em = MyEntityManagerFactory
				.getEntityManagerFactory()
				.createEntityManager();
		//JPQL
		List<Proizvod> proizvodi = em
				.createQuery("select m from Proizvod m",Proizvod.class)
				.getResultList();
		
	
		em.close();
		return proizvodi;
	}
	public void save(Proizvod proizvod) {
		EntityManager em = MyEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		Proizvod contextProizvod = em.merge(proizvod);
		em.flush();
		em.getTransaction().commit();
		em.close();
	}
}
