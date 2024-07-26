package com.maboglia.biglietteria_concerti.services;

import java.util.List;

import com.maboglia.biglietteria_concerti.entities.Concert;

public interface ConcertService {

	List<Concert> getAllConcerts();
	Concert getConcertById(Long id);
	Concert saveConcert(Concert concert);
	void deleteConcert(Long id);

}
