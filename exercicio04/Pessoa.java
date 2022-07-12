package exercicio04;

public class Pessoa {
	private String nome;
	private int idade;
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
	
	public void podeDoar(int idade) {
		if(idade >=18 && idade <=67) {
			System.out.println("Sua idade está apta para doar.");
		}
		else {
			System.out.println("Você não possui idade apta para doar");
		}
	}
}
