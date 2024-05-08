package avanzato;

import java.util.List;

public class ComparaLibri {

	public static void main(String[] args) {
		Libro l1 = new Libro();
		l1.titolo = "i malavoglia";
		l1.pagine = 100;
		l1.prezzo = 1000;
		
		Libro l2 = new Libro();
		l2.titolo = "I malavoglia";
		l2.pagine = 98;
		l2.prezzo = 10;
		
		System.out.println(l1.equals(l2));
		System.out.println(l1.toString());
		System.out.println(l2);
		
		List.of(l1, l2)
			.stream()
			.sorted((ll1,ll2)->Double.compare(ll2.prezzo, ll1.prezzo))
			.forEach(l->System.out.println(l.titolo+":"+l.getPrezzo()));
		
		

	}

}
