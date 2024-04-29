package strutturali.facade;

import java.time.LocalDate;

public class ProgrammatoreVanza {

	public static void main(String[] args) {
		
		LocalDate startTime = LocalDate.of(2024, 5, 13);
		LocalDate stopTime = LocalDate.of(2024, 7, 31);
		
		VacanzeFacade vacanze = new VacanzeFacade();
		vacanze.book(startTime, stopTime);
		
	}

}
