package com.maboglia.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maboglia.entities.Tutorial;
import com.maboglia.services.TutorialService;

@RestController
@RequestMapping("api")
public class TutorialREST {

	@Autowired
	TutorialService service;

	@GetMapping("all")
	public ResponseEntity<List<Tutorial>> getAll(){
		return ResponseEntity.ok(service.getTutorials());
	}
	
}
