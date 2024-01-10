package demo;

import java.util.Scanner;

public class Calcolatrice {

	/**
	 * Metodo per eseguire l'addizione di interi
	 * @param a : inserire il primo addendo
	 * @param b : inserire il secondo addendo
	 * @return il risultato dell'addizione
	 */
	public static int addizione(int a, int b) {
		//int somma = a + b;
		return a + b;
	}
	public static int sottrazione(int a, int b) {
		//int somma = a + b;
		return a - b;
	}
	public static int moltiplicazione(int a, int b) {
		//int somma = a + b;
		return a * b;
	}
	public static double divisione(double a, double b) {
		//int somma = a + b;
		return a / b;
	}

	
	
	public static int chiedi(String domanda) {
		Scanner mioScanner = new Scanner(System.in);
		System.out.println(domanda);
		return mioScanner.nextInt();
		
	}
	
	public static void main(String[] args) {

		int addendo1 = chiedi("Inserisci il primo valore intero");
		int addendo2 = chiedi("Inserisci il secondo valore intero");
		int risultato = addizione(addendo1, addendo2);
		System.out.println("Il risultato dell'addizione è: " + risultato);

		risultato = sottrazione(addendo1, addendo2);
		System.out.println("Il risultato della sottrazione è: " + risultato);

		risultato = moltiplicazione(addendo1, addendo2);
		System.out.println("Il risultato della moltiplicazione è: " + risultato);
		
//		risultato = divisione(addendo1, addendo2);
		System.out.println("Il risultato della divisione è: " + divisione(addendo1, addendo2));
		
	}

	
	
}
