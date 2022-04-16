package it.engineering.web.zadatak.action.login;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import it.engineering.web.zadatak.action.AbstractAction;
import it.engineering.web.zadatak.domain.User;



public class LogoutAction extends AbstractAction {

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		User user=(User)session.getAttribute("loginUser");
		List<User> list=(List<User>) request.getServletContext().getAttribute("logedUsers");
		int i=0;
		boolean ima=false;
		for(User current:list) {
			if(current.equals(user)) {ima=true; break;}
			i++;
		}
		if(ima) {
			list.remove(i);
			System.out.println(list);
		}
		session.removeAttribute("loginUser");
		session.invalidate();
		session = request.getSession(false);
		return it.engineering.web.zadatak.constant.WebConstant.PAGE_INDEX;
	}

	
}
