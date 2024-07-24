package com.maboglia.services;

import java.util.List;

import com.maboglia.entities.Pokemon;
import com.maboglia.entities.PokemonPic;

public interface PokemonService {

	List<Pokemon> getAllPokemon();
	
	List<PokemonPic> getPics();
	PokemonPic getPicByNome(String nome);
	
	
}
