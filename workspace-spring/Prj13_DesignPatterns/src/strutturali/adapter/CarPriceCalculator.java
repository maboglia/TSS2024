package strutturali.adapter;

public class CarPriceCalculator implements PriceCalculator {

	private int age;
	private String model;
	public static int  averageCarPrice = 3000;
	
	public CarPriceCalculator(String model, int age) {
		this.age = age;
		this.model = model;
	}
	
	public int getPrice() {
		switch (model) {
		case "Panda":
			return 2500;
		case "Golf":
			return 3500;
		case "Q5":
			return 4500;
		case "GranTurismo":
			return 5500;
		default:
			return averageCarPrice;
		}
	}
	
	
	@Override
	public String calculatePrice() {
		int price = Math.max(getPrice() - (age * 100) , 0);
		return price + "€";
	}

}
