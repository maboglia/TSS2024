package set;

import java.util.HashSet;
import java.util.Set;

public class ProvaHashSet {

	public static void main(String[] args) {
		Set<String> giorni = new HashSet<String>();
		
		giorni.add("lunedì");
		giorni.add("martedì");
		giorni.add("mercoledì");
		giorni.add("giovedì");
		giorni.add("venerdì");
		giorni.add("sabato");
		giorni.add("domenica");
		giorni.add("lunedì");
		
		System.out.printf("La dimensione %s  di giorni è %s", "della collezione", giorni.size());
		
		giorni.forEach(g->System.out.println(g));

	}

}
