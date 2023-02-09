public class TesteSacaNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta(1111,23456);
		conta.deposita(1000);
		System.out.println(conta.saca(1500));

		conta.saca(1500);

		System.out.println(conta.getSaldo());

	}
}