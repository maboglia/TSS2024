package test;

import java.sql.SQLException;
import java.util.List;

import database.StudenteDAOImpl;
import model.Studente;

public class StudentiDemo {

	public static void main(String[] args) {

		
		StudenteDAOImpl dao = new StudenteDAOImpl();
		
		try {
			List<Studente> all = dao.findAll();
			
			//all.forEach(System.out::println);
			all.forEach(s -> System.out.println(s.getCognome()));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
