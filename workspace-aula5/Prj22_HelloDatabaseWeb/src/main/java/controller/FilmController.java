package controller;

import java.io.IOException;
import java.util.ArrayList;

import database.FilmDAOImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Film;

@WebServlet("/film-animazione")
public class FilmController extends HttpServlet {

	private FilmDAOImpl dao = new FilmDAOImpl();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		ArrayList<Film> films = dao.getFilms(); //ALT+SHIFT+L
		
		request.setAttribute("elenco", films);
		request.getRequestDispatcher("anime.jsp").forward(request, response);		
//		response.getWriter().print(films.toString());
//		response.getWriter().print("Intervallo");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("titolo")!= null) {
			String titolo = request.getParameter("titolo");
			int anno = Integer.parseInt(request.getParameter("anno"));
			double rating = Double.parseDouble(request.getParameter("rating"));
			
			Film f = new Film();
			f.setTitolo(titolo);
			f.setAnno(anno);
			f.setRating(rating);
			
			dao.addFilm(f);
		}
		
		doGet(request, response);
		
	}
	
	
	
	
	
}
