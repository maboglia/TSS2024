package modelli;

public class Registro {

	String nomeCorso;
	Studente[] studenti = new Studente[14];
	
	public void aggiungiStudente(Studente s, int pos) {
		studenti[pos] = s;
	}
	
	public void faiAppello() {
		
		for (int i = 0; i < studenti.length; i++) {
			if (studenti[i] != null)
				System.out.println("E' presente " + studenti[i].informazioni());
		}
		
	}
	
}
