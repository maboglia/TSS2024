package anonimous;

//OOP Astrazione, Incapsulamento, Ereditarietà, Polimorfismo

public class Film implements Comparable<Film> {

	private int id;
	private String titolo;
	private String regista;
	private int anno;
	private int rating;
	
	
	
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
	public String getRegista() {
		return regista;
	}
	public void setRegista(String regista) {
		this.regista = regista;
	}
	public int getAnno() {
		return anno;
	}
	public void setAnno(int anno) {
		this.anno = anno;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Film [id=");
		builder.append(id);
		builder.append(", titolo=");
		builder.append(titolo);
		builder.append(", regista=");
		builder.append(regista);
		builder.append(", anno=");
		builder.append(anno);
		builder.append(", rating=");
		builder.append(rating);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int compareTo(Film altroFilm) {
		// TODO Auto-generated method stub
		return this.anno - altroFilm.anno;
	}

	
}
