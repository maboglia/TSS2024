package model;

public class Film implements Comparable<Film> {
	
	private int id;
	private float rating;
	private String titolo;
	private int anno;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public int getAnno() {
		return anno;
	}
	public void setAnno(int anno) {
		this.anno = anno;
	}
	@Override
	public String toString() {
		return "Film [id=" + id + ", rating=" + rating + ", titolo=" + titolo + ", anno=" + anno + "]";
	}
	@Override
	public int compareTo(Film o) {
		// TODO Auto-generated method stub
		return this.anno - o.anno;
	}
	
	
	

}
