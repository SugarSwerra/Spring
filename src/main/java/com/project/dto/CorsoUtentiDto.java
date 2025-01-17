package com.project.dto;

import java.util.List;

public class CorsoUtentiDto {
	
	private int id;
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private List<UtenteRuoloDto> roles;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<UtenteRuoloDto> getRoles() {
		return roles;
	}
	public void setRoles(List<UtenteRuoloDto> roles) {
		this.roles = roles;
	}
	
	
}
