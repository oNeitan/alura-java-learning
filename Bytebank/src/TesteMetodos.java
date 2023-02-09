
/*Teste feito antes do encapsulamento 
e dos contrutores da classe Conta*/
public class TesteMetodos { 
	public static void main(String[] args) {
		
		Conta contaCarlos = new Conta();
		Cliente Carlos = new Cliente();

		Carlos.nome = "Joao";

		contaCarlos.saldo = 200;

		contaCarlos.depositar(250);
		contaCarlos.titular = Carlos;

		System.out.println("O titular da conta é: " + contaCarlos.titular.nome);
		System.out.println("Conta do Joao: " + contaCarlos.saldo);

		Conta contaMarcela = new Conta();

		contaMarcela.titular.nome = "Marcela";

		contaMarcela.saldo = 500;
		System.out.println("Conta da Maria: " + contaMarcela.saldo);

		if (contaMarcela.transferir(450, contaCarlos)) {
			System.out.println("Foi tranferido com sucesso!");
		} else {
			System.out.println("Dinheiro insuficiente..");
		}

		System.out.println();
		System.out.println("Conta do Joao: " + contaCarlos.saldo);
		System.out.println("Conta da Maria: " + contaMarcela.saldo);

	}
}
