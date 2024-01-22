package collezioni;

import java.util.ArrayList;

public class ListeDemo {

	public static void main(String[] args) {

		ArrayList<String> citta = new ArrayList<String>();
		
		citta.add("torino");//0
		citta.add("milano");//1
		citta.add("roma");//2
		citta.add("napoli");//3
		citta.add("bari");//4
		citta.add("roma");//5
		
		int numeroCitta = citta.size();
		System.out.println(numeroCitta);
		
//		citta.remove(2);
		
		for (String comune : citta) {
			System.out.println(comune);
		}

		System.out.println(citta.size());
	}

}
