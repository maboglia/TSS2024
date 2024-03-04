package com.maboglia.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maboglia.entities.Gioco;
import com.maboglia.services.GiocoService;

@RestController 
@RequestMapping("api")
public class ControllerRest {

	@Autowired
	private GiocoService service;
	
	@CrossOrigin()
	@GetMapping("giochi")
	public List<Gioco> getGiochi(){
		return service.getGiochi();
	}
	
	@CrossOrigin()
	@GetMapping("giochi/year/{year}")
	public List<Gioco> getGiochiByYear(@PathVariable int year){
		return service.getGiochi()
				.stream()
				.filter(g->g.getYear()==year)
				.toList();
	}
	
	@CrossOrigin()
	@GetMapping("giochi/genre/{genre}")
	public List<Gioco> getGiochiBygenre(@PathVariable String genre){
		return service.getGiochi()
				.stream()
				.filter(g->g.getGenre().contains(genre))
				.toList();
	}
	
	@CrossOrigin()
	@GetMapping("giochi/title/{title}")
	public List<Gioco> getGiochiByTitle(@PathVariable String title){
		return service.getGiochi()
				.stream()
				.filter(g->g.getTitle().contains(title))
				.toList();
	}
	
	@CrossOrigin()
	@GetMapping("giochi/platform/{platform}")
	public List<Gioco> getGiochiByPlatform(@PathVariable String platform){
		return service.getGiochi()
				.stream()
				.filter(g->g.getOriginalPlatform().contains(platform))
				.toList();
	}
	
	
	
	@GetMapping("giochi/{id}")
	public Gioco getGiochiById(@PathVariable int id){
		return service.getGiochi()
				.stream()
				.filter(g->g.getId()==id )
				.findFirst()
				.get();
	}
	
	@PostMapping("giochi")
	public Gioco addGioco(@RequestBody Gioco g) {
		service.addGioco(g);
		return g;
	}
	
	
}
