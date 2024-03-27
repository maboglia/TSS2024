package com.agenziaviaggi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Viaggio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nomeViaggio;
	private String descrizione;
	private double prezzo;
	private String destinazione;
	private String percorsoFile;
	private int durata;
	
	
	
	public int getDurata() {
		return durata;
	}
	public void setDurata(int durata) {
		this.durata = durata;
	}
	public String getPercorsoFile() {
		return percorsoFile;
	}
	public void setPercorsoFile(String percorsoFile) {
		this.percorsoFile = percorsoFile;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeViaggio() {
		return nomeViaggio;
	}
	public void setNomeViaggio(String nomeViaggio) {
		this.nomeViaggio = nomeViaggio;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public String getDestinazione() {
		return destinazione;
	}
	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}
	
	
	

}
