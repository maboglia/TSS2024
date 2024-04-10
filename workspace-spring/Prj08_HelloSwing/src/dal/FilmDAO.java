package dal;

import java.sql.SQLException;
import java.util.List;

import model.Film;

public interface FilmDAO {

	String FIND_ALL = "SELECT * FROM film_tristi";
	String FIND_ONE = "SELECT * FROM film_tristi WHERE id = ?";
	String ADD = "INSERT INTO film_tristi (titolo, anno, rating) VALUE (?,?,?)";
	String UPDATE = "UPDATE film_tristi set titolo=?, anno=?, rating=? WHERE id = ?";
	String DELETE = "DELETE FROM film_tristi WHERE id = ?";
	
	
	Film addFilm(Film f) throws SQLException;
	List<Film> findAll()  throws SQLException;
	Film findById(int id)  throws SQLException;
	Film updateFilm(Film f) throws SQLException;
	void deleteById(int id)  throws SQLException;
	
}
