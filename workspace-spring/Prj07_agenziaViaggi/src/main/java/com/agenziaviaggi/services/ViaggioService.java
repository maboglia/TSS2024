package com.agenziaviaggi.services;

import java.util.List;

import com.agenziaviaggi.entities.Viaggio;

public interface ViaggioService {

	List<Viaggio> getViaggi();
	Viaggio getViaggioById(int id);
	Viaggio addViaggio(Viaggio v);
	Viaggio updateViaggio(Viaggio v);
	void deleteViaggio(Viaggio v);
	

}
