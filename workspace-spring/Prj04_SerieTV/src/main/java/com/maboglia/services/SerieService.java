package com.maboglia.services;

import java.util.List;

import com.maboglia.entities.SerieTV;

public interface SerieService {

	SerieTV addSerie(SerieTV s);

	List<SerieTV> getSerie();
	List<SerieTV> getSerieByGenere(String genere);
	SerieTV getSerieById(int id);
	
	SerieTV updateSerie(SerieTV s);
	void deleteSerie(SerieTV s);
	void deleteSerie(int id);
	
	
}
