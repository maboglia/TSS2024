package controller;

import model.Canzone;

public class CanzoneCtrl {

	public Canzone[] canzoni;
	
	public CanzoneCtrl() {

		this.canzoni = new Canzone[10];
		System.out.println("costruito il ctrl");
	}
	
	public void caricaCanzoniDaDB() {
		
		String[] database = {
				"Karaoke;Boomdabash & Alessandra Amoroso",
				"Mediterranea;Irama",
				"Good times;Ghali",
				"A un passo dalla luna;Rocco Hunt & Ana Mena",
				"Blinding lights;The Weeknd",
				"Superclassico;Ernia",
				"Hypnotized;Purple Disco Machine & Sophie and the Giants",
				"Dance monkey;Tones and I",
				"Fai rumore;Diodato",
				"blun7 a swishland;tha Supreme",	
		};
		int pos = 0;
		for (String song : database) {
			String[] insieme = song.split(";");
			String titolo = insieme[0];
			String cantante = insieme[1];
			Canzone c = new Canzone(titolo, cantante);
			canzoni[pos++] = c;
		}
		
		
		
	}
}
