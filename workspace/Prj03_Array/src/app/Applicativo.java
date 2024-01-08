package app;

public class Applicativo {

	public static void main(String[] args) {
		
		String[] listaCoseDaFare = new String[10];
		
		chiedi(listaCoseDaFare);
		
		stampaLista(listaCoseDaFare);
		
	}//fine metodo main


	private static void chiedi(String[] listaCoseDaFare) {
		//chiedi a utente per 10 volte cosa vuole comprare
		
		final int VOLTE = 10;
		final String DOMANDA = "Cosa vuoi comprare?";
		
		for (int i = 0; i<VOLTE ; i++) {
			
			listaCoseDaFare[i] = MioScanner.chiediAllUtente(DOMANDA);
			
		}//fine ciclo for
	}
	

	private static void stampaLista(String[] listaCoseDaFare) {

		for (int i = 0; i < listaCoseDaFare.length; i++) {
			System.out.println(listaCoseDaFare[i]);
		}
		
	}

}//fine classe Applicativo
