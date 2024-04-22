package com.maboglia.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maboglia.entities.MioProdotto;

@Repository
public interface MioProdottoDAO extends JpaRepository<MioProdotto, Integer> {

}
