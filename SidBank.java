package banco;
import java.util.Scanner;
import banco.ContaPoupanca;
import banco.ContaCorrente;
public class SidBank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		int opcao, opcao2, numconta;
		double valor, depositoinicial;
		String nome;
		
		do {
			System.out.println(" ________________________________");
			System.out.println("|            Sid Bank            |");
			System.out.println("|             OPÇÕES             |");
			System.out.println("|    +----------------------+    |");
			System.out.println("|    | 1. Criar Conta       |    |");
			System.out.println("|    | 2. Dados da conta    |    |");
			System.out.println("|    | 3. Depositar         |    |");
			System.out.println("|    | 4. Sacar             |    |");
			System.out.println("|    | 5. Aplicar           |    |");
			System.out.println("|    | 6. Resgatar          |    |");
			System.out.println("|    | 7. Mostrar saldo     |    |");
			System.out.println("|    | 0. Sair              |    |");
			System.out.println("|    +----------------------+    |");
			System.out.println("|________________________________|");	
			
			System.out.println();
			System.out.println("Digite a opção desejada: ");
			opcao = sc.nextInt();
			
			switch (opcao) {
			case 1: //criar conta
				System.out.println("Digite seu nome: ");
				nome = scString.nextLine();
				cc.settitular(nome);
				cp.settitular(nome);
				System.out.println("Digite o número da conta: ");
				numconta = sc.nextInt();
				cc.setnumconta(numconta);
				cp.setnumconta(numconta);
				System.out.println("Conta criada com sucesso!");
				System.out.println();
				System.out.println("Deseja fazer um depósito inicial? (1 - sim | 2 - não)");
				opcao2 = sc.nextInt();
				if (opcao2 == 1) {
					System.out.println("Digite o valor que será depositado: ");
					depositoinicial = sc.nextDouble();
					cc.depositar(depositoinicial);
				} else {
					
				}
				break;
			case 2: //dados da conta
				cc.dados();
				cp.dados();
				break;
			case 3: //depositar
				System.out.println("Digite o valor que será depositado: ");
				valor = sc.nextDouble();
				cc.depositar(valor);
				break;
			case 4: //sacar
				System.out.println("Digite o valor que deseja sacar: ");
				valor = sc.nextDouble();
				cc.sacar(valor);
				break;
			case 5: //aplicar
				System.out.println("Você tem R$" + cc.getsaldo() + " de saldo disponível.");
				System.out.println("Digite o valor que será aplicado na poupança: ");
				valor = sc.nextDouble();
				cc.aplicar(valor, cp);
				break;
			case 6: //resgatar
				System.out.println("Digite o valor que será resgatado da poupança para a conta corrente: ");
				valor = sc.nextDouble();
				cp.resgatar(valor, cc);
				break;
			case 7: //mostrar saldo
				System.out.println("Seu saldo, na Conta Corrente, disponível para saque é R$" + cc.getsaldo());
				System.out.println("Seu saldo, na Conta Poupança, disponível para resgate é R$" + cp.getsaldo());
				break;
			default: 
				System.out.println();
				System.out.println("Obrigado por usar o Sid Bank!");
				System.out.println("Sid Bank e você, sempre!");
			}
		}while (opcao != 0);
			

		sc.close();
		scString.close();
	}

}
