package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {
	private final String URL = "jdbc:mysql://localhost:3306/java";
	private final String USER = "app_tss";
	private final String PASS = "tss_2024!";

	private Connection conn = null;

	private void connetti() {
		try {
			this.conn = DriverManager.getConnection(URL, USER, PASS);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Connection getConn() {
		if (this.conn == null)
			connetti();

		return conn;
	}
	
	public void disconnetti()
	{
		if (this.conn != null)
			try {
				this.conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

	}

}
