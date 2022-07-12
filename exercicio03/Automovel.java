package exercicio03;

public class Automovel {
	private String nome;
	private String combustivel;
	
	

	public Automovel(String nome, String combustivel) {
		this.nome = nome;
		this.combustivel = combustivel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	@Override
	public String toString() {
		return "O automovél " + nome + " utiliza o combustível " + combustivel;
	}

	
	
	
}
