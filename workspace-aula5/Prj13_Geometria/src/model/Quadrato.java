package model;

public class Quadrato extends Rettangolo {
	
	private Segmento lato;
	
	public Quadrato(Segmento lato) {
		super(lato, lato);
		this.lato = lato;
	}

	@Override
	public double superficie() {
		System.out.println("Metodo QUADRATO");
		return Math.pow(this.lato.lunghezza(), 2);
	}

	@Override
	public String toString() {
		return "Quadrato [lato=" + lato + ", toString()=" + super.toString() + "]";
	}

	
	
}
