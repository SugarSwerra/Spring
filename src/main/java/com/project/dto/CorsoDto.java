package com.project.dto;

import java.util.ArrayList;
import java.util.List;


public class CorsoDto {

	private int id;
	private String nome_corso;
	private String descrizione_breve;
	private String descrizione_completa;
	private int durata;
	private CategoriaDto categoriaDto;
	private List<UtenteDto> utentiDto = new ArrayList<>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome_corso() {
		return nome_corso;
	}
	public void setNome_corso(String nome_corso) {
		this.nome_corso = nome_corso;
	}
	public String getDescrizione_breve() {
		return descrizione_breve;
	}
	public void setDescrizione_breve(String descrizione_breve) {
		this.descrizione_breve = descrizione_breve;
	}
	public String getDescrizione_completa() {
		return descrizione_completa;
	}
	public void setDescrizione_completa(String descrizione_completa) {
		this.descrizione_completa = descrizione_completa;
	}
	public int getDurata() {
		return durata;
	}
	public void setDurata(int durata) {
		this.durata = durata;
	}
	public CategoriaDto getCategoriaDto() {
		return categoriaDto;
	}
	public void setCategoriaDto(CategoriaDto categoriaDto) {
		this.categoriaDto = categoriaDto;
	}
	public List<UtenteDto> getUtentiDto() {
		return utentiDto;
	}
	public void setUtentiDto(List<UtenteDto> utentiDto) {
		this.utentiDto = utentiDto;
	}

	
	
	
	
}
