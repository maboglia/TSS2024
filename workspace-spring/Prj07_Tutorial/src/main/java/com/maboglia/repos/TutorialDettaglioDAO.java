package com.maboglia.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maboglia.entities.Tutorial;
import com.maboglia.entities.TutorialDetail;

public interface TutorialDettaglioDAO extends JpaRepository<TutorialDetail, Integer> {

}
