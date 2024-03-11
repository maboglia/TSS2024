

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {

	private final String HOST = "jdbc:mysql://localhost:3306/java";
	private final String USER = "app_tss";
	private final String PASS = "tss_2024!";
	
	private Connection conn = null;
	
	public Connection getConn() {
		if (this.conn == null) {
			this.connetti();
		}
		return conn;
	}
	
	private void connetti() {
		
		try {
			this.conn = DriverManager.getConnection(HOST, USER, PASS);
			System.out.println("Siamo Connessi");
		
		} catch (SQLException e) {
			System.err.println("Si è verificato un errore");
			System.err.println(e.getMessage());
		}
		
	}
	
	private void disconnetti() {
		if (this.conn != null) {
			try {
				this.conn.close();
			} catch (SQLException e) {
				System.err.println("Si è verificato un errore");
				System.err.println(e.getMessage());
			}
		}
	}
	
	
}
