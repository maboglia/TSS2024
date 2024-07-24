package com.maboglia.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maboglia.entities.PokemonPic;

public interface PokemonPicDAO extends JpaRepository<PokemonPic, Integer> {

	PokemonPic findByNome(String nome);//derived query
	
}
