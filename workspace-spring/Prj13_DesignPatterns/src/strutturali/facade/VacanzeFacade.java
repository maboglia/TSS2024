package strutturali.facade;

import java.time.LocalDate;

public class VacanzeFacade {

	public void book(LocalDate startTime, LocalDate stopTime) {
		Flight volo = new Flight();
		volo.departure(startTime);
		volo.arrival(stopTime);
		
		Hotel hotel = new Hotel();
		hotel.book(startTime, stopTime);

		CarRental auto = new CarRental();
		auto.book(startTime, stopTime);
	}
	
}
