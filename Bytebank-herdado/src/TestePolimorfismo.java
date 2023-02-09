
public class TestePolimorfismo {
	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setSalario(6000);

//      Não pode ser instaciado por se tratar de uma classe abstrata
//		Funcionario f1 = new Funcionario();  
//		f1.setSalario(2000);

		Desenvolvedor d1 = new Desenvolvedor();
		d1.setSalario(4000);

		ControleBonificacao ctrlBoni = new ControleBonificacao();
		ctrlBoni.registrar(g1);
		ctrlBoni.registrar(d1);

		System.out.println(ctrlBoni.getTotalBon());

	}
}
