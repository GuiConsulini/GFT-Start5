package exercicio04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Pessoa p = new Pessoa();
		
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		
		System.out.println("Olá " + nome + ", tudo bem?");
		p.podeDoar(idade);

	}

}
