package it.engineering.web.zadatak.actionfactory;

import it.engineering.web.zadatak.action.AbstractAction;
import it.engineering.web.zadatak.action.login.AddProizvodAction;
import it.engineering.web.zadatak.action.login.DeleteProizvodAction;
import it.engineering.web.zadatak.action.login.HomeAction;

import it.engineering.web.zadatak.constant.WebConstant;

public class ActionFactory {
	public static AbstractAction createAction(String method, String path) {
		AbstractAction action = null;
		switch (path) {
		
		case WebConstant.PATH_HOME:
			return new HomeAction();
			
		case WebConstant.PATH_ADD_PROIZVOD:
			return new AddProizvodAction();
		case WebConstant.PATH_DELETE_PROIZVOD:
			return new DeleteProizvodAction();
		default:
			break;
		}
		
		
		
		return action;
	}
}
