package controller;

import java.util.ArrayList;

import model.Libro;

public class Libreria {

	private ArrayList<Libro> libri;
	private String nome;
	
	public Libreria(String nome) {
		this.nome = nome;
		this.libri = new ArrayList<Libro>();
	}
	
	//CRUD
	//CREATE - POST
	public void addLibro(Libro l) {
		this.libri.add(l);
	}

	//READ - GET
	public ArrayList<Libro> getLibri(){
		return this.libri;
	}
	
	//UPDATE - PUT - PATCH
	public void updateLibro(Libro l) {
		//1)trovare pos iniziale libro
		int pos = this.libri.indexOf(l);
		//2 sostituire libro alla posizione pos
		this.libri.add(pos, l);
	}

	//DELETE - DELETE
	public void deleteLibro(Libro l) {
		this.libri.remove(l);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		
		StringBuilder output = new StringBuilder();
		
		output.append("<h2>");
		output.append(this.nome);
		output.append("</h2>");
		output.append("\n");
		
		output.append("<ul>");
		output.append("\n");

		for (Libro libro : libri) {
			output.append(libro);
			output.append("\n");
		}
		
		output.append("</ul>");

		return output.toString();
	}
	
	
}
