package com.agenziaviaggi.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agenziaviaggi.entities.Cliente;

public interface ClienteDAO extends JpaRepository<Cliente, Integer> {

}
