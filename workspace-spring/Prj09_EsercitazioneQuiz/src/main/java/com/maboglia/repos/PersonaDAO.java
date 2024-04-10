package com.maboglia.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maboglia.entities.Persona;

public interface PersonaDAO extends JpaRepository<Persona, Integer> {

}
