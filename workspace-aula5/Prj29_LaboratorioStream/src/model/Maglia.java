package model;

public class Maglia {

	Taglia taglia;
	Colore colore;
	double prezzo;
	
	public Maglia(Taglia taglia, Colore colore, double prezzo) {
		this.taglia = taglia;
		this.colore = colore;
		this.prezzo = prezzo;
	}

	public Taglia getTaglia() {
		return taglia;
	}

	public void setTaglia(Taglia taglia) {
		this.taglia = taglia;
	}

	public Colore getColore() {
		return colore;
	}

	public void setColore(Colore colore) {
		this.colore = colore;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return "Maglia [taglia=" + taglia + ", colore=" + colore + ", prezzo=" + prezzo + "]";
	}
	
	
	
}
