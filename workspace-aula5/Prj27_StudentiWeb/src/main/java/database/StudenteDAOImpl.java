package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Studente;

public class StudenteDAOImpl implements StudenteDAO {

	private Connessione miaConn = new Connessione();
	private Statement stat;
	private ResultSet rs;
	
	private List<Studente> tuttiGliStudenti = new ArrayList<>();
	private Map<Integer, Studente> mappaStudenti = new HashMap<>();
	
	@Override
	public List<Studente> findAll() throws SQLException {

		this.stat = miaConn.getConn().createStatement();
		this.rs = this.stat.executeQuery(GET_ALL);
		tuttiGliStudenti.clear();
		while (this.rs.next()) {
			Studente s = new Studente();
			s.setId(this.rs.getInt("id"));
			s.setNome(this.rs.getString("nome"));
			s.setCognome(this.rs.getString("cognome"));
			s.setDataNascita(this.rs.getDate("data_nascita").toLocalDate());
			tuttiGliStudenti.add(s);
			mappaStudenti.put(s.getId(), s);
		}
		
		return tuttiGliStudenti;
	}

	@Override
	public Studente findStudenteById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
