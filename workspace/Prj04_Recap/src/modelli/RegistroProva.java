package modelli;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RegistroProva {

	public static void main(String[] args) throws FileNotFoundException {

		Registro reg1 = new Registro();
		 
		Scanner sc = new Scanner(new File("studenti.txt"));
		int posizione = 0;
		while(sc.hasNextLine()) {
			String riga = sc.nextLine();
			String[] parole = riga.split(",");
			
			String nome = parole[0];
			String cognome = parole[1];
			int annoNascita = Integer.parseInt(parole[2]);
			
			Studente temp = new Studente(nome, cognome, annoNascita);
			reg1.aggiungiStudente(temp, posizione++);
		}
		
//		Studente s1 = new Studente("Giulia", "Artuso", 1994);
//		Studente s2 = new Studente("Gabriele", "Grandis", 2005);
		
//		s1.nome = "pippo";
//		s2.nome = "paperino";
		
		reg1.nomeCorso = "Corso A";
//		reg1.aggiungiStudente(s1, 0);
//		reg1.aggiungiStudente(s2, 1);
		
		reg1.faiAppello();

	}

}
