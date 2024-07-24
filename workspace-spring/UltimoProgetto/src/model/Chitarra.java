package model;

import java.util.Random;

public class Chitarra extends Strumento {

	private String[] suoni = {
			"SDRAANG SDADEAFI",
			"SDLIN SDLON SDAAAAN",
			"DEN DEN DEN",
			
	};
	
	public Chitarra() {
		super("Chitarra");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String suona() {
		// TODO Auto-generated method stub
		Random random = new Random(); 
		return suoni[random.nextInt(suoni.length)];
	}

}
