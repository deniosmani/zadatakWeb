package it.engineering.web.zadatak.listener;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import it.engineering.web.zadatak.domain.User;

/**
 * Application Lifecycle Listener implementation class MyContextListener
 *
 */
public class MyContextListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public MyContextListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	List<User> list=new ArrayList<>();
    	sce.getServletContext().setAttribute("logedUsers", list);
    }
	
}
