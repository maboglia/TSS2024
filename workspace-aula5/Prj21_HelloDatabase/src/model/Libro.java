package model;

public class Libro {//POJO - Javabean

	private int id;
	private String titolo;
	private double prezzo;
	private int pagine;
	private int idEditore;
	
		 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public int getPagine() {
		return pagine;
	}

	public void setPagine(int pagine) {
		this.pagine = pagine;
	}

	public int getIdEditore() {
		return idEditore;
	}

	public void setIdEditore(int idEditore) {
		this.idEditore = idEditore;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titolo=" + titolo + ", prezzo=" + prezzo + ", pagine=" + pagine + ", idEditore="
				+ idEditore + "]";
	}
	
	
	
	
}
