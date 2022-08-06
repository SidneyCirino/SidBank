package banco;

public class ContaPoupanca extends Contas{
	
	ContaPoupanca(){
		
	}
	
	ContaPoupanca(String nome, int numero){
		settitular(nome);
		setnumconta(numero);
	}
	
	void resgatar (double valor, ContaCorrente destino) {
		if (this.getsaldo() >= valor) {
			this.saldo -= valor;
			destino.depositar(valor);
			System.out.println("O seguinte valor foi resgatado com sucesso: R$" + valor);
		} else {
			System.out.println("Saldo insuficiente para resgate. Verifique os valores e tente novamente.");
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
		System.out.println("|         CONTA POUPANCA         ");
		System.out.println("|");
		System.out.println("| Titular: " + this.gettitular());
		System.out.println("| Conta: " + this.getnumconta() + "-1");
		System.out.println("| Saldo aplicado: " + this.getsaldo());
		System.out.println("|");
		System.out.println("|________________________________");
	}
	
	@Override
	void mostrarsaldo() {
		System.out.println("Saldo aplicado: " + this.getsaldo());;
	}
	
}
