package logica;

public class Rubrica {

	public Contatto[] contatti;
	
	public Rubrica(int numeroContatti) {
		this.contatti = new Contatto[numeroContatti];
	}
	
	public boolean addContatto(String nome, String numero) {
		
		int pos = trovaPosizioneLibera();
		
		if (pos > -1) {
			Contatto c = new Contatto(nome, numero);
			
			this.contatti[pos] = c;
			System.out.println("Contatto inserito");
			return true;
			
		} else {
			System.out.println("la rubrica è piena!!!!");
			return false;
		}
		
	}
	
	public int trovaPosizioneLibera() {
		int pos = -1;
		for (int i = 0; i < contatti.length; i++) {
			if (contatti[i] == null)
				return i;
		}
		return pos;
	}
	
	
	public int contaContatti() {
		
		int totale = 0;
		
		for (Contatto contatto : contatti) {
			if (contatto != null)
				totale++;
		}
		
		return totale;
	}
	
	
}
