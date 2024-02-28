package liste;

import java.util.ArrayList;

public class ProvaArrayList {

	public static void main(String[] args) {

		ArrayList<String> giorni = new ArrayList<String>();
		
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
