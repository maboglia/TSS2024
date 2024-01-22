package model;

public class Triangolo {

	private Punto a,b,c;
	private Segmento ab, ac, bc;
	
	public Triangolo(Punto a, Punto b, Punto c) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.ab = new Segmento(a, b);
		this.ac = new Segmento(a, c);
		this.bc = new Segmento(b, c);
	}
	
	public double perimetro() {
		return ab.lunghezza() + ac.lunghezza() + bc.lunghezza();
	}
	
	public double superficie() {
		double sp = perimetro()/2;
		
		return Math.sqrt(
				sp * 
				(sp-ab.lunghezza()) * 
				(sp-ac.lunghezza()) * 
				(sp-bc.lunghezza())
				);
				
	}

	@Override
	public String toString() {
		return "Triangolo [a=" + a + ", b=" + b + ", c=" + c + ", ab=" + ab + ", ac=" + ac + ", bc=" + bc
				+ ", perimetro()=" + perimetro() + ", superficie()=" + superficie() + "]";
	}
	
	
}
