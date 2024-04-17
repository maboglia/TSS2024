package com.maboglia.entities;

import java.util.List;

public class Tavolo {
	
	private int numero;
	private int posti;
	private boolean privato;
	
	private List<Persona> persone;
	
	public List<Persona> getPersone() {
		return persone;
	}
	public void setPersone(List<Persona> persone) {
		this.persone = persone;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getPosti() {
		return posti;
	}
	public void setPosti(int posti) {
		this.posti = posti;
	}
	public boolean isPrivato() {
		return privato;
	}
	public void setPrivato(boolean privato) {
		this.privato = privato;
	}
	
	
}
