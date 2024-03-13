package avanzato;

public class Azione implements Comparable<Azione>{

	private int id;
	private String nome;
	private double valore;
	
	public Azione() {
		// TODO Auto-generated constructor stub
	}
	
	public Azione(int id, String nome, double valore) {
		super();
		this.id = id;
		this.nome = nome;
		this.valore = valore;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValore() {
		return valore;
	}

	public void setValore(double valore) {
		this.valore = valore;
	}

	@Override
	public String toString() {
		return "Azione [id=" + id + ", nome=" + nome + ", valore=" + valore + "]";
	}

	@Override
	public int compareTo(Azione altraAzione) {
		// Ordine alfabetico per nome
		return this.nome.compareTo(altraAzione.nome);
	}
	
	
	
}
