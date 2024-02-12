package model;

public abstract class FiguraGeometrica {

	protected String nomeFigura;
	protected double perimetro;
	protected double superficie;

	public FiguraGeometrica() {
		System.out.println("Figura geometrica costruita");
	}

	public String getNomeFigura() {
		return nomeFigura;
	}

	public void setNomeFigura(String nomeFigura) {
		this.nomeFigura = nomeFigura;
	}
	
	public abstract double calcolaSuperficie();
	
	public abstract double calcolaPerimetro();

	@Override
	public String toString() {
		return "FiguraGeometrica [nomeFigura=" + nomeFigura + ", "
				+ "calcolaSuperficie()=" + calcolaSuperficie()
				+ ", calcolaPerimetro()=" + calcolaPerimetro() + "]";
	}
	
	
	
}
