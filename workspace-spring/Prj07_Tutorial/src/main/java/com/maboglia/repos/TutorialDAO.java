package com.maboglia.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maboglia.entities.Tutorial;

public interface TutorialDAO extends JpaRepository<Tutorial, Integer> {

}
