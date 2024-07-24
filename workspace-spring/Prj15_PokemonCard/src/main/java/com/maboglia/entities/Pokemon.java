package com.maboglia.entities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pokemon")
public class Pokemon {

	@Id
	private int id;
	
	@Column(name = "Name")
	private String nome;
	
	@Column(name = "Type1")
	private String tipo1;

	@Column(name = "Type2")
	private String tipo2;

	public Pokemon() {
		Logger logger = LoggerFactory.getLogger(Pokemon.class);
		logger.info("messaggio di log", "creato un pokemon " + this.nome);
	}
	
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

	public String getTipo1() {
		return tipo1;
	}

	public void setTipo1(String tipo1) {
		this.tipo1 = tipo1;
	}

	public String getTipo2() {
		return tipo2;
	}

	public void setTipo2(String tipo2) {
		this.tipo2 = tipo2;
	}

	
	
}
