package exercicio02;

public class ContaCorrente extends Conta {

	public ContaCorrente(String titular, String numero, double saldo) {
		super(titular, numero, saldo);
		
	}

	
	public double rendimento() {
		return this.getSaldo() * 0.03;
	}
	
	
	
	
}
