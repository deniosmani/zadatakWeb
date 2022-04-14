package it.engineering.web.zadatak.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User implements Serializable{
	
	
	@Id
	@Column(name = "username")
	private String username;
	@Column(name="password")
	private String password;
	public User( String username, String password) {
		super();
		
		this.username = username;
		this.password = password;
	}
	public User() {
		super();
	}
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [ username=" + username + ", password=" + password + "]";
	}
	
}
