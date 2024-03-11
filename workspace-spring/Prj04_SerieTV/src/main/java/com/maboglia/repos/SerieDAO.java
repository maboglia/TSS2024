package com.maboglia.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maboglia.entities.SerieTV;

@Repository 
public interface SerieDAO extends JpaRepository<SerieTV, Integer>{

}
