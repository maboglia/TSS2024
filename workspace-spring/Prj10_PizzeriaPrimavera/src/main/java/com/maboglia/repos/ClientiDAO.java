package com.maboglia.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maboglia.entities.Cliente;

public interface ClientiDAO extends JpaRepository<Cliente, Integer> {

}
