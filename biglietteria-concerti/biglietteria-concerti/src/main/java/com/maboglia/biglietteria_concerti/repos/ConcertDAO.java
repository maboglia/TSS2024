package com.maboglia.biglietteria_concerti.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maboglia.biglietteria_concerti.entities.Concert;

@Repository
public interface ConcertDAO extends JpaRepository<Concert, Long> {
}
