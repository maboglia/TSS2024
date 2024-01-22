package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

import controller.CanzoneCtrl;
import controller.PlayList;
import model.Canzone;

public class App {

	public static void main(String[] args) {
		
		CanzoneCtrl database = new CanzoneCtrl();
		
		database.caricaCanzoniDaFile();
		
		ArrayList<Canzone> tutteleCanzoni = database.canzoni;
		
		String header = Htmlizzatore.getHeader(); //ALT + SHIFT + L
		String ul = Htmlizzatore.getUL(tutteleCanzoni);
		String footer = Htmlizzatore.getFooter();
		
		System.out.println(header);
		System.out.println(ul);
		System.out.println(footer);
		
		try {
			
			PrintWriter pw = new PrintWriter(new File("canzoni.html"));
			pw.println(header);
			pw.println(ul);
			pw.println(footer);
			pw.close();
			
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
//		for (Canzone canzone : tutteleCanzoni) {
//			System.out.println(canzone.stampa());
//		}
		
//		System.out.println("<ul>");
//		for (Canzone canzone : tutteleCanzoni) {
//			System.out.println("<li>"+canzone.stampainversa()+"</li>");
//		}
//		System.out.println("</ul>");
		
//		PlayList pl1 = new PlayList("rock");
//		PlayList pl2 = new PlayList("pop");
		
		

	}

}
