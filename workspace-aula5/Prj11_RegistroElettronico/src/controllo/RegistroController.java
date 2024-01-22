package controllo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import modello.Registro;
import modello.Studente;

public class RegistroController {

	private Registro registro;
	private ArrayList<Studente> presenti;
	private ArrayList<Studente> assenti;

	public RegistroController(Registro registro) {
		this.registro = registro;
		this.presenti = new ArrayList<Studente>();
		this.assenti = new ArrayList<Studente>();
	}

	public void caricaStudentiDaFile() {
		
		File fileDiTesto = new File("C:\\Users\\teacher\\Desktop\\studenti.txt");
		
		try {
			Scanner input = new Scanner(fileDiTesto);
			
			while(input.hasNextLine()) {
				String line = input.nextLine();
				String[] parole = line.split(",");
				String nomeStudente = parole[0];
				String cognomeStudente = parole[1];
				Studente s = new Studente(nomeStudente, cognomeStudente);
				this.registro.aggiungiStudente(s);
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	
	public void faiAppello() {
		Scanner input = new Scanner(System.in);
		
		for(Studente s : this.registro.getAllStudents()) {
			System.out.println("E' presente lo studente");
			System.out.println(s);
			String presente = input.nextLine();
			
			if (presente.equals("s")) {
				presenti.add(s);
			} else {
				assenti.add(s);
			}
		}
	}
	
	public void stampaPresenti() {
		for (Studente studente : presenti) {
			System.out.println(studente);
		}
		System.out.println("Sono presenti " + presenti.size() + " studenti");
	}
	
	public void stampaAssenti() {
		for (Studente studente : assenti) {
			System.out.println(studente);
		}
		System.out.println("Sono assenti " + assenti.size() + " studenti");
	}
	
}
