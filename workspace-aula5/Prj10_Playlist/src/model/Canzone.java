package model;

public class Canzone {

	public String titolo;
	public String cantante;
	
	
	public Canzone(String titolo, String cantante) { //new Canzone("Let It Be", "Beatles");+
		
		this.titolo = titolo;
		this.cantante = cantante;
	}
	
	public void suona() {
		System.out.println("Sto suonando "+this.titolo);
	}
	public String stampa() {
		return this.cantante.toUpperCase() + " - " + this.titolo;
	}
	public String stampainversa() {
		return this.titolo + " - " + this.cantante.toUpperCase();
	}
	
}
