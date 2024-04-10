package com.maboglia.entities;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name = "test")
public class Test {

	//test( idTest, titoloTest, dataTest )

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String titoloTest;
	private LocalDate dataTest;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
	        name="test_domande",
	        joinColumns={@JoinColumn(name="test_id")},
	        inverseJoinColumns={@JoinColumn(name="domanda_id")}
	    )
	private Set<Domanda> domande;

	@ManyToMany
	@JoinTable(
	        name="test_persone",
	        joinColumns={@JoinColumn(name="test_id")},
	        inverseJoinColumns={@JoinColumn(name="persona_id")}
	    )
	@JsonIgnore
	private List<Persona> persone;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitoloTest() {
		return titoloTest;
	}

	public void setTitoloTest(String titoloTest) {
		this.titoloTest = titoloTest;
	}

	public LocalDate getDataTest() {
		return dataTest;
	}

	public void setDataTest(LocalDate dataTest) {
		this.dataTest = dataTest;
	}

	public Set<Domanda> getDomande() {
		return domande;
	}

	public void setDomande(Set<Domanda> domande) {
		this.domande = domande;
	}
	
}
