package com.maboglia;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.maboglia.entities.SerieTV;
import com.maboglia.services.SerieService;

@SpringBootTest
class Prj04SerieTvApplicationTests {

	@Autowired
	private SerieService service;
	
	@Test
	void contextLoads() {
		
		SerieTV s = new SerieTV();
		s.setTitle("prova test");
		SerieTV aggiunta = service.addSerie(s);
		System.out.println(aggiunta);
		assertTrue(aggiunta.getTitle().startsWith("gro"));
	}
	
	@Test
	void delSerie() {
		System.out.println(service.getSerieById(5));
		service.deleteSerie(5);
		System.out.println(service.getSerieById(5));
		
	}

}
