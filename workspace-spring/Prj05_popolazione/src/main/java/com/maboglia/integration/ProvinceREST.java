package com.maboglia.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maboglia.entities.Provincia;
import com.maboglia.services.ProvinciaService;

@RestController
@RequestMapping("api")
public class ProvinceREST {

	@Autowired
	private ProvinciaService service;
	
	@GetMapping("province")
	public List<Provincia> getAll(){
		return service.getAll();
	}

	@GetMapping("province/id/{id}")
	public Provincia getById(@PathVariable int id){
		return service.getById(id);
	}

	@GetMapping("province/{regione}")
	public List<Provincia> getByRegione(@PathVariable String regione){
		return service.getProvByRegione(regione);
	}
	
	@GetMapping("regioni")
	public List<String> getRegioni(){
		return service.getRegioni();
	}
	
	
	
}
