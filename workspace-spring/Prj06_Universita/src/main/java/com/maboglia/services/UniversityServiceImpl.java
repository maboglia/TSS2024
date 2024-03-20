package com.maboglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maboglia.entities.Corso;
import com.maboglia.entities.Studente;
import com.maboglia.repos.CorsoDAO;
import com.maboglia.repos.StudenteDAO;

@Service 
public class UniversityServiceImpl implements UniversityService {

	@Autowired
	private StudenteDAO daoStudenti;
	
	@Autowired
	private CorsoDAO daoCorsi;
	
	@Override
	public Corso addCorso(Corso c) {
		return daoCorsi.save(c);
	}

	@Override
	public Studente addStudente(Studente s) {
		return daoStudenti.save(s);
	}

	@Override
	public List<Corso> getCorsi() {
		return daoCorsi.findAll();
	}

	@Override
	public List<Studente> getStudentes() {
		return daoStudenti.findAll();
	}

}
