package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONTokener;

import model.Film;

public class FilmDAOImpl implements FilmDAO {
	
	private Connessione miaConn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public FilmDAOImpl() {
		this.miaConn = new Connessione();
	}
	
	
	
	

	@Override
	public List<Film> getFilm() {
		
		List<Film> film = new ArrayList<Film>();
		try {
			this.ps = miaConn.getConn().prepareStatement(GET_ALL);
			this.rs = this.ps.executeQuery();
			while(this.rs.next()) {
				Film f = new Film();
				f.setId(rs.getInt("id"));
				f.setAnno(rs.getInt("year"));
				f.setTitolo(rs.getString("title"));
				f.setRating(rs.getFloat("rating"));
				film.add(f);
			
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return film;
	}

	@Override
	public Film getFilmById(int id) {
		// TODO Auto-generated method stub
		return null;
	}





	public List<Film> getFilmByYears(int dal, int al) {
		
		return getFilm()
				.stream()
				.filter(f -> f.getAnno()>=dal && f.getAnno()<=al)
				.sorted()
				.toList();
	}

	public void addFilm(String titolo, int anno, double rating) {
		try {
			ps = this.miaConn.getConn().prepareStatement("INSERT INTO imdb_top_top250 (title, year, rating) values (?,?,?)");
			ps.setString(1, titolo);
			ps.setInt(2, anno);
			ps.setDouble(3, rating);
			ps.execute();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
