package model;

public class Canzone {
	
	public String titolo;//proprietà dell'oggetto di tipo Canzone
	public String cantante;
	
	public Canzone(String titolo, String cantante) {
		this.titolo = titolo;
		this.cantante = cantante;
	}

	public void suona() {
		System.out.println("Sto cantando la canzone " + titolo);
	}
	
	public String stampa() {
		return this.cantante + " - " + this.titolo;
	}
	
	public String stampaInversa() {
		return this.titolo + " - " + this.cantante.toUpperCase();
	}
	

}
