package repos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
import java.util.TreeMap;

import entities.Game;
import entities.Genere;

public class GameDAOImpl implements GameDAO {

	private Connessione conn;
	private Statement statement;
	private ResultSet rs;
	
	public GameDAOImpl() {
		this.conn = new Connessione();
	}
	
	@Override
	public Map<Integer, Game> findAll() {
		Map<Integer, Game> games = new TreeMap<Integer, Game>();
		try {
			this.statement = this.conn.getConn().createStatement();
			this.rs = this.statement.executeQuery(GET_ALL);
			
			while(this.rs.next()) {
				int id = rs.getInt("id");
				String title = rs.getString("title");
				String genreString = rs.getString("genre");
				String publisher = rs.getString("publisher");
				String originalPlatform = rs.getString("original_platform");
				int year = rs.getInt("year");
				
				Game g = new Game();
				g.setId(id);
				g.setTitle(title);
				g.setGenre(null);
				g.setPublisher(publisher);
				g.setOriginalPlatform(originalPlatform);
				g.setYear(year);
				
				games.put(id, g);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return games;
	}

}
