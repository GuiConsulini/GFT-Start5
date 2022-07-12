package exercicio02;

public class Conta {
	private String titular;
	private String numero;
	private double saldo;
	
	public Conta(String titular, String numero, double saldo) {
		super();
		this.titular = titular;
		this.numero = numero;
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double rendimento() {
		return this.getSaldo();
	}

	@Override
	public String toString() {
		return "Conta [Titular = " + titular + 
				", Número = " + numero + 
				", Saldo = R$" + saldo + "]";
	}
	
	
	
	
}
