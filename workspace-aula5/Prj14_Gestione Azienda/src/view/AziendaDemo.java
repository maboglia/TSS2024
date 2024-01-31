package view;

import controller.LibroMatricola;
import model.Dipendente;
import model.Fattorino;
import model.Impiegato;
import model.Magazziniere;

public class AziendaDemo {

	public static void main(String[] args) {
		
		LibroMatricola libro1 = new LibroMatricola("apple");
		LibroMatricola libro2 = new LibroMatricola("samsung");
		
		libro1.addDipendente("giuseppe", "verdi", "Impiegato");
		libro1.addDipendente("giuseppe", "garibaldi", "Fattorino");
		libro1.addDipendente("giuseppe", "mazzini", "Magazziniere");
		
		System.out.println(libro1.getNomeAzienda());
		System.out.println("Dipendenti");
		
		for(Dipendente d : libro1.getDipendenti()) {
			
			System.out.println(d);
			
		}
		
		
		
		System.out.println(libro2.getNomeAzienda());
		
		
//		Dipendente d = new Dipendente("giuseppe", "verdi");
//		
//		Fattorino f = new Fattorino("giuseppe", "garibaldi");
//		f.setNumeroConsegne(10);
//		f.calcolaStipendio();
//		
//		Impiegato i = new Impiegato("giuseppe", "mazzini");
//		
//		Magazziniere m = new Magazziniere("giuseppe", "zio");
//		
//		System.out.println(d);
//		System.out.println(f);
//		System.out.println(i);
//		System.out.println(m);

	}

}
