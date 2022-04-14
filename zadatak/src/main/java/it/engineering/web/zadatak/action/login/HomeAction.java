package it.engineering.web.zadatak.action.login;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.engineering.web.zadatak.*;
import it.engineering.web.zadatak.*;
import it.engineering.web.zadatak.action.AbstractAction;
import it.engineering.web.zadatak.constant.WebConstant;
import it.engineering.web.zadatak.domain.User;
import it.engineering.web.zadatak.repository.UserRepository;

public class HomeAction extends AbstractAction {

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		
		UserRepository ur=new UserRepository();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		User user=ur.findByUsername(username);
		
		List<User> logedUsers=(List<User>) request.getServletContext().getAttribute("logedUsers");
		boolean ima=false;
		if(logedUsers.contains(user)) ima=true; else {logedUsers.add(user);}
		if(user!=null && !ima) 
		return WebConstant.PAGE_HOME;
		return WebConstant.PAGE_INDEX;
	}
}
