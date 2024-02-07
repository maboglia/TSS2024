package controller;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Libro;

@WebServlet("/libri")
public class Libreria extends HttpServlet {

	private ArrayList<Libro> libri;
	
	public Libreria() {
		System.out.println("Ho creato la servlet libreria");
		this.libri = new ArrayList<Libro>();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
			request.setAttribute("libri", libri);
			request.getRequestDispatcher("libreria.jsp").forward(request, response);
	
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if (request.getParameter("titolo")!=null) {
			
			
			int id= Integer.parseInt(request.getParameter("id"));
			String titolo = request.getParameter("titolo");
			String autore = request.getParameter("autore");
			
			Libro l = new Libro();
			l.setId(id);
			l.setTitolo(titolo);
			System.out.println(l);
			libri.add(l);
		}
		
		doGet(request, response);
		
		//response.getWriter().print("<h1>hai chiamato la pagina libri via post</h1>");
		
	}
	
	
	
	
}
