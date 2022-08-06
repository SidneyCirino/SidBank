package banco;

public class ContaCorrente extends Contas {
	
	ContaCorrente(){
		
	}

	ContaCorrente(String nome, int numero){
		settitular(nome);
		setnumconta(numero);
	}
	
	ContaCorrente(String nome, int numero, double depositoinicial){
		settitular(nome);
		setnumconta(numero);
		depositar(depositoinicial);
	}
	
	void sacar (double valor) {
		if (this.getsaldo() > valor) {
			this.saldo -= valor;
			System.out.println("Saque efetuado com sucesso!");
		} else {
			System.out.println("Você não tem saldo suficiente para realizar este saque.");
		}
	}
	
	@Override
	void depositar(double valor) {
		this.saldo += valor;
	}
	
	@Override
	void dados() {
		System.out.println(" ________________________________");
		System.out.println("|      INFORMAÇÕES DA CONTA      ");
		System.out.println("|         CONTA CORRENTE         ");
		System.out.println("|");
		System.out.println("| Titular: " + this.gettitular());
		System.out.println("| Conta: " + this.getnumconta());
		System.out.println("| Saldo disponível: " + this.getsaldo());
		System.out.println("|");
		System.out.println("|________________________________");
	}
	
	@Override
	void mostrarsaldo() {
		System.out.println("Saldo disponível: " + this.getsaldo());;
	}
	
	void aplicar (double valor, ContaPoupanca destino) {
		if (this.getsaldo() >= valor) {
			this.saldo -= valor;
			destino.depositar(valor);
			System.out.println("Valor aplicado com sucesso!");
		} else {
			System.out.println("Você não tem saldo suficiente para realizar esta ação.");
		}
	}
}
