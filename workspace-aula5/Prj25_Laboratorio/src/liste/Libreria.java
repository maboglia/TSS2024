package liste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import model.Libro;

public class Libreria {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(new File("files/libri.csv")); 
		List<Libro> listaLibri = new ArrayList<Libro>(); 
		
		String[] generi = {
				"romanzo",
				"giallo",
				"rosa",
				"verde"
		};
		Arrays.sort(generi);
		List<String> generiList = Arrays.asList(generi);
		
		while (sc.hasNextLine()) {
			
			String rigaCorrente = sc.nextLine();
			String[] parole = rigaCorrente.split(",");
			
			int id = Integer.parseInt(parole[0]);
			String titolo = parole[1];
			double prezzo = Double.parseDouble(parole[2]);
			
			Libro l = new Libro(id, titolo, prezzo);
			listaLibri.add(l);
			//setLibri.add(l);
		}
		Set<Libro>  setLibri = new TreeSet<Libro>(listaLibri);
		
		List<Libro> tra10e20euro = listaLibri
			.stream()
			.filter(libro -> libro.getTitolo().startsWith("Il"))
			.filter(libro -> libro.getPrezzo() > 10)
			.filter(libro -> libro.getPrezzo() < 20)
			.toList();
		

	}

}
