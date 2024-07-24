package view;

import model.Strumento;
import model.Suonante;

public class StrumentoVista {

	
	Suonante strumento;

	public StrumentoVista(Suonante strumento) {
		super();
		this.strumento = strumento;
	}
	
	public String getTitolo() {
		
		if (strumento instanceof Strumento)
			return "<h1>" + ((Strumento) strumento).getNome() + "</h1>";
		
		return "<h1>" +"Strumento personalizzato"+ "</h1>";
	
	}
	
	public String getParagrafo() {
		return "<p>" + strumento.suona() + "</p>";
	}
	
	
	
	public String getCard() {
		
		return "<div class='card'>" +  getTitolo() + getParagrafo() + "</div>";
		
	}
	
}
