
public class TesteCalculoImposto {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(111, 222);
		cc.deposita(2000);

		ContaPoupanca cp = new ContaPoupanca(222, 111);
		cp.deposita(3000);

		CalculadorImposto ci = new CalculadorImposto();
		ci.registra(cc);
		ci.registra(cp);

		System.out.println(ci.getTotalImposto());

	}
}
