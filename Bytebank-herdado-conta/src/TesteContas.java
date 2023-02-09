
public class TesteContas {
	public static void main(String[] args) {
		ContaPoupanca cp = new ContaPoupanca(111, 111);
		cp.deposita(150);

		ContaCorrente cc = new ContaCorrente(222, 222);
		cc.deposita(150);

		cc.transfere(10, cp);

		cp.transfere(20, cc);

		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());

	}
}
