package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Film;

public class FilmDAOImpl implements FilmDAO {
	
	private Connessione connessione;
//	private Statement statement;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public FilmDAOImpl() {
		this.connessione = new Connessione();
		this.connessione.connetti();
	}
	
	
	@Override
	public void addFilm(Film f) {
		
		try {
//			Preparo la query parametrica
			this.ps = this.connessione.getConn().prepareStatement(ADD);
//			binding parameters
			this.ps.setString(1, f.getTitolo());
			this.ps.setInt(2, f.getAnno());
			this.ps.setDouble(3, f.getRating());
			
			this.ps.execute();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateFilm(Film f) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteFilm(Film f) {
		// TODO Auto-generated method stub

	}

	@Override
	public Film getFilmById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Film> getFilms() {
		ArrayList<Film> filmDaRitornare = new ArrayList<Film>();
		try {
			this.ps = this.connessione.getConn().prepareStatement(GET_ALL);
			this.rs = this.ps.executeQuery();
			
			while (this.rs.next()) {
				Film f = new Film();
				f.setTitolo(rs.getString("titolo"));
				f.setAnno(rs.getInt("anno"));
				f.setId(rs.getInt("id"));
				f.setRating(rs.getDouble("rating"));
				
				filmDaRitornare.add(f);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return filmDaRitornare;
	}

	@Override
	public ArrayList<Film> getFilmsByAnno(int anno) {
		ArrayList<Film> filmDaRitornare = new ArrayList<Film>();
		try {
			this.ps = this.connessione.getConn().prepareStatement(GET_BY_YEAR);
			this.ps.setInt(1, anno);
			this.rs = this.ps.executeQuery();
			
			while (this.rs.next()) {
				Film f = new Film();
				f.setTitolo(rs.getString("titolo"));
				f.setAnno(rs.getInt("anno"));
				f.setId(rs.getInt("id"));
				f.setRating(rs.getDouble("rating"));
				
				filmDaRitornare.add(f);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return filmDaRitornare;
	}

}
