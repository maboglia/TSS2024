package service;

import java.util.List;

import model.Film;

public interface FilmService {

	Film addFilm(Film f);
	List<Film> findAll();
	
}
