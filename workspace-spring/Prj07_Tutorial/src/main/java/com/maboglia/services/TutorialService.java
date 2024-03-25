package com.maboglia.services;

import java.util.List;

import com.maboglia.entities.Tutorial;

public interface TutorialService {
    
	List<Tutorial> getTutorials();
	
	Tutorial addTutorial(Tutorial t);
}
