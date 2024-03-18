package com.maboglia.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.maboglia.services.ProvinciaService;

import jakarta.servlet.http.HttpSession;

@Controller
public class ProvinceMVC {

	@Autowired
	private ProvinciaService service;
	
	@GetMapping("")
	public String home() {
		return "homepage";
	}
	
	@GetMapping("regioni")
	public String regioni(Model m, HttpSession session ) {
		m.addAttribute("regioni", service.getRegioni());
		//session.setAttribute("logged", "loggato");
		return "regioni";
	}
	
	@GetMapping("eta")
	public String eta() {
		return "eta";
	}
	
	
}
