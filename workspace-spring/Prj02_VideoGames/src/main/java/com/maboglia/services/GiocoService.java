package com.maboglia.services;

import java.util.List;

import com.maboglia.entities.Gioco;

public interface GiocoService {

	List<Gioco> getGiochi();
	void addGioco(Gioco g);
	
}
