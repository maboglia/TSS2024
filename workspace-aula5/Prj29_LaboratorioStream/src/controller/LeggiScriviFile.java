package controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import model.Provincia;
import model.Regione;

public class LeggiScriviFile {

	public static List<Provincia> leggi(String nomeFile) throws IOException {
		
		List<Provincia> province = new ArrayList<>();
		
		Stream<String> lines = Files.lines(Paths.get(nomeFile)); 
		List<String> list = lines.toList();
		
		for (String riga : list) {
			String[] split = riga.split(";");
			
			int id = Integer.parseInt(split[0]);
			Regione regione = new Regione(split[1], 0, null);
			String nome = split[2];
			int maschi = Integer.parseInt(split[3]);
			int femmine = Integer.parseInt(split[4]);
			int totale = Integer.parseInt(split[5]);
			
			Provincia p = new Provincia(id, regione, nome, maschi, femmine, totale);
			province.add(p);
			
		}
		return province;
		
	}
	
	
	
}
