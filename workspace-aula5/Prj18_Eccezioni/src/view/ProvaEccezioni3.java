package view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProvaEccezioni3 {

	public static void prova() throws Exception {
		
	}
	
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		
		boolean gira = true;
		
		try {
			while (gira) {
				System.out.println("Inserisci intero");
				int i = input.nextInt();
				System.out.println(i);
			}
		} catch (InputMismatchException e) {
			System.err.println("Non hai inserito un INTERO!!!!");
		}
		
		prova();
		
		System.out.println("Game over!");
		
	}

}
