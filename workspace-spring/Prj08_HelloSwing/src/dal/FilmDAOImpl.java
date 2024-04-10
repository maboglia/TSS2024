package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.Connessione;
import model.Film;

public class FilmDAOImpl implements FilmDAO {
	
//	private Connessione miaConn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	
	

	@Override
	public Film addFilm(Film f) throws SQLException {

		this.ps = Connessione.getConn().prepareStatement(ADD);
		this.ps.setString(1, f.getTitolo());
		this.ps.setInt(2, f.getAnno());
		this.ps.setDouble(3, f.getRating());
		boolean execute = this.ps.execute();
		System.out.println("Film aggiunto: " + execute);
		return null;
	}

	@Override
	public List<Film> findAll() throws SQLException {

		List<Film> film = new ArrayList<Film>();

		this.ps = Connessione.getConn().prepareStatement(FIND_ALL);
		this.rs = this.ps.executeQuery();
		
		while(this.rs.next()) {
			Film f = new Film();
			f.setId(rs.getInt("id"));
			f.setTitolo(rs.getString("titolo"));
			f.setAnno(rs.getInt("anno"));
			f.setRating(rs.getDouble("rating"));
			film.add(f);
		}
		
		return film;
	}

	@Override
	public Film findById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Film updateFilm(Film f) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(int id) throws SQLException {
		// TODO Auto-generated method stub

	}

}
