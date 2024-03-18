package com.maboglia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "province")
public class Provincia {
	
	//------------------------------
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String regione;
	private String comune;
	
	private int maschi;
	private int femmine;
	private int totale;
	
	//------------------------------
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRegione() {
		return regione;
	}
	public void setRegione(String regione) {
		this.regione = regione;
	}
	public String getComune() {
		return comune;
	}
	public void setComune(String comune) {
		this.comune = comune;
	}
	public int getMaschi() {
		return maschi;
	}
	public void setMaschi(int maschi) {
		this.maschi = maschi;
	}
	public int getFemmine() {
		return femmine;
	}
	public void setFemmine(int femmine) {
		this.femmine = femmine;
	}
	public int getTotale() {
		return totale;
	}
	public void setTotale(int totale) {
		this.totale = totale;
	}
	
	
}
