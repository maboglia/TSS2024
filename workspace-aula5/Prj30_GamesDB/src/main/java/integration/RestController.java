package integration;

import java.io.IOException;

import org.json.JSONArray;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import services.GameService;

@WebServlet("/api/games")
public class RestController extends HttpServlet {

	private GameService service;
	
	public RestController() {
		this.service = new GameService();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		JSONArray gamesJSON = new JSONArray(this.service.getGames().values());
		resp.setContentType("application/json");
		resp.getWriter().print(gamesJSON.toString());
		//resp.getWriter().print(this.service.getGameById(1).toString());
		
	}
	
}
