package vista;

import controllo.RegistroController;
import modello.Registro;
import modello.Studente;

public class RegistroDemo {

	public static void main(String[] args) {

		Registro tss2024 = new Registro("Corso TSS 2024");
		RegistroController ctrl = new RegistroController(tss2024); 
		ctrl.caricaStudentiDaFile();
		ctrl.faiAppello();
		ctrl.stampaPresenti();
		ctrl.stampaAssenti();
		
		//Studente s1 = new Studente("giulia", "artuso");
		//Studente s2 = new Studente("leonardo", "castaldo");

//		tss2024.aggiungiStudente(new Studente("giulia", "artuso"));
//		tss2024.aggiungiStudente(new Studente("leonardo", "castaldo"));
		
//		tss2024.getStudenteById(0);
//		
//		for(Studente s : tss2024.getAllStudents()) {
//			System.out.println(s);
//		}

		
		
	}

}
