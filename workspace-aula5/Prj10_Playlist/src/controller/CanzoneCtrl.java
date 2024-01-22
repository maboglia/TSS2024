package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import model.Canzone;

public class CanzoneCtrl {
	
	//public Canzone[] canzoni;
	//ArrayList
	public ArrayList<Canzone> canzoni;
	
	public CanzoneCtrl() {
		
		this.canzoni = new ArrayList<Canzone>();
		//System.out.println("Costruito il controller");
	}
	
	public void caricaCanzoniDaDB() {
		String[] database = {"Karaoke;Boomdabash & Alessandra Amoroso",
							"Mediterranea;Irama",
							"Good times;Ghali",
							"A un passo dalla luna;Rocco Hunt & Ana Mena",
							"Blinding lights;The Weeknd",
							"Superclassico;Ernia",
							"Hypnotized;Purple Disco Machine & Sophie and the Giants",
							"Dance monkey;Tones and I",
							"Fai rumore;Diodato",
							"blun7 a swishland;tha Supreme"};
		
		for (String song : database) {
			String[] insieme = song.split(";");
			String titolo = insieme[0];
			String cantante = insieme[1];
			Canzone c = new Canzone(titolo, cantante);
			canzoni.add(c);
		}
	}
	
	public void caricaCanzoniDaFile() {
		File f = new File("canzoni2020.csv");
		try {
			
			Scanner scanner = new Scanner(f);
			
			while(scanner.hasNextLine()) {
				String riga = scanner.nextLine();
				String[] rigaSpezzata = riga.split(",");
				String titolo = rigaSpezzata[0];
				String cantante = rigaSpezzata[1];
				Canzone c = new Canzone(titolo, cantante);
				this.canzoni.add(c);
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	
	
}
