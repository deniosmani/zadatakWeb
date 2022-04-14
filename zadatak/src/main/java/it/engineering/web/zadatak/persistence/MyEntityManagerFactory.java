package it.engineering.web.zadatak.persistence;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MyEntityManagerFactory {
	private static MyEntityManagerFactory instance;
	
	private EntityManagerFactory emf;
	
	private MyEntityManagerFactory() {
		emf = Persistence.createEntityManagerFactory("ProjectDay32");
	}
	
	public static EntityManagerFactory getEntityManagerFactory() {
		if (instance == null) instance = new MyEntityManagerFactory();
		return instance.getEmf();
	}
	private EntityManagerFactory getEmf() {
		return emf;
	}
	
	public static void closeEntityManagerFactory() {
		if (instance!=null) instance.getEmf().close();
	}
}

