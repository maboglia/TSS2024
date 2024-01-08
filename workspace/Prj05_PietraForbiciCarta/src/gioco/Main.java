package gioco;

import java.util.Scanner;

public class Main {

	private static String chiediUtente() {
		System.out.println("Scegli tra PIETRA, FORBICI, CARTA");
		Scanner sc = new Scanner(System.in);
		String scelta = sc.nextLine();
		sc.close();
		return scelta;
	}
	
	private static String sceltaPC() {
		//String scelta = "CARTA";
		double casuale = Math.random();
		
		if (casuale < 0.33)
			return "PIETRA";
		else if (casuale < 0.66)
			return "FORBICI";
		else 
			return "CARTA";
	}
	
	private static String valutaScelte(String sceltaUtente, String sceltaPC) {
		if (sceltaUtente.equals(sceltaPC))
			return "PAREGGIO";
		else {
			
			switch (sceltaUtente) {
			case "PIETRA":
				if(sceltaPC.equals("FORBICI"))
					return "VINCE UMANO";
				else
					return "VINCE PC";
			case "FORBICI":
				if(sceltaPC.equals("CARTA"))
					return "VINCE UMANO";
				else
					return "VINCE PC";	
			case "CARTA":
				if(sceltaPC.equals("PIETRA"))
					return "VINCE UMANO";
				else
					return "VINCE PC";	

			default:
				return "QUALCOSA NON HA FUNZIONATO";
			}
		
			
		}
	}
	
	public static void main(String[] args) {

		String sceltaUtente = chiediUtente();
		String sceltaPC = sceltaPC();
		String result = valutaScelte(sceltaUtente, sceltaPC);
		System.out.println("UMANO ha giocato " + sceltaUtente);
		System.out.println("PC ha giocato " + sceltaPC);
		System.out.println("Il risultato è: " +  result);
	}

	

}
