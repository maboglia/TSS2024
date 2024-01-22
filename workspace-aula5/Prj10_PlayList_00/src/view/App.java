package view;

import controller.CanzoneCtrl;
import controller.PlayList;
import model.Canzone;

public class App {

	public static void main(String[] args) {
		CanzoneCtrl database = new CanzoneCtrl();
		
		database.caricaCanzoniDaDB();
		
		Canzone[] tuttelecanzoni = database.canzoni;
		
		System.out.println("<ul>");
		for (Canzone canzone : tuttelecanzoni) {
			System.out.println("<li>"+canzone.stampaInversa()+"</li>");
		}
		System.out.println("</ul>");
		
		
		PlayList pl1 = new PlayList("rock");
		PlayList pl2 = new PlayList("pop");
		
		
		
		
	}

}
