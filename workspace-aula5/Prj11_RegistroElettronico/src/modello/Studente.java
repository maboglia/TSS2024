package modello;

public class Studente {

	//stato interno della classe:
	//proprietà degli oggetti di tipo Studente
	//attributi, fields
	private String nome;
	private String cognome;
	//altre prop
	private int nMat;
	private static int contatore = 1;
	
	
	//metodi costruttori
	public Studente(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
		this.nMat = contatore++;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public int getnMat() {
		return nMat;
	}


	public void setnMat(int nMat) {
		this.nMat = nMat;
	}


	
	//metodi custom
	
	//metodo toString 
	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome + ", nMat=" + nMat + "]";
	}
	
	
	
}
