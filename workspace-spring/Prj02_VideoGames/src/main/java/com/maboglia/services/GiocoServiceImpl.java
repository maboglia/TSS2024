package com.maboglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maboglia.entities.Gioco;
import com.maboglia.repos.GiocoDAO;

@Service
public class GiocoServiceImpl implements GiocoService {

	@Autowired
	private GiocoDAO dao;
	
	@Override
	public List<Gioco> getGiochi() {
		
		return dao.findAll();
	}

	@Override
	public void addGioco(Gioco g) {
		dao.save(g);

	}

}
