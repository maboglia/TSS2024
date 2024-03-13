package avanzato;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class Portafoglio {

	Collection<Azione> titoli;

	public Portafoglio(List<Azione> titoli) {
		this.titoli = titoli;
	}
	
	public Portafoglio(Set<Azione> titoli) {
		this.titoli = titoli;
	}
	
	public Collection<Azione> getTitoli() {
		return titoli;
	}
	
	
}
