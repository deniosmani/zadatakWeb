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
		HttpSession session = request.getSession(true);
		UserRepository ur = new UserRepository();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user = ur.findByUsername(username);
		System.out.println(user);

		List<User> logedUsers = (List<User>) request.getServletContext().getAttribute("logedUsers");
		boolean ima = false;
		if (user != null && user.getPassword().equals(password))
			if (logedUsers.contains(user)) {
				ima = true;
				System.out.println("u listi ");}
			else {
				System.out.println("nije u listi");
				logedUsers.add(user);
			}
		if (user != null && !ima && user.getPassword().equals(password)) {
			session.setAttribute("loginUser", user);
			return WebConstant.PAGE_HOME;
		}
		request.setAttribute("error", "Pogresni podaci");
		System.out.println("lozinka");
		return WebConstant.PAGE_INDEX;
	}
}
