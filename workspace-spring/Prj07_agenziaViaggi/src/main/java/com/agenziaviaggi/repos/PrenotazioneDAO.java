package com.agenziaviaggi.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agenziaviaggi.entities.Prenotazione;

public interface PrenotazioneDAO extends JpaRepository<Prenotazione, Integer> {

}
