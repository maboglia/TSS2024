package test;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import controller.PokemonController;
import database.PokemonDAO;
import database.PokemonDAOImp;
import model.Pokemon;

public class PokemonTest {
	public static void main(String[] args) {
		try {
			PokemonController ctrl = new PokemonController();
			
			
			ArrayList<Pokemon> pokemons = ctrl.leggiFile();
			
			
			pokemons.forEach(p ->{
				System.out.println(p);
			});
			
			PokemonDAO dao=new PokemonDAOImp(); // da fare
			
			
			ArrayList<Pokemon>pokemonFuoco = new ArrayList<Pokemon>();
			for (Pokemon pokemon : pokemons) {
				if(pokemon.getTipo().contains("Fuoco")) {
					pokemonFuoco.add(pokemon);
				}
			}
			ctrl.scriviFile("files/pokemon-fuoco.txt", pokemonFuoco);
			
			for(Pokemon pokemon: pokemons)
			{
				dao.addPokemon(pokemon);
			}
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
