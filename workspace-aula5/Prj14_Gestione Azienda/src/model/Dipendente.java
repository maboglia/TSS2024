package model;

public class Dipendente {

	private static int matricolatore = 1;
	private int numeroMatricola;

	protected String nome;
	protected String cognome;
	protected double stipendio;
	
	public Dipendente(String nome, String cognome) {
		//super();
		this.nome = nome;
		this.cognome = cognome;
		this.numeroMatricola = matricolatore++;
	}

	@Override
	public String toString() {
		return "Dipendente [numeroMatricola=" + numeroMatricola + ", nome=" + nome + ", cognome=" + cognome
				+ ", stipendio=" + stipendio + "]";
	}

	
	
}
