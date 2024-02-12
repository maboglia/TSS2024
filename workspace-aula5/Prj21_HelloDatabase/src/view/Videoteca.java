package view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import database.FilmDAOImpl;
import model.Film;

class Videoteca {

	public static void main(String[] args) throws IOException {

		ArrayList<Film> films = new ArrayList<Film>();
		
		File f = new File("files/film-animazione.txt");
		
		FileReader fr = new FileReader(f);
		
		BufferedReader br = new BufferedReader(fr);
		
		String riga = null;
		
		while ( (riga = br.readLine()) != null   ) {
			String[] split = riga.split(",");
			
			int id = Integer.parseInt(split[0]);
			String titolo = split[1];
			int anno = Integer.parseInt(split[2]);
			double rating = Double.parseDouble(split[3]);
			
			Film film = new Film();
			film.setId(id);
			film.setTitolo(titolo);
			film.setAnno(anno);
			film.setRating(rating);
			
			films.add(film);
			
		}
		
		FilmDAOImpl dao = new FilmDAOImpl();
		
//		for (Film film : films) {
//			System.out.println(film.getTitolo());
//			//dao.addFilm(film);
//		}
		
		ArrayList<Film> film2016 = dao.getFilmsByAnno(2016);
		System.out.println("film cartoni del 2016 in videoteca: " + film2016.size());
		
		for (Film film : film2016) {
			System.out.println(film.getTitolo());
		}
	}

}
