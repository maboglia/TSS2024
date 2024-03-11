package model;

public enum Colore {

	RED("#FF0000"), GREEN("#00FF00"), BLUE("#0000FF");
	
	private String esa ;
	
	private Colore(String valoreEsa) {
		this.esa = valoreEsa;
	}
	public String getEsa() {
		return esa;
	}
}
