package app;

import java.util.Scanner;

public class MioScanner {

	
	public static String chiediAllUtente(String domanda) {

		//dichiaro e inizializzo un oggetto di tipo scanner
		Scanner scanner = new Scanner(System.in);
		
		//faccio la domanda all'utente
		System.out.println(domanda);
		
		//ritorno la risposta in formato di String
		return scanner.nextLine();
	}

}