package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ProvaMappe {

	public static void main(String[] args) {
		//   Set     Collection
		Map<String, String> regioni = new HashMap<>(); 
		
		regioni.put("piemont", "torino");
		regioni.put("piemonte", "torino");
		regioni.put("lombardia", "milano");
		regioni.put("lazio", "roma");
		regioni.put("campania", "napoli");
		
		//System.out.println("Il capoluogo della regione Piemonte " + regioni.get("piemonte"));
		
		Set<String> keySet = regioni.keySet();
		
		Collection<String> capoluoghi = regioni.values();
		
		Set<Entry<String, String>> entrySet = regioni.entrySet();
		
		for (String chiave : keySet) {
			System.out.println(  chiave + ": " + regioni.get(chiave) );
		}

	}

}
