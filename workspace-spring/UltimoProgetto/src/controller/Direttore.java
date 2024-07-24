package controller;

import java.util.LinkedList;
import java.util.List;

import model.*;
import view.StrumentoVista;

public class Direttore {

	private List<Suonante> orchestra = new LinkedList<>();
	private StrumentoVista vista;
	
	public Direttore() {
		System.out.println("Direttore costruito");
	}
	
	{
		System.out.println("Inizializzo l'orchestra");
		
//		Strumento s1 = new Strumento("Basso");
//		Strumento s2 = new Strumento("Chitarra");
//		Strumento s3 = new Strumento("Batteria");
//		Strumento s4 = new Strumento("Tastiera");
		
		Suonante pringles = () ->"fruff ratac pril prill frrr";
		
		orchestra.addAll(List.of(
				new Basso(), 
				new Chitarra(), 
				new Batteria(), 
				new Tastiera(), 
				pringles
				));
	}
	
	public String dirige(String pezzoMusicale) {
		
		StringBuilder sb = new StringBuilder();
		
		for (Suonante strumento : orchestra) {
			vista = new StrumentoVista(strumento);
			
			//System.out.println(strumento.getNome() + " suona");
			
			sb.append(vista.getCard());
		}
		
		return sb.toString();
		
	}
	
	
}
