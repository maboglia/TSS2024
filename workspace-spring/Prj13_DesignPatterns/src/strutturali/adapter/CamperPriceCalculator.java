package strutturali.adapter;

public class CamperPriceCalculator implements PriceCalculator {

	private int age;
	private int km;
	private int averagePrice = 7000;
	
	public CamperPriceCalculator(int age, int km) {
		this.age = age;
		this.km = km;
	}
	
	
	@Override
	public String calculatePrice() {
		return ""+(averagePrice - (age*100)-(km/100))+"€";
	}

}
