package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {

	private final String DB_NAME = "java";
	private final String HOST = "jdbc:mysql://localhost:3306/"+DB_NAME ;
	private final String USER = "app_tss";
	private final String PASS = "tss_2024!";
	
	private Connection conn = null;
	
	public Connection getConn() {
		
		if (conn==null)
			connetti();
		
		return conn;
	}
	
	public void connetti() {
		
		try {
			this.conn = DriverManager.getConnection(HOST, USER, PASS);
			System.out.println("siamo connessi!!!!");
			
		} catch (SQLException e) {
			System.err.println("ERRORE NELLE CONNESSIONE AL DATABASE!!!");
			System.err.println(e.getMessage());
		}
		
		
	}
	
	
}
