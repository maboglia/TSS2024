package com.maboglia.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maboglia.entities.Libro;

@Repository
public interface LibroDAO extends JpaRepository<Libro, Integer> {

}
