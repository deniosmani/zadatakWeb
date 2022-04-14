package it.engineering.web.zadatak.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class AbstractAction {
	public abstract String executeRequest(HttpServletRequest request, HttpServletResponse response);
}
