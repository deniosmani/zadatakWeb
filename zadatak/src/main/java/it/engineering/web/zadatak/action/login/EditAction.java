package it.engineering.web.zadatak.action.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.web.zadatak.action.AbstractAction;
import it.engineering.web.zadatak.constant.WebConstant;
import it.engineering.web.zadatak.domain.Proizvod;
import it.engineering.web.zadatak.repository.ProizvodRepository;

public class EditAction extends AbstractAction{

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		System.out.println(request.getParameter("sifra"));
		ProizvodRepository pr=new ProizvodRepository();
		Proizvod proizvod=pr.findBySifra(Integer.parseInt(request.getParameter("sifra")));
		request.setAttribute("proizvod", proizvod);
		return WebConstant.PAGE_EDIT_PROIZVOD;
	}

		
}
