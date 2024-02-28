package controller;

import java.io.IOException;

import database.FilmDAOImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/all")
public class FilmMVC extends HttpServlet {
	FilmDAOImpl dao = new FilmDAOImpl();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(dao.getFilm());
		request.setAttribute("elenco", dao.getFilm());
		request.getRequestDispatcher("index.jsp").forward(request, response);
	
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if(request.getParameter("titolo")!=null) {
			
			String titolo = request.getParameter("titolo");
			int anno = Integer.parseInt(request.getParameter("anno"));
			double rating = Double.parseDouble(request.getParameter("rating"));
			
			dao.addFilm(titolo, anno, rating);
			
		}
		doGet(request, response);
		
	}
	
	
	

}
