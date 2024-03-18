package com.maboglia.services;

import java.util.List;

import com.maboglia.entities.Provincia;

public interface ProvinciaService {

	List<Provincia> getAll();
	Provincia getById(int id);
	
	List<Provincia> getProvByRegione(String nomeRegione);
	List<String> getRegioni();
}
