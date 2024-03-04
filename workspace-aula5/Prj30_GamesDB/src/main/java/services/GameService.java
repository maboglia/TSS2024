package services;

import java.util.Collection;
import java.util.Map;

import entities.Game;
import repos.GameDAO;
import repos.GameDAOImpl;

public class GameService {

	private GameDAO dao;
	private Map<Integer, Game> games;
	
	public GameService() {
		this.dao = new GameDAOImpl();
		this.games = this.dao.findAll();
	}
	
	public Map<Integer, Game> getGames() {
		return games;
	}
	
	public Collection<Game> getGamesCollection(){
		return this.games.values();
	}
	
	public Game getGameById(Integer id) {
		return this.games.get(id);
	}
	
	
	
}
