package com.project.dto;

import java.util.List;

import com.project.model.Ruolo;

public class UtenteModificatoDto {
	
	private int id;
	private String nome;
	private String cognome;
	private String email;
	private String password;
	private List<Ruolo> roles;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
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
	public List<Ruolo> getRoles() {
		return roles;
	}
	public void setRoles(List<Ruolo> roles) {
		this.roles = roles;
	}
	
	
}
