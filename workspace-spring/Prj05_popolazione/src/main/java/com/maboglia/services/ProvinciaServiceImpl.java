package com.maboglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maboglia.entities.Provincia;
import com.maboglia.repos.ProvinciaDAO;

@Service
public class ProvinciaServiceImpl implements ProvinciaService {

	//collegamento al dao
	@Autowired
	private ProvinciaDAO dao;
	
	@Override
	public List<Provincia> getAll() {
		return dao.findAll();
	}

	@Override
	public Provincia getById(int id) {
		return dao.findById(id).get();
	}

	@Override
	public List<Provincia> getProvByRegione(String nomeRegione) {
		// TODO Auto-generated method stub
		return dao.findByRegione(nomeRegione);
	}

	@Override
	public List<String> getRegioni() {
		// TODO Auto-generated method stub
		return dao
				.findAll()
				.stream()
				.map(p -> p.getRegione())
				.distinct()
				.sorted()
				.toList();
	}

}
