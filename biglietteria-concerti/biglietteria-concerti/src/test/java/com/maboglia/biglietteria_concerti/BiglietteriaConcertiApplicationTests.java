package com.maboglia.biglietteria_concerti;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.maboglia.biglietteria_concerti.entities.Concert;
import com.maboglia.biglietteria_concerti.services.ConcertService;

@SpringBootTest
class BiglietteriaConcertiApplicationTests {

	@Autowired
	ConcertService service;
	
	@Test
	void contextLoads() {
		
		String[] artisti = {"vasco", "liga", "mahmood"};
		
		for (String artista : artisti) {
			Concert c = new Concert();
			c.setName("Concerto di " + artista);
			c.setArtist(artista);
			c.setDate(LocalDate.now());
			c.setAvailableTickets(50);
			service.saveConcert(c);
		}
		
		assertTrue(service.getAllConcerts().size() == 8 );
		
	}

}
