package com.agenziaviaggi.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agenziaviaggi.entities.Cliente;
import com.agenziaviaggi.entities.Prenotazione;
import com.agenziaviaggi.entities.Viaggio;
import com.agenziaviaggi.services.ClienteService;
import com.agenziaviaggi.services.PrenotazioneService;
import com.agenziaviaggi.services.ViaggioService;

@RestController
@RequestMapping("api")
public class ViaggioCtrlRest {
	
	@Autowired
	private ViaggioService viaggioService;
	
	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private PrenotazioneService prenotazioneService;
	
	@GetMapping("viaggi")
	List<Viaggio> getViaggi(){
		System.out.println("best meak");
		return viaggioService.getViaggi();
	}
	@GetMapping("prenotazioni")
	List<Prenotazione> getPrenotazioni(){
		return prenotazioneService.getPrenotazioni();
	}
	@GetMapping("clienti")
	List<Cliente> getClienti(){
		return clienteService.getClienti();
	}

}
