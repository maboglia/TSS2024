package avanzato;

import java.util.Objects;

public class Libro implements Comparable<Libro>{

	String titolo;
	int pagine;
	double prezzo;
	
	public double getPrezzo() {
		return prezzo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(pagine, prezzo, titolo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(titolo, other.titolo);
	}

	@Override
	public int compareTo(Libro o) {
		// TODO Auto-generated method stub
		return this.titolo.compareTo(o.titolo);
	}
	
	
}
