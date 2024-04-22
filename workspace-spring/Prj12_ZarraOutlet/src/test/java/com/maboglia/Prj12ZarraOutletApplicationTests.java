package com.maboglia;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.maboglia.services.MieiProdottiService;

@SpringBootTest
class Prj12ZarraOutletApplicationTests {

	@Autowired
	MieiProdottiService service;
	
	@Test
	void contextLoads() {
		service.caricaProdotti();
	}

}
