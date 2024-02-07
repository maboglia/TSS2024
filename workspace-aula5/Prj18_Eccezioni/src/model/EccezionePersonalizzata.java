package model;

public class EccezionePersonalizzata extends Exception {

	public EccezionePersonalizzata(String messaggio) {
		super("Questa è la mia eccezione personalizzata");
		System.out.println(messaggio);
	}
	
}
