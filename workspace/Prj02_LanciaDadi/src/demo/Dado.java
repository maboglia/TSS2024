package demo;

public class Dado {

	int facce;
	String colore;
	
	public Dado(int numeroFacce) {//metodo costruttore new Dado(6)
		facce = numeroFacce;
		colore = "bianco";
	}
	
	public int lancia() {
		
		double casuale = Math.random();//0.0 < 1.0
		
		int valore = (int)(casuale * facce) + 1;//cast: forzatura
		
		return valore;
	}
	
}
