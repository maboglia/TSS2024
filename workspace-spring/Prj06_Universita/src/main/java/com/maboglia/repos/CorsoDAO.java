package com.maboglia.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maboglia.entities.Corso;

public interface CorsoDAO extends JpaRepository<Corso, Integer> {

}
