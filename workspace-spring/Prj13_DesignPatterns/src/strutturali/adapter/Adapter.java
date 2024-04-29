package strutturali.adapter;

public class Adapter implements PriceCalculator {

	PriceCalculator USAPriceCalculator ;
	
	public Adapter(PriceCalculator calculator) {
		this.USAPriceCalculator = calculator;
	}
	
	@Override
	public String calculatePrice() {
		// sì, ma è brutto!!!!!! va beh, poi lo rifaccio meglio
		return USAPriceCalculator.calculatePrice().replace('€', '$');
	}

}
