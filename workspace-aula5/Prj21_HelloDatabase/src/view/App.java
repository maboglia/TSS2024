package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import database.Connessione;
import model.Libro;

public class App {

	public static void main(String[] args) {
		Connessione c = new Connessione();
		Statement busta = null;
		ResultSet rs = null;
		PrintWriter pw = null;
		
		
		c.connetti();

		try {
			busta = c.getConn().createStatement();
			
			rs = busta.executeQuery("select * from libro");
			
			File f = new File("files/libri.txt");
			pw = new PrintWriter(f);
			
			while(rs.next()) {
				System.out.println("record trovato");
				String titolo = rs.getString("titolo");
				int id = rs.getInt("id");
				int pagine = rs.getInt("pagine");
				int idEditore = rs.getInt("id_editore");
				double prezzo = rs.getDouble("prezzo");
				
				Libro l = new Libro();
				l.setId(id);
				l.setTitolo(titolo);
				l.setPrezzo(prezzo);
				l.setPagine(pagine);
				l.setIdEditore(idEditore);
				
				
				System.out.println(titolo);
				pw.println(l);
			}
			
			pw.close();
			System.out.println("file scritto correttamente");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
