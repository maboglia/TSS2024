package strutturali.adapter;

public class NoleggioVeicoli {

	public static void main(String[] args) {

		CarPriceCalculator auto = new CarPriceCalculator("Panda", 10);
		stampaFattura(auto);
		
		CamperPriceCalculator camper = new CamperPriceCalculator(10, 150000);
		stampaFattura(camper);

		CamperPriceCalculator camperUSA = new CamperPriceCalculator(10, 150000);
		Adapter adapter = new Adapter(camperUSA); 
		stampaFattura(adapter);

	}

	private static void stampaFattura(PriceCalculator mezzo) {
		String prezzoNoleggio = mezzo.calculatePrice();
		System.out.println("Il prezzo di noleggio è: " + prezzoNoleggio);
		
	}

}
