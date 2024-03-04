package com.maboglia.presentation;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MVCController {

	List<String> nani = List.of("pisolo","eolo", "mammolo","gongolo", "brontolo", "dotto","vongolo");
	
	@GetMapping("/")
	public String home() {
		return "homepage";
	}

	@GetMapping("/api")
	public String api() {
		return "api";
	}
	
	@GetMapping("/nani/{id}")
	public String apiById(@PathVariable int id, Model m) {
		System.out.println("L'id richiesto è: " + nani.get(id));
		m.addAttribute("nano", nani.get(id));
		return "nani";
	}
	
}
