package model;

import java.util.Random;

public class Tastiera extends Strumento {

	private String[] suoni = {
			"TIDUTIDIUDI",
			"DO RE MI FA SOL",
			"SI LA SOL FA MI RE",
			
	};
	
	public Tastiera() {
		super("Tastiera");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String suona() {
		// TODO Auto-generated method stub
		Random random = new Random(); 
		return suoni[random.nextInt(suoni.length)];
	}

}
