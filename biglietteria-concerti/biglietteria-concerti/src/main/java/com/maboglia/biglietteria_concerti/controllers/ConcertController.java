package com.maboglia.biglietteria_concerti.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maboglia.biglietteria_concerti.entities.Concert;
import com.maboglia.biglietteria_concerti.services.ConcertService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("api/concerts")
public class ConcertController {

	@Autowired
	private ConcertService service;
	
	private Logger logger = LoggerFactory.getLogger(ConcertController.class); 
	
	@GetMapping
	public ResponseEntity<List<Concert>> getAllConcerts(){
		logger.info("Azione GET richiesta, ritorno la lista dei concerti");
		return new ResponseEntity<>(service.getAllConcerts(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Concert> getConcertById(@PathVariable Long id){
		Concert concert = service.getConcertById(id);

		
		if (concert != null) {
			logger.info("Azione GET richiesta, ritorno UN SOLO CONCERTO " + concert.getName());
			return new ResponseEntity<>(concert, HttpStatus.OK);
		} else {
			
			logger.info("Azione GET richiesta, richesto un concerto non disponibile " + id);
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	@PostMapping
	public ResponseEntity<Concert> createConcert(@RequestBody Concert concert){
		logger.info("Azione POST richiesta, aggiunto un concerto " + concert.getName());
		return new ResponseEntity<>(service.saveConcert(concert), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteConcert(@PathVariable Long id){
		service.deleteConcert(id);
		logger.info("Azione DELETE richiesta, eliminato un concerto " + id);
		return new ResponseEntity<>(HttpStatus.I_AM_A_TEAPOT);
	}
	
}
