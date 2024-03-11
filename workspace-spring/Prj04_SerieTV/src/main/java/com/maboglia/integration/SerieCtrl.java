package com.maboglia.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.maboglia.entities.SerieTV;
import com.maboglia.services.SerieService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("api")
public class SerieCtrl {

	@Autowired
	private SerieService service;
	
	@GetMapping("serie")
	public List<SerieTV> getAll(){
		return service.getSerie();
	}
	
	@PostMapping("serie")
	public SerieTV add(@RequestBody SerieTV s) {
		return service.addSerie(s);
	}
	
	
}
