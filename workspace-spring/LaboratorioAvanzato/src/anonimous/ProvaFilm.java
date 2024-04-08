package anonimous;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class ComparatoreRatingAsc implements Comparator<Film>{

	@Override
	public int compare(Film film1, Film film2) {
		// TODO Auto-generated method stub
		return film1.getRating() - film2.getRating();
	}
	
}

public class ProvaFilm {

	public static void main(String[] args) {

//		LeggiFile
//			.leggi("C:\\Users\\teacher\\Downloads\\best-film-2023.csv")
//			.stream()
//			.forEach(s -> System.out.println(s));
		
		List<Film> films = new ArrayList<Film>();
		
		int i = 0;
		for(String riga : LeggiFile.leggi("C:\\Users\\teacher\\Downloads\\best-film-2023.csv")) {
			
			String[] split = riga.split(";");
			if (i++ > 0) {
				int id = Integer.parseInt(split[0]);			
				int anno = Integer.parseInt(split[2]);			
				int rating = Integer.parseInt(split[3]);
				String titolo = split[1].replaceAll("\"", "");
				String regista = split[4].replaceAll("\"", "");
				Film f = new Film();
				f.setId(id);
				f.setAnno(anno);
				f.setRating(rating);
				f.setRegista(regista);
				f.setTitolo(titolo);
				films.add(f);
			}
		}
		//ComparatoreRatingAsc cra = new ComparatoreRatingAsc();
		
//		Comparator<Film> cra = (o1, o2) -> o1.getRating() - o2.getRating();
		
		List<Film> ordinatipertitolo = films
			.stream()
			.filter(f -> f.getRating() > 95)
			.sorted((o1, o2) -> o1.getTitolo().compareTo(o2.getTitolo()))
			.toList();
			
//			.forEach(Film::new);
		
		ordinatipertitolo
		.stream()
		.map(f -> f.getRegista())
		.forEach(System.out::println);

	}

}
