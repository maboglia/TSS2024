package modelli;

public class RegistroProva {

	public static void main(String[] args) {

		Registro reg1 = new Registro();
		
		Studente s1 = new Studente("Giulia", "Artuso", 1994);
		Studente s2 = new Studente("Gabriele", "Grandis", 2005);
		
//		s1.nome = "pippo";
//		s2.nome = "paperino";
		
		reg1.nomeCorso = "Corso A";
		reg1.aggiungiStudente(s1, 0);
		reg1.aggiungiStudente(s2, 1);
		
		reg1.faiAppello();

	}

}
