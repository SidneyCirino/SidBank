package banco;

public abstract class Contas {

	private String titular;
	private int numconta;
	protected double saldo;
	
	
	int getnumconta() {
		return numconta;
	}
	
	void setnumconta(int numconta) {
		this.numconta = numconta;
	}
	
	String gettitular() {
		return titular;
	}
	
	void settitular(String titular) {
		this.titular = titular;
	}
	
	double getsaldo() {
		return saldo;
	}
	
	abstract void depositar (double valor);
	abstract void dados();
	abstract void mostrarsaldo();
	
	
}
