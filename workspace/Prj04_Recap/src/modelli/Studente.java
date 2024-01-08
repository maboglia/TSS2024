package modelli;

public class Studente {

	String nome;
	String cognome;
	int anni;
	int[] libretto = new int[10];
	
	//metodo costruttore 1) inizia per maiuscola; 2) non ha tipo
	public Studente(String _nome, String _cognome, int annoNascita) {
		nome = _nome;
		cognome = _cognome;
		anni = 2024 - annoNascita;		
	}
	
	public String informazioni() {
		return nome + " " + cognome + " " + anni;
	}
	
	public void sostieneEsame(int voto, int pos) {
		libretto[pos] = voto;
	}
	
	public double calcolaMedia() {
		double totale = 0;
		int esami=0;
		for (int i = 0; i < libretto.length; i++) {
			if (libretto[i] >=18) {
				totale += libretto[i];
				esami++;
			}
		}
		return totale / esami;
	}
}
