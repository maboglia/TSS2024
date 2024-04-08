package pl;

import java.util.ArrayList;
import java.util.List;

import model.Film;
import service.FilmService;
import service.FilmServiceImpl;

public class MVCFilmController {

	private FilmService service;
	
	public MVCFilmController() {
		this.service = new FilmServiceImpl();
	}
	
	public String getFilm(int id) {
		return this.service
			.findAll()
			.stream()
			.filter(f -> f.getId()==id)
			.toString();
	}
	
	public Object[][] getFilmsObject(){
		Object[][] objectList = new Object[service.findAll().size()][4];
		int i = 0;
		for (Film f : service.findAll()) {
			
			objectList[i][0]=f.getId();
			objectList[i][1]=f.getTitolo();
			objectList[i][2]=f.getAnno();
			objectList[i][3]=f.getRating();
			i++;
		}
		
		return objectList;
	}
	
	public List<String> getAll() {

		List<String> string = new ArrayList<String>();
		service
			.findAll()
			.stream()
			.forEach(f -> {
				string.add(f.toString());
			});
		return string;
	}
	
	public void add(Film f) {
		service.addFilm(f);
	}
	
	
}
