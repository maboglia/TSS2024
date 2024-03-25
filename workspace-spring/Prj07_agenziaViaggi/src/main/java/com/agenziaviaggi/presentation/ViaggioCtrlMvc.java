package com.agenziaviaggi.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.agenziaviaggi.entities.Cliente;
import com.agenziaviaggi.entities.Prenotazione;
import com.agenziaviaggi.entities.Viaggio;
import com.agenziaviaggi.services.ClienteService;
import com.agenziaviaggi.services.PrenotazioneService;
import com.agenziaviaggi.services.ViaggioService;

@Controller
@RequestMapping("")
public class ViaggioCtrlMvc {

	@Autowired
	private ViaggioService viaggioService;

	@Autowired
	private ClienteService clienteService;

	@Autowired
	private PrenotazioneService prenotazioneService;

	@PostMapping("viaggi")
	@ResponseBody
	String addViaggio(Viaggio v) {
		viaggioService.addViaggio(v);
		return "Aggiunto";
	}
	@PostMapping("clienti")
	@ResponseBody
	String addCliente(Cliente c) {
		Cliente cliente = clienteService.addCliente(c);
		return "Aggiunto" + cliente.getId();
	}
	
	@PostMapping("prenotazioni")
	@ResponseBody
	String addPrenotazione(Prenotazione p) {
		prenotazioneService.addPrenotazione(p);
		return "Aggiunto";
	}


	@GetMapping("clienti")
	String getClienti(Model m) {
		m.addAttribute("titolo","elenco clienti");
		m.addAttribute("clienti",clienteService.getClienti());
		return "clienti";
	}
	@GetMapping("viaggi")
	String getViaggi(Model m) {
		m.addAttribute("titolo","elenco viaggi");
		m.addAttribute("viaggi",viaggioService.getViaggi());
		return "viaggi";
	}
	
	@GetMapping("prenotazioni")
	String getPrenotazioni(Model m) {
		m.addAttribute("titolo","elenco prenotazioni");
		m.addAttribute("prenotazioni",prenotazioneService.getPrenotazioni());
		return "prenotazioni";
	}

}
