package com.maboglia.services;

import java.util.List;

import com.maboglia.entities.Corso;
import com.maboglia.entities.Studente;

public interface UniversityService {

	//create
	Corso addCorso(Corso c);
	Studente addStudente(Studente s);
	
	//read
	List<Corso> getCorsi();
	List<Studente> getStudentes();
	
	
	
}
