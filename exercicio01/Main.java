package exercicio01;

import java.util.Scanner;

public class Main {
	int  media1, media2, media3, media4, soma, y; 
	
	double peso;
	public static void main(String[] args) {
		int  media1 = 0, media2 = 0, media3 = 0, media4 = 0, soma = 0, y = 0; 
		
		Scanner sc  = new Scanner(System.in);
		for(int i = 0; i <= 3; i++) {
			
			Pessoa p = new Pessoa();
			System.out.println("Digite sua idade: ");
			int idade = sc.nextInt();
			System.out.println("Digite sua idade: ");
			double peso = sc.nextDouble();
			
			if(idade >= 1 && idade <= 10) {
				y = y + 1;
				soma = (int) (soma + peso);
				media1 = soma / y;
			}	
			if(idade >= 11 && idade <= 20) {
				y = y + 1;
				soma = (int) (soma + peso);	
				media2 = soma/y;
			}
			if(idade >= 21 && idade <= 30) {
				y = y + 1;
				soma = (int) (soma + peso);	
				media3 = soma/y;
			}
			if(idade >= 31) {
				y = y + 1;
				soma = (int) (soma + peso);	
				media4 = soma/y;
			}
		
		
		}
		System.out.println("A media dos pesos das pessoas entre 1 e 10: " + media1);
		System.out.println("A media dos pesos das pessoas entre 11 e 20: " + media2);
		System.out.println("A media dos pesos das pessoas entre 21 e 30: " + media3);
		System.out.println("A media dos pesos acima de 30 anos: " + media4);
		
	}

}
