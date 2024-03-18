package test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import controller.RegioniCtrl;
import model.Provincia;
import model.Regione;

public class RegioniDemo {

	public static void main(String[] args) {
		
		Regione piemonte = new Regione("Piemonte", 4_000_000, Set.of(
					new Provincia(1, new Regione(), "Torino", 500_000, 500_000, 1_000_000),
					new Provincia(2, new Regione(), "Asti", 100_000, 100_000, 200_000),
					new Provincia(3, new Regione(), "Cuneo", 200_000, 200_000, 400_000)
				));
		
		Regione lombardia = new Regione("Lombardia", 10_000_000, Set.of(
				new Provincia(1, new Regione(), "Milano", 1500_000, 1500_000, 3_000_000),
				new Provincia(2, new Regione(), "Como", 300_000, 300_000, 600_000),
				new Provincia(3, new Regione(), "Varese", 250_000, 250_000, 500_000)
				));
		
		Set<Regione> set = new HashSet<Regione>();
		set.add(piemonte);
		set.add(lombardia);
		RegioniCtrl ctr = new RegioniCtrl(set);
		
		ctr.getListRegioni()
			.forEach(r -> System.out.println(r));
		
		ctr
			.getRegioniByPopolazioneBetween(2_000_000, 6_000_000)
			.forEach(System.out::println);
		
		List<Set<Provincia>> list = ctr.getListRegioni().stream().map(r -> r.getProvince())
		.toList();
		
		List<List<Provincia>> list2 = list.stream().map(pp -> pp.stream().toList()).toList();
		
		List<List<String>> list3 = list2.stream()
		.map(l -> l.stream().toList().stream().map(ll->ll.getNome()).toList())
		.toList();
		list3.get(0).forEach(System.out::println);
		
	}
	
}
