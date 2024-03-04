package repos;

import java.util.Map;

import entities.Game;

public interface GameDAO {

	String GET_ALL = "SELECT * FROM games";
	
	Map<Integer, Game> findAll();
	
}
