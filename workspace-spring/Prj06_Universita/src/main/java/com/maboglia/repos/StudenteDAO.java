package com.maboglia.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maboglia.entities.Studente;

public interface StudenteDAO extends JpaRepository<Studente, Integer> {

}
