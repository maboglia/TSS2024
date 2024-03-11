
public class Pokemon {
	private String nome;

	public Pokemon(String nome) {
		
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Pokemon [nome=" + nome + "]";
	}
	
	
}
