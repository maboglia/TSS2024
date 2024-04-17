package com.maboglia;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.maboglia.entities.Cliente;
import com.maboglia.entities.Ordine;
import com.maboglia.entities.Persona;
import com.maboglia.entities.Portata;
import com.maboglia.entities.Tavolo;
import com.maboglia.entities.portate.Pizza;
import com.maboglia.services.PizzeriaService;

@SpringBootTest
class PizzeriaApplicationTests {

	@Autowired
	private PizzeriaService service;
	
	@Test
	void getPizze() {
		service.getPizze().stream().forEach(p->System.out.println(p.getNome()));
	}

	@Test
	void getClienti() {
		List<Cliente> clienti = service.getClienti();
		assertTrue(clienti != null);
	
	}
	@Test
	void addOrdine() {
		Cliente c = new Cliente();
		c.setUsername("pippo");
		c.setPassword("12345");
		c.setPhone("123456");
		
		Pizza p1 = service.getPizze().get(0);
		Pizza p2 = service.getPizze().get(1);
		Pizza p3 = service.getPizze().get(2);
		
		Tavolo t = new Tavolo();
		t.setNumero(1);
		t.setPosti(4);
		t.setPersone(List.of(new Persona(),new Persona(),new Persona(),new Persona()));
		
		Ordine o = new Ordine();
		o.setAsporto(false);
//		o.setCliente(c);
		o.setTavolo(t);
		o.setDataOrdine(LocalDate.now());
		o.setOraOrdine(LocalTime.now());
		o.setPortate(List.of(p1,p2,p3));

		System.out.println(o.print());
	}
	
	//@Test
	void addCliente() {
		Cliente c = new Cliente();
		c.setUsername("pippo");
		c.setPassword("12345");
		c.setPhone("123456");
		Cliente cliente = service.addCliente(c);
		assertEquals(cliente.getUsername(), "pippo");
				
	}
	
	
	
	
	
	
	
	
}
