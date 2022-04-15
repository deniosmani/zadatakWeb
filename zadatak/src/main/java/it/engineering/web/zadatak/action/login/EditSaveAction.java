package it.engineering.web.zadatak.action.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.web.zadatak.action.AbstractAction;
import it.engineering.web.zadatak.constant.WebConstant;
import it.engineering.web.zadatak.domain.Proizvod;
import it.engineering.web.zadatak.repository.ProizvodRepository;

public class EditSaveAction extends AbstractAction{

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		int sifra=Integer.parseInt(request.getParameter("sifra"));
		String naziv=request.getParameter("naziv");
		double cenaBez=Double.parseDouble(request.getParameter("cenaBez"));
		String jedinica=request.getParameter("jedinica");
		ProizvodRepository pr=new ProizvodRepository();
		
		Proizvod proizvod = new Proizvod(sifra, naziv, cenaBez, jedinica, 1.2*cenaBez, 1);
		pr.remove(sifra);
		pr.save(proizvod);
		return WebConstant.PAGE_HOME;
	}

}
