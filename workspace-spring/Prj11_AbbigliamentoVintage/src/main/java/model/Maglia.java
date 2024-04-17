package model;

public class Maglia {

	private String scritta;
	private double prezzo;
	private Colore colore;
	private Taglia taglia;
	private static final double IVA = 0.22;
	
	public Maglia() {}

	public Maglia(String scritta) {
		this.scritta = scritta.toUpperCase();
	}
	
	public Maglia(String scritta, double prezzo) {
		this(scritta);
		this.prezzo = prezzo * IVA;
	}
	
	public Maglia(String scritta, double prezzo, Colore colore, Taglia taglia) {
		this(scritta, prezzo);
		this.colore = colore;
		this.taglia = taglia;
	}



	public String getScritta() {
		return scritta;
	}
	public void setScritta(String scritta) {
		this.scritta = scritta;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public Colore getColore() {
		return colore;
	}
	public void setColore(Colore colore) {
		this.colore = colore;
	}
	public Taglia getTaglia() {
		return taglia;
	}
	public void setTaglia(Taglia taglia) {
		this.taglia = taglia;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Maglia [scritta=");
		builder.append(scritta);
		builder.append(", prezzo=");
		builder.append(prezzo);
		builder.append(", colore=");
		builder.append(colore);
		builder.append(", taglia=");
		builder.append(taglia);
		builder.append(", IVA=");
		builder.append(IVA);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
