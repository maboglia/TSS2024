package service;

import java.sql.SQLException;
import java.util.List;

import dal.FilmDAO;
import dal.FilmDAOImpl;
import model.Film;

public class FilmServiceImpl implements FilmService {

	private FilmDAO dao;
	
	public FilmServiceImpl() {
		this.dao = new FilmDAOImpl();
	}
	
	@Override
	public Film addFilm(Film f) {
		try {
			return dao.addFilm(f);
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		return null;
	}

	@Override
	public List<Film> findAll() {
		try {
			return dao.findAll();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		return null;
	}

}
