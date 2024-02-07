package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import model.EccezionePersonalizzata;

public class ProvaEccezioni2 {

	public static void main(String[] args) {

		File f = new File("studenti.txt");
		
		try(
				Scanner input = new Scanner(f);
				PrintWriter pw = new PrintWriter(f);
				) {//try-with-resources
			
			String[] giorni = {
					"lunedì",
					"martedì",
					"mercoledì",
					"giovedì",
					"venerdì",
					"sabato",
					"domenica",
			};
			
			for (String giorno : giorni) {
				
				if (giorno.equals("giovedì"))
					throw new EccezionePersonalizzata("Giovedì non lavoro!!!!");
				//pw.println(giorno);
			}
			//pw.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Si è verificato un errore nella lettura/scrittura");
		} catch (EccezionePersonalizzata e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		
		System.out.println("game over");
	}

}
