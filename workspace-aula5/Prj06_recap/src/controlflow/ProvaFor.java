package controlflow;

public class ProvaFor {

	public static void main(String[] args) {

		for(int i = 0; i < 10; i++ ) {
			System.out.println("ripetizione n. " + i);
		}
		
		int[] voti = {25,24,28,27,30,22};
		int lunghezza = voti.length;
		
		double totale = 0;
		for (int i = 0; i < lunghezza; i++) {
			int voto = voti[i];
			totale += voto;
			System.out.println(totale);
		}
		System.out.println("la media aritmetica: " + (totale / lunghezza));
		int i = 0;
		for (int voto : voti) {
			System.out.println(voto + " " +i);
			if (i == 3) break;
			i++;
		}

	}

}
