package com.maboglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maboglia.entities.Pokemon;
import com.maboglia.entities.PokemonPic;
import com.maboglia.repos.PokemonDAO;
import com.maboglia.repos.PokemonPicDAO;

@Service
public class PokemonServiceImpl implements PokemonService {

	@Autowired
	private PokemonDAO dao;
	
	@Autowired
	private PokemonPicDAO picDAO;
	
	@Override
	public List<Pokemon> getAllPokemon() {
		
		return dao.findAll();
	}

	@Override
	public List<PokemonPic> getPics() {
		
		return picDAO.findAll();
	}

	@Override
	public PokemonPic getPicByNome(String nome) {
		return picDAO.findByNome(nome);
	}

}
