package model;

public class Libro {

	private String collocazione;
	private String titolo;
	private String autore;
	
	/**
	 * <b>Costruisce oggetti di tipo Libro</b>
	 * @param titolo Inserisci come primo dato il titolo del libro
	 * @param autore Inserisci come secondo dato l'autore del libro
	 */
	public Libro(String titolo, String autore) {
		this.titolo = titolo;
		this.autore = autore;
		this.collocazione = creaNuovaCollocazione();	
	}

	private String creaNuovaCollocazione() {
		
		return this.autore
//				.substring(0,2)
				.toUpperCase()
				+ "-"
				+ this.titolo
//				.substring(0,2)
				.toUpperCase()
				+ "-"
				+ this.titolo.length()
				;
	}

	public String getCollocazione() {
		return collocazione;
	}

	public void setCollocazione(String collocazione) {
		this.collocazione = collocazione;
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

	@Override
	public String toString() {
		return "<li>" + collocazione + " - " + titolo + " - " + autore + "</li>";
	}
	
	
	
}
