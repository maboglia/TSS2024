package model;

import java.util.Set;

public class Regione {

	private String nome;
	private int popolazione;
	private Set<Provincia> province;
	
	public Regione() {
		// TODO Auto-generated constructor stub
	}
	
	public Regione(String nome, int popolazione, Set<Provincia> province) {
		super();
		this.nome = nome;
		this.popolazione = popolazione;
		this.province = province;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPopolazione() {
		return popolazione;
	}

	public void setPopolazione(int popolazione) {
		this.popolazione = popolazione;
	}

	public Set<Provincia> getProvince() {
		return province;
	}

	public void setProvince(Set<Provincia> province) {
		this.province = province;
	}

	@Override
	public String toString() {
		return "Regione [nome=" + nome + ", popolazione=" + popolazione + ", province=" + province + "]";
	}
	
	
	
	
	
}
