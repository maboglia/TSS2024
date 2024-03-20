package com.maboglia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "studenti")
public class Studente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nome;
	
//	@ManyToOne(fetch = FetchType.EAGER)
//	private Corso corso;

	public Studente(String nome) {
		super();
		this.nome = nome;
		//this.corso = corso;
	}
	
	public Studente() {
		// TODO Auto-generated constructor stub
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

//	public Corso getCorso() {
//		return corso;
//	}
//
//	public void setCorso(Corso corso) {
//		this.corso = corso;
//	}

	@Override
	public String toString() {
		return "Studente [id=" + id + ", nome=" + nome + ", ]";
	}
	
	
	
}
