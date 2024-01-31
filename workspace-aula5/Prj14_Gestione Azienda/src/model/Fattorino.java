package model;

public class Fattorino extends Dipendente {

	private int numeroConsegne;
	
	public Fattorino(String nome, String cognome) {
		super(nome, cognome);
		// TODO Auto-generated constructor stub
	}

	public int getNumeroConsegne() {
		return numeroConsegne;
	}

	public void setNumeroConsegne(int numeroConsegne) {
		this.numeroConsegne = numeroConsegne;
	}
	
	public void calcolaStipendio() {
		this.stipendio = numeroConsegne * 5;
	}

	@Override
	public String toString() {
		return "Fattorino [nome e cognome="+
				super.toString()+
				"   numeroConsegne=" +
				numeroConsegne +
				"]";
	}

	
}
