package com.agenziaviaggi.services;

import java.util.List;

import com.agenziaviaggi.entities.Prenotazione;

public interface PrenotazioneService {

	List<Prenotazione> getPrenotazioni();
	Prenotazione getPrenotazioneById(int id);
	Prenotazione addPrenotazione(Prenotazione v);
	Prenotazione updatePrenotazione(Prenotazione v);
	void deletePrenotazione(Prenotazione v);
}
