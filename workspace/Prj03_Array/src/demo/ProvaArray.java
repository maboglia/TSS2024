package demo;

public class ProvaArray {

	public static void main(String[] args) {

		int[] voti = new int[10];
		
		voti[0] = 27;
		voti[1] = 28;
		voti[2] = 22;
		voti[3] = 24;
		voti[4] = 26;
		
		//shortcut
		
		int[] voti2 = {27,28,22,24,26};
		
		int somma = 0;
		
		for (int i = 0; i < voti2.length; i++) {
			somma += voti2[i];
		}
		
		System.out.println("Il totale dei voti è: " + somma);
		double media = (double)somma / voti2.length;
		System.out.println("La media è: " + media);
		System.out.println("voto in 110: " + (media / 3 * 11));
		
	}

}
