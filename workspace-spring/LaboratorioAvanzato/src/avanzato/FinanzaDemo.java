package avanzato;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;






public class FinanzaDemo {

	public static void main(String[] args) {

		Azione a1 = new Azione(1, "ferrari", 15);
		Azione a2 = new Azione(2, "maserati", 10);
		Azione a3 = new Azione(3, "porsche", 25);
		Azione a4 = new Azione(4, "audi", 18);
		
		List<Azione> azioniMauro = List.of(a1,a2,a3,a4);
		Set<Azione> azioniSurya = Set.of(a1,a2,a4);
		
		Portafoglio p1 = new Portafoglio(azioniMauro);
		Portafoglio p2 = new Portafoglio(azioniSurya);
		
		//Collections.sort
		

			
	
		
		p1
			.getTitoli()
			.stream()
			.sorted((azione1,  azione2) -> azione2.getId() - azione1.getId())
			.forEach(a -> System.out.println(a));

	}

}
