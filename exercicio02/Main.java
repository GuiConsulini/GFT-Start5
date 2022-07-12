package exercicio02;

public class Main {

	public static void main(String[] args) {
		Conta c = new Conta("Agenor", "8855-9", 1250);
		ContaCorrente cc = new ContaCorrente("Agenor", "8855-9", 1250);
		ContaPoupanca cp = new ContaPoupanca("Agenor", "8855-9", 5000);
		
		System.out.println(c);
		System.out.println("Seu saldo em Conta é: R$" + cc.getSaldo() + ". Rendendo a uma taxa de 0.03. Rendimento atual: " + cc.rendimento());
		System.out.println("Seu saldo em Conta poupança é: R$" + cp.getSaldo() + ". Rendendo a uma taxa de 0.05. Rendimento atual: " + cp.rendimento());
	}

}
