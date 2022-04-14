package main;

import java.util.List;

import it.engineering.web.zadatak.domain.Proizvod;
import it.engineering.web.zadatak.domain.User;
import it.engineering.web.zadatak.repository.ProizvodRepository;
import it.engineering.web.zadatak.repository.UserRepository;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//UserRepository ur=new UserRepository();
		//ur.save(new User(3,"user3","user3"));
		//User user = ur.findByUsername("user3");
		//System.out.println(user);
		ProizvodRepository pr=new ProizvodRepository();
		List<Proizvod> proizvodi=pr.getAll();
		System.out.println(proizvodi);
	}

}
