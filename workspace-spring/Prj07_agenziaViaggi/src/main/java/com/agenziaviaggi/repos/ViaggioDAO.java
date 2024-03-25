package com.agenziaviaggi.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agenziaviaggi.entities.Viaggio;

public interface ViaggioDAO extends JpaRepository<Viaggio, Integer> {

}
