package model;

public class Provincia {

	//"id";"regione";"comune";"maschi";"femmine";"totale"

	private int id;
	private Regione regione;
	private String nome;
	private int maschi;
	private int femmine;
	private int totale;
	
	public Provincia() {
		// TODO Auto-generated constructor stub
	}

	public Provincia(int id, Regione regione, String nome, int maschi, int femmine, int totale) {
		super();
		this.id = id;
		this.regione = regione;
		this.nome = nome;
		this.maschi = maschi;
		this.femmine = femmine;
		this.totale = totale;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Regione getRegione() {
		return regione;
	}

	public void setRegione(Regione regione) {
		this.regione = regione;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMaschi() {
		return maschi;
	}

	public void setMaschi(int maschi) {
		this.maschi = maschi;
	}

	public int getFemmine() {
		return femmine;
	}

	public void setFemmine(int femmine) {
		this.femmine = femmine;
	}

	public int getTotale() {
		return totale;
	}

	public void setTotale(int totale) {
		this.totale = totale;
	}

	@Override
	public String toString() {
		return "Provincia [id=" + id + ", regione=" + regione + ", nome=" + nome + ", maschi=" + maschi + ", femmine="
				+ femmine + ", totale=" + totale + "]";
	}
	
	
	
}
