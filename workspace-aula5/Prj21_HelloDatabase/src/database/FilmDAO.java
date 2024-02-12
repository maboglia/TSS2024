package database;

import java.util.ArrayList;

import model.Film;

public interface FilmDAO {

	String ADD = "INSERT into film (titolo, anno, rating) values(?,?,?)";
	String DELETE = "delete from film where id = ?";
	String GET_ALL = "select * from film";
	String GET_BY_ID = "select * from film where id = ?";
	String GET_BY_YEAR = "select * from film where anno = ?";
	
	
	void addFilm(Film f);
	void updateFilm(Film f);
	void deleteFilm(Film f);
	
	Film getFilmById(int id);
	ArrayList<Film> getFilms();
	ArrayList<Film> getFilmsByAnno(int anno);
	
}
