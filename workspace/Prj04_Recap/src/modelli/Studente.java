package modelli;

public class Studente {

	String nome;
	String cognome;
	int anni;
	
	//metodo costruttore 1) inizia per maiuscola; 2) non ha tipo
	public Studente(String _nome, String _cognome, int annoNascita) {
		nome = _nome;
		cognome = _cognome;
		anni = 2024 - annoNascita;		
	}
	
	public String informazioni() {
		return nome + " " + cognome + " " + anni;
	}
	
	
}
