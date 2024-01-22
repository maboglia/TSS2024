package classi;

public class Rettangolo {

	private int base, altezza;

	public Rettangolo(int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	public double area() {
		return this.base * this.altezza;
	}
	
	public double perimetro(String s) {
		return (this.base + this.altezza)*2;
	}

	public double perimetro(boolean b) {
		return this.base * 2  + this.altezza * 2;
	}
	
}
