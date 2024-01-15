package controller;

public class Todo {

	public String descrizione;
	public boolean completo;
	
	public Todo(String desc) {
		descrizione = desc;
		completo = false;
		System.out.println("Creato un nuovo oggetto di tipo Todo");
	}
	
	public void completa() {
		completo=true;
	}
	
	public String stampa() {
		return "-------------------------------"
				+ "\nDescrizione: " + descrizione
				+ "\nCompleto: " + completo
				+ "\n--------------------------";
	}			
}
