package liste;

import java.util.ArrayList;
import java.util.LinkedList;

public class ProvaLinkedList {

	public static void main(String[] args) {

		LinkedList<String> giorni = new LinkedList<String>();
		
		giorni.add("lunedì");
		giorni.add("martedì");
		giorni.add("mercoledì");
		giorni.add("giovedì");
		giorni.add("venerdì");
		giorni.add("sabato");
		giorni.add("domenica");
		giorni.add("lunedì");
		
		System.out.printf("La dimensione %s  di giorni è %s", "della collezione", giorni.size());
		
	}

}
