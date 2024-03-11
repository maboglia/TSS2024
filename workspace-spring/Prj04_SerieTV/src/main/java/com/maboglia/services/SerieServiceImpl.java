package com.maboglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maboglia.entities.SerieTV;
import com.maboglia.repos.SerieDAO;

@Service
public class SerieServiceImpl implements SerieService{

	@Autowired
	SerieDAO dao;

	@Override
	public SerieTV addSerie(SerieTV s) {
		return dao.save(s);
	}

	@Override
	public List<SerieTV> getSerie() {
		return dao.findAll();
	}

	@Override
	public List<SerieTV> getSerieByGenere(String genere) {
		return null;
	}

	@Override
	public SerieTV getSerieById(int id) {
		if (dao.findById(id).isPresent())
			return dao.findById(id).get();
		else 
			return null;
	}

	@Override
	public SerieTV updateSerie(SerieTV s) {
		return dao.save(s);
	}

	@Override
	public void deleteSerie(SerieTV s) {

		dao.deleteById(s.getId());
		
	}

	@Override
	public void deleteSerie(int id) {
		dao.deleteById(id);
	}
	
}
