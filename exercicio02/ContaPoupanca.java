package exercicio02;

public class ContaPoupanca extends Conta {
	

	public ContaPoupanca(String titular, String numero, double saldo) {
		super(titular, numero, saldo);
		
	}

	public double rendimento() {
		return this.getSaldo() * 0.05;
	}
	
	
}
