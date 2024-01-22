package view;

import java.util.ArrayList;

import model.Canzone;

public class Htmlizzatore {
	
	public static String getHeader() {
		String output = "";
		output += "<html>\n";
		output += "<head>\n";
		output += "<title>Titolo Pagina</title>\n";
		output += "</head>\n";
		output += "<body>\n";
		
		return output;
	}
	public static String getFooter() {
		String output = "";
		output += "</body>\n";
		output += "</html>\n";
		
		return output;
	}
	
	public static String getUL(ArrayList<Canzone> canzoni) {
		String output = "";
		
		output += "<ul>\n";
		for (Canzone canzone : canzoni) {
			output += "<li><a target='_blank' href='https://www.google.com/search?q="+canzone.titolo+"+"+canzone.cantante+"'>"+canzone.titolo+"</a></li>\n";
		}
		output += "</ul>\n";
		
		return output;
	}
	
	
}
