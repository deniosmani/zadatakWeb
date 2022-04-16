package it.engineering.web.zadatak.action.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.web.zadatak.action.AbstractAction;
import it.engineering.web.zadatak.constant.WebConstant;
import it.engineering.web.zadatak.repository.ProizvodRepository;

public class DeleteProizvodAction extends AbstractAction{

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		try{int sifra=Integer.parseInt( request.getParameter("sifra"));
		ProizvodRepository pr=new ProizvodRepository();
		pr.remove(sifra);} catch (Exception e) {
			System.out.println("uso");
			request.setAttribute("error", "pogresan podatak");
			return WebConstant.PAGE_DELETE_PROIZVOD;
		}
		return WebConstant.PAGE_HOME;
	}

	
}
