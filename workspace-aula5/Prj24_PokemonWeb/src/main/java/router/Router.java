package router;

import java.io.IOException;

import database.PokemonDAO;
import database.PokemonDAOImp;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(value = {"/", "/home", "/indice"})
public class Router extends HttpServlet {

	private PokemonDAO dao;
	
	public Router() {
		System.out.println("Oggetto router costruito");
		this.dao = new PokemonDAOImp();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().print("funge" + this.dao.getPokemons().toString());
		System.out.println("Chiamata via get");
	}
	
	
	
}
