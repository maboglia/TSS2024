package concorrenza;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class LettoreSitiWeb extends Thread {

	String indirizzo;
	String nomeFile;
	
	public LettoreSitiWeb(String indirizzo, String nomeFile) {
		this.indirizzo = indirizzo;
		this.nomeFile = nomeFile;
	}

	@Override
	public void run() {

		try {
			URL sito = new URL(indirizzo);
			
			sito.openConnection();
			
//			InputStream is = sito.openStream();
//			BufferedInputStream bis = new BufferedInputStream(is);
			
			Scanner input = new Scanner(sito.openStream()); 
			
			File f = new File(nomeFile);
			
			PrintWriter pw = new PrintWriter(f);
			
			while(input.hasNextLine()) {
				pw.println(input.nextLine());
			}
			pw.close();
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		
	}
	
	
	
	
	
}
