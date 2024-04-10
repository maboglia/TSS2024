package com.maboglia.service;

import java.util.List;

import com.maboglia.entities.Domanda;
import com.maboglia.entities.Persona;
import com.maboglia.entities.Test;

public interface QuizService {

	Test addTest(Test t);
	Persona addPersona(Persona p);
	Domanda addDomanda(Domanda d);
	
	List<Test> getTest();
	List<Persona> getPersone();
	List<Domanda> getDomande();
	
}
