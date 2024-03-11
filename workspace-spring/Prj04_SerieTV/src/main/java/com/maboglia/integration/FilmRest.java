package com.maboglia.integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.maboglia.entities.FilmTriste;
import com.maboglia.services.FilmService;

@RestController
public class FilmRest {

	@Autowired
	private FilmService service;
	
	@PostMapping("film")
	public FilmTriste addFilm(@RequestBody FilmTriste film) {
		return service.addFilm(film);
	}
	
	
}
