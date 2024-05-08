package networking;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Arrays;
import java.util.Date;
import java.util.function.Predicate;

import com.google.gson.Gson;

class Serie{
	String titolo;
	String anno;
	String rating;
	String regista;
	public Serie(String titolo, String anno, String rating, String regista) {
		super();
		this.titolo = titolo;
		this.anno = anno;
		this.rating = rating;
		this.regista = regista;
	}
	
	public Serie() {
		// TODO Auto-generated constructor stub
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAnno() {
		return anno;
	}

	public void setAnno(String anno) {
		this.anno = anno;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getRegista() {
		return regista;
	}

	public void setRegista(String regista) {
		this.regista = regista;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Serie [titolo=");
		builder.append(titolo);
		builder.append(", anno=");
		builder.append(anno);
		builder.append(", rating=");
		builder.append(rating);
		builder.append(", regista=");
		builder.append(regista);
		builder.append("]");
		return builder.toString();
	}
	
	
}

public class LeggiJSON {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		doGetRequestAndDeserialize();
	}

	// Metodo per eseguire una richiesta GET e deserializzare la risposta in un oggetto Java
    @SuppressWarnings("deprecation")
	public static void doGetRequestAndDeserialize() throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://raw.githubusercontent.com/maboglia/ProgrammingResources/master/tabelle/film/100-best-netflix-series.json"))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Deserializzare la risposta JSON in un oggetto Java
        Gson gson = new Gson();
        Serie[] users = gson.fromJson(response.body(), Serie[].class);

        // Stampare il risultato
        System.out.println("GET Response deserializzato:");
//        for (var user : users) {
//            System.out.println(user);
//        }
        
        class OggettoCheSiaspetta implements Predicate<String>{

			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				return t.contains("rating=100");
			}
        	
        }
        Date data = new Date();
        data.getDate();
        
        OggettoCheSiaspetta ocsa = new OggettoCheSiaspetta();
        
        Arrays.asList(users).stream()
        .map(o -> o.toString())
        .filter(t->t.contains("rating=100"))
        .filter(t->t.contains("anno=(2020)"))
        .forEach(System.out::println);
        
        
    }
	
}
