package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Pokemon;

public class PokemonDAOImp implements PokemonDAO {

	private Connessione miaConnessione = new Connessione();
	private PreparedStatement ps;
	private ResultSet rs;
	@Override
	public void addPokemon(Pokemon p) {
		try {
			this.ps = miaConnessione.getConn().prepareStatement(AGGIUNGI);
			this.ps.setString(1, p.getNome());
			this.ps.setString(2, p.getTipo());
			this.ps.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void updatePokemon(Pokemon p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePokemon(Pokemon p) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<Pokemon> getPokemons() {
		ArrayList<Pokemon> temp = new ArrayList <Pokemon>();
		try {
			this.ps = miaConnessione.getConn().prepareStatement(GET_ALL);
			
			this.rs = this.ps.executeQuery();
			
			while (this.rs.next()) {
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				String tipo = rs.getString("tipo");
				
				temp.add(new Pokemon(id, nome, tipo));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}

	@Override
	public ArrayList<Pokemon> getPokemonsByType(String type) {
		ArrayList<Pokemon> temp = new ArrayList <Pokemon>();
		try {
			this.ps = miaConnessione.getConn().prepareStatement(GET_BY_TYPE);
			this.ps.setString(1, type);
			this.rs = this.ps.executeQuery();
			
			while (this.rs.next()) {
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				String tipo = rs.getString("tipo");
				
				temp.add(new Pokemon(id, nome, tipo));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}

	
	@Override
	public Pokemon getPokemonByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
