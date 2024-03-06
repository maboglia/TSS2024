package com.maboglia.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maboglia.entities.Libro;
import com.maboglia.services.LibroService;

@RestController
public class LibroCtrl {

	@Autowired
	private LibroService service;
	
	@CrossOrigin 
	@GetMapping("api/libri")
	public List<Libro> getLibri(){
		return service.getLibri();
	}
	
}
