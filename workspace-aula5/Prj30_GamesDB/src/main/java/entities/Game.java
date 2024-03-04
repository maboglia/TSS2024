package entities;

public class Game {

	private int id;
	private String title;
	private Genere genre;
	private String publisher;
	private String originalPlatform;
	private int year;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Genere getGenre() {
		return genre;
	}
	public void setGenre(Genere genre) {
		this.genre = genre;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getOriginalPlatform() {
		return originalPlatform;
	}
	public void setOriginalPlatform(String originalPlatform) {
		this.originalPlatform = originalPlatform;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Game [id=" + id + ", title=" + title + ", genre=" + genre + ", publisher=" + publisher
				+ ", originalPlatform=" + originalPlatform + ", year=" + year + "]";
	}
	
	
	
}
