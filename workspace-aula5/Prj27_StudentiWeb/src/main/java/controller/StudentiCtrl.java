package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Studente;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import database.Connessione;
import database.StudenteDAO;
import database.StudenteDAOImpl;

/**
 * Servlet implementation class StudentiCtrl
 */
@WebServlet("/")
public class StudentiCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private StudenteDAOImpl dao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentiCtrl() {
        this.dao = new StudenteDAOImpl();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			
			List<Studente> all = this.dao.findAll();
			
			request.setAttribute("listaStudenti", all);
			
			request.getRequestDispatcher("header.jsp").include(request, response);
			request.getRequestDispatcher("content.jsp").include(request, response);
			request.getRequestDispatcher("footer.jsp").include(request, response);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
