package com.agenziaviaggi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agenziaviaggi.entities.Prenotazione;
import com.agenziaviaggi.repos.PrenotazioneDAO;

@Service
public class PrenotazioneServiceImpl implements PrenotazioneService{
	
	@Autowired
	private PrenotazioneDAO dao;
	
	@Override
	public List<Prenotazione> getPrenotazioni() {
	
		return dao.findAll();
	}

	@Override
	public Prenotazione getPrenotazioneById(int id) {
		
		return dao.findById(id).get();
	}

	@Override
	public Prenotazione addPrenotazione(Prenotazione v) {
		
		return dao.save(v);
	}

	@Override
	public Prenotazione updatePrenotazione(Prenotazione v) {
	
		return dao.save(v);
	}

	@Override
	public void deletePrenotazione(Prenotazione v) {
		dao.delete(v);
	}

	
}
