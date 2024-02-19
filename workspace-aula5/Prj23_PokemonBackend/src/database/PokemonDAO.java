package database;

import java.util.ArrayList;

import model.Pokemon;

public interface PokemonDAO {
	String AGGIUNGI="insert into pokemon(nome,tipo) values(?,?)";
	String GET_ALL="select * from pokemon";
	String GET_ONE="select * from pokemon where id=?"; 
	String GET_BY_TYPE="select * from pokemon where tipo like '%?%'";
	String UPDATE="update pokemon set nome=? , tipo=?";
	String DELETE="delete from pokemon where id=?";
	
	void addPokemon(Pokemon p);
	void updatePokemon(Pokemon p);
	void deletePokemon(Pokemon p);
	
	ArrayList<Pokemon> getPokemons();
	ArrayList<Pokemon> getPokemonsByType(String type);
	Pokemon getPokemonByID(int id);
	
}
