package controller;

import java.io.IOException;

import org.json.JSONArray;

import database.FilmDAOImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/api/all")
public class FilmREST extends HttpServlet {
	FilmDAOImpl dao = new FilmDAOImpl();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println(dao.getFilm());
		
//		request.setAttribute("elenco", dao.getFilm());
//		request.getRequestDispatcher("index.jsp").forward(request, response);
		JSONArray arrayFilm;
		if (request.getParameter("dal")!=null && request.getParameter("al")!=null  ) {
			
			int dal = Integer.parseInt(request.getParameter("dal"));
			int al = Integer.parseInt(request.getParameter("al"));			
			
			 arrayFilm = new JSONArray(dao.getFilmByYears(dal, al));
			
			
		} else {
			 arrayFilm = new JSONArray(dao.getFilm());
		}
		
		
		
		response.setContentType("application/json");
		response.getWriter().print(arrayFilm.toString());
	
	
	}
	
	
	

}
