package com.maboglia.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maboglia.entities.FilmTriste;
import com.maboglia.repos.FilmTristeDAO;

@Service
public class FilmTristeImpl implements FilmService {

	@Autowired 
	private FilmTristeDAO dao;
	
	@Override
	public FilmTriste addFilm(FilmTriste f) {
		// TODO Auto-generated method stub
		return dao.save(f);
	}

}
