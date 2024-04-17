package com.maboglia.il;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maboglia.entities.portate.Pizza;
import com.maboglia.services.PizzeriaService;

@RestController
@RequestMapping("api")
public class PizzeriaREST {

	@Autowired
	private PizzeriaService service;
	
	@GetMapping("pizze")
	ResponseEntity<List<Pizza>> getPizze(){
		return new ResponseEntity<List<Pizza>>(service.getPizze(), HttpStatus.OK);
	}
	
}
