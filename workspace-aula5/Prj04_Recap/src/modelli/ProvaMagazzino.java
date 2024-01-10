package modelli;

public class ProvaMagazzino {

	public static void main(String[] args) {
		Magazzino m = new Magazzino();
		
		Prodotto p1 = new Prodotto("penna","penna blu", 1);
		m.addProdotto(p1, 0);
		
		m.stampaProdotti();

	}

}
