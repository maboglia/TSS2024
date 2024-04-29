package strutturali.facade;

import java.time.LocalDate;

public class CarRental {
	public void book(LocalDate checkIn, LocalDate checkOut) {
		System.out.printf("Ho prenotato l'auto dal: %s al: %s ", checkIn, checkOut);
	}
}
