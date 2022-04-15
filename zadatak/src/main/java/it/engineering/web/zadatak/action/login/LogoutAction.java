package it.engineering.web.zadatak.action.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import it.engineering.web.zadatak.action.AbstractAction;



public class LogoutAction extends AbstractAction {

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		session.removeAttribute("loginUser");
		session.invalidate();
		session = request.getSession(false);
		return it.engineering.web.zadatak.constant.WebConstant.PAGE_INDEX;
	}

	
}
