package orchestra;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import controller.Direttore;

public class Palcoscenico {

	public static void main(String[] args) throws FileNotFoundException {

		Direttore direttore = new Direttore();
		
		String pezzoMusicale = direttore.dirige("La traviata rock");
		
		File f = new File("pezzo_suonato.html");
		PrintWriter pw = new PrintWriter(f);
		pw.println(pezzoMusicale);
		pw.close();

	}

}
