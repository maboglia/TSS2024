package model;

public enum Taglia {

	XS(38), S(42), M(46), L(52), XL(56);
	
	private int numTaglia;
	
	private Taglia(int numTaglia) {
		this.numTaglia = numTaglia;
	}

	public int getNumTaglia() {
		return numTaglia;
	}
	
	
}
