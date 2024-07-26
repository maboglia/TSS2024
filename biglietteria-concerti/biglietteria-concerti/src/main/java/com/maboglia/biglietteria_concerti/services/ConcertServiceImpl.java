package com.maboglia.biglietteria_concerti.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maboglia.biglietteria_concerti.entities.Concert;
import com.maboglia.biglietteria_concerti.repos.ConcertDAO;

@Service
public class ConcertServiceImpl implements ConcertService {

	@Autowired
	private ConcertDAO dao;
	
	
	@Override
	public List<Concert> getAllConcerts() {
		return dao.findAll();
	}

	@Override
	public Concert getConcertById(Long id) {
		return dao.findById(id).orElse(null);
	}

	@Override
	public Concert saveConcert(Concert concert) {
		return dao.save(concert);
	}

	@Override
	public void deleteConcert(Long id) {
		dao.deleteById(id);
	}

}
