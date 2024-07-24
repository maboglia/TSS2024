package com.maboglia.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maboglia.entities.Pokemon;

public interface PokemonDAO extends JpaRepository<Pokemon, Integer> {

}
