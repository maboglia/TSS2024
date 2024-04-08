package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {

	private final String URL = "jdbc:mysql://localhost:3306/java";
	private final String USER = "app_tss";
	private final String PASS = "tss_2024!";
	
	private static Connection conn = null;
	
	private Connessione() {
		this.connetti();
	}
	
	private void connetti() {
		try {
			conn = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("connessione al db riuscita");
		} catch (SQLException e) {
			System.err.println("connessione non riuscita: " + e.getMessage());
		}
	}
	
	public static Connection getConn() {
		if (conn == null)
			new Connessione();//costruico l'oggetto, si inizializza conn
		
		return conn;
	}
	
	
}
