package com.maboglia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maboglia.entities.Domanda;
import com.maboglia.entities.Persona;
import com.maboglia.entities.Test;
import com.maboglia.repos.DomandaDAO;
import com.maboglia.repos.PersonaDAO;
import com.maboglia.repos.TestDAO;

@Service
public class QuizServiceImpl implements QuizService {

	@Autowired
	private TestDAO testDAO;
	@Autowired
	private DomandaDAO domandaDAO;
	@Autowired
	private PersonaDAO personaDAO;

	
	@Override
	public Test addTest(Test t) {
		return testDAO.save(t);

	}

	@Override
	public Persona addPersona(Persona p) {
		return personaDAO.save(p);
	}

	@Override
	public Domanda addDomanda(Domanda d) {
		return domandaDAO.save(d);
	}

	@Override
	public List<Test> getTest() {
		return testDAO.findAll();
	}

	@Override
	public List<Persona> getPersone() {
		return personaDAO.findAll();
	}

	@Override
	public List<Domanda> getDomande() {
		return domandaDAO.findAll();
	}

}
