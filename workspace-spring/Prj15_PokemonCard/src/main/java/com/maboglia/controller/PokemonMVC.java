package com.maboglia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.maboglia.services.PokemonService;

@Controller
public class PokemonMVC {

	@Autowired
	private PokemonService service;
	
	@GetMapping(path = {"pics", "foto", "immagini"})
	public String pics(Model m) {
		m.addAttribute("collezione", service.getPics());
		return "pics";
	}
	
}
