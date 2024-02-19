package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Pokemon;

public class PokemonDAOImp implements PokemonDAO {

	private Connessione miaConnessione =new Connessione();
	private PreparedStatement ps;
	private ResultSet rs;
	
	@Override
	public void addPokemon(Pokemon p) {
		try {
			this.ps=miaConnessione.getConn().prepareStatement(AGGIUNGI);
			this.ps.setString(1, p.getNome());
			this.ps.setString(2, p.getTipo());
			this.ps.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Pokemon> getPokemonsByType(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pokemon getPokemonByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
