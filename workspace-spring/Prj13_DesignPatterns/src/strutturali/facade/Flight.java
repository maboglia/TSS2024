package strutturali.facade;

import java.time.LocalDate;

public class Flight {

	public void departure(LocalDate start) {
		System.out.printf("Partenza volo andata: %s %n", start);
	}
	
	public void arrival(LocalDate stop) {
		System.out.printf("Partenza volo ritorno: %s %n", stop);
	}
	
}
