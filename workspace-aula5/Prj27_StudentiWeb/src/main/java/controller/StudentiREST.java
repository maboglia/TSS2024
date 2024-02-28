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

import org.json.JSONArray;

import database.Connessione;
import database.StudenteDAO;
import database.StudenteDAOImpl;

/**
 * Servlet implementation class StudentiCtrl
 */
@WebServlet("/api")
public class StudentiREST extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private StudenteDAOImpl dao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentiREST() {
        this.dao = new StudenteDAOImpl();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			
			List<Studente> all = this.dao.findAll();
			
			JSONArray array = new JSONArray(all);

			response.setContentType("application/json");
			response.getWriter().print(array.toString());
			
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
