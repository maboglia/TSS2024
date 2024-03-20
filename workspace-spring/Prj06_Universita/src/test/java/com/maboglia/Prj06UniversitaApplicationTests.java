package com.maboglia;

import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.maboglia.entities.Corso;
import com.maboglia.entities.Studente;
import com.maboglia.services.UniversityService;

@SpringBootTest
class Prj06UniversitaApplicationTests {

	@Autowired
	private UniversityService service;
	
	@Test
	void addStudente() {
		
		Corso c = new Corso("Java");
		Studente s = new Studente("mauro");
		Studente s1 = new Studente("eliana");
		service.addStudente(s);
		service.addStudente(s1);
		
		c.setStudenti(Set.of(s,s1));
		service.addCorso(c);
		
		
	}
	
	

}
