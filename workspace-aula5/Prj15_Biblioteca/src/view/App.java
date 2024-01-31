package view;

import java.io.File;
import java.util.ArrayList;

import controller.Libreria;
import model.Libro;
import util.LeggiScriviFile;

public class App {

	public static void main(String[] args) {

		Libreria libRagazzi = new Libreria("libri per ragazzi");
		
		File sorgente = new File("\\\\fs-aule\\2023\\B22-104-2024\\biblioteca2.csv"); 
		File destinazione = new File("\\\\fs-aule\\2023\\B22-104-2024\\biblioteca.html"); 
		
		ArrayList<String>  lettura = LeggiScriviFile.leggi(sorgente);

		System.out.println(lettura.size());
		
		for (String riga : lettura) {
			//System.out.println(riga);
			
			String[] parole = riga.split(";");
			
			String autore = (parole.length>0) ? parole[0] : "AAVV";
			String titolo = (parole.length>1) ? parole[1] : "Titolo mancante";
			Libro temp = new Libro(titolo, autore);
			libRagazzi.addLibro(temp);
		}
		
		//System.out.println(libRagazzi);
		
		LeggiScriviFile.scrivi(destinazione, libRagazzi.toString()); 
		System.out.println("Programma eseguito");
	}

}
