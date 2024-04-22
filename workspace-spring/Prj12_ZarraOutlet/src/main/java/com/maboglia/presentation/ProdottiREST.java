package com.maboglia.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.maboglia.entities.Prodotto;
import com.maboglia.services.ProdottiService;

@RestController
@RequestMapping("api")
public class ProdottiREST {

	@Autowired
	ProdottiService service;
	
	@GetMapping("prodotti/{min}/{max}")
	public ResponseEntity<List<Prodotto>> getProdotti(@PathVariable int min, @PathVariable int max ) {
	
		return new ResponseEntity<List<Prodotto>>(service
				.getProdotti()
				.stream()
				.filter(p -> p.getPrice()<max)
				.filter(p -> p.getPrice()>min)
				.toList(), HttpStatus.OK);
	}
	
	
}
