package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {
	
	private final String HOST = "jdbc:mysql://localhost:3306/java";
	private final String USER = "app_tss";
	private final String PASSWORD = "tss_2024!";
	
	private Connection conn;
	
	private void connetti() {
		try {
			this.conn = DriverManager.getConnection(HOST, USER, PASSWORD);
			System.out.println("Siamo connessi");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
	}
	
	public Connection getConn() {
		
		if(conn == null) 
			connetti();
		
		return conn;
	}

}
