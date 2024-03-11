import java.io.File;
import java.io.FileNotFoundException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LeggiFile {

	
	public static void main(String[] args) throws FileNotFoundException, SQLException {

		Connessione connessione = new Connessione();
		PreparedStatement ps;
		
		ps = connessione.getConn().prepareStatement("INSERT into pokemon2 (nome) values (?)");
		Scanner input = new Scanner(new File("files/Pokemon.txt"));
		
		while (input.hasNextLine()) {
			
			String[] split = input.nextLine().split("\\s+");
			if (split.length>1 && split[1].length()>2) {
				Pokemon p = new Pokemon(split[1]);
				System.out.println(p);
				ps.setString(1, p.getNome());
				ps.execute();
			}
			
			
		}

	}

}
