package com.maboglia.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maboglia.entities.Domanda;
import com.maboglia.entities.Persona;
import com.maboglia.entities.Test;
import com.maboglia.service.QuizService;

@RestController
@RequestMapping("api")
public class QuizREST {

	@Autowired
	private QuizService service;
	
	@GetMapping("persone")
	public ResponseEntity<List<Persona>> getPersone(){
		return new ResponseEntity<>(service.getPersone(),HttpStatus.OK);
	}
	
	@GetMapping("domande")
	public ResponseEntity<List<Domanda>> getDomande(){
		return new ResponseEntity<>(service.getDomande(),HttpStatus.OK);
	}
	
	@GetMapping("test")
	public ResponseEntity<List<Test>> getTest(){
		return new ResponseEntity<>(service.getTest(),HttpStatus.OK);
	}
	
	
	@PostMapping("persone")
	public ResponseEntity<Persona> addPersone(@RequestBody Persona p){
		return new ResponseEntity<>(service.addPersona(p),HttpStatus.CREATED);
	}
	
	@PostMapping("domande")
	public ResponseEntity<Domanda> addDomande(@RequestBody Domanda d){
		return new ResponseEntity<>(service.addDomanda(d),HttpStatus.CREATED);
	}
	
	@PostMapping("test")
	public ResponseEntity<Test> addTest(@RequestBody Test t){
		return new ResponseEntity<>(service.addTest(t),HttpStatus.CREATED);
	}
	
	
	
	
}
