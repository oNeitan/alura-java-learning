public class TestaBanco {
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Silveira");
		paulo.setCpf("123.123.123-44");
		paulo.setProfissao("Desenvolvedor de Software");

		Conta contaDoPaulo = new Conta(0247,12347);
		contaDoPaulo.deposita(200);

		contaDoPaulo.setTitular(paulo);
		System.out.println(contaDoPaulo.getTitular().getNome());
		System.out.println(contaDoPaulo.getTitular());

	}
}