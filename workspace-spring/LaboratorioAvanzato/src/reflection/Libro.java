package reflection;

public class Libro {

	private static int counter = 1;
	
	private String titolo, autore;
	private int id, pagine;
	private double prezzo;

	public Libro() {
		this.setId(counter++);
	}

	public Libro(String titolo) {
		this();//chiamo il costruttore vuoto
		this.titolo = titolo;
	}

	public Libro(String titolo, String autore) {
		this(titolo);//chiamo il costruttore con solo titolo
		this.autore = autore;
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Libro.counter = counter;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}

	public int getPagine() {
		return pagine;
	}

	public void setPagine(int pagine) {
		this.pagine = pagine;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	
	
	
	
	
}
