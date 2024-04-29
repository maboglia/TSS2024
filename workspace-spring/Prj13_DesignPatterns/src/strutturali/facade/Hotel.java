package strutturali.facade;

import java.time.LocalDate;

public class Hotel {

	public void book(LocalDate checkIn, LocalDate checkOut) {
		System.out.printf("Ho prenotato l'hotel dal: %s al: %s ", checkIn, checkOut);
	}
	
}
