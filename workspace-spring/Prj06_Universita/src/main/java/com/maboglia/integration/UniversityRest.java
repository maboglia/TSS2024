package com.maboglia.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maboglia.entities.Corso;
import com.maboglia.entities.Studente;
import com.maboglia.services.UniversityService;

@RestController
@RequestMapping("api")
public class UniversityRest {

	@Autowired
	private UniversityService service;
	
	@GetMapping("studenti") 
	public List<Studente> getStudenti(){
		return service.getStudentes();
	}
	@GetMapping("corsi") 
	public List<Corso> getCorsi(){
		return service.getCorsi();
	}
	
	@PostMapping("studenti")
	public Studente addStudente(@RequestBody Studente s) {
		return service.addStudente(s);
	}
	
	@PostMapping("corsi")
	public Corso addCorso(@RequestBody Corso c) {
		return service.addCorso(c);
	}
	
}
