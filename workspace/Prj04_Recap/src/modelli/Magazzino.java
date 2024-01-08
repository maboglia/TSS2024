package modelli;

public class Magazzino {

	Prodotto[] prodotti = new Prodotto[10];
	
	public void addProdotto(Prodotto p, int pos) {
		//aggiungi il prodotto p all aposizione pos
		prodotti[pos] = p;
	}
	
	public void stampaProdotti() {
		
		for (Prodotto prodotto : prodotti) {
			if(prodotto != null)
				System.out.println(prodotto.nome);
		}
		
	}
}
