package database;

import java.util.List;

import model.Film;

public interface FilmDAO {
	
	String GET_ALL = "select * from imdb_top_top250";
	String GET_BY_ID = "select * from imdb_top_top250 where id=?";
	
	List<Film> getFilm();
	Film getFilmById(int id);
}
