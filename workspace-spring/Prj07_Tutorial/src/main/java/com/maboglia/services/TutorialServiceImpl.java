package com.maboglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maboglia.entities.Tutorial;
import com.maboglia.repos.TutorialDAO;
import com.maboglia.repos.TutorialDettaglioDAO;

@Service
public class TutorialServiceImpl implements TutorialService {

	@Autowired
	private TutorialDAO dao; 

	@Autowired
	private TutorialDettaglioDAO daoDett; 
	
	
	@Override
	public List<Tutorial> getTutorials() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Tutorial addTutorial(Tutorial t) {
		// TODO Auto-generated method stub
		return dao.save(t);
	}

}
