package model;

import java.util.Random;

public class Batteria extends Strumento {

	private String[] suoni = {
			"BAt BAT TUM STOP",
			"TACATACATCATCATCCAT",
			"CIAK CIA tt CIIA TT C",
			
	};
	
	public Batteria() {
		super("Batteria");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String suona() {
		// TODO Auto-generated method stub
		Random random = new Random(); 
		return suoni[random.nextInt(suoni.length)];
	}

}
