package exercicio01;

public class Pessoa {
	private String nome;
	private int idade;
	private double peso;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void mediaPeso(double peso) {
		double resultado = peso / this.idade;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + 
				", idade=" + idade + 
				", peso=" + peso + "]";
	}
	
	
}
