public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaBianca = new Conta(1111,22222);
		System.out.println(contaDaBianca.getSaldo());

		contaDaBianca.setTitular(new Cliente());
		System.out.println(contaDaBianca.getTitular());

		contaDaBianca.getTitular().setNome("Bianca");
		System.out.println(contaDaBianca.getTitular().getNome());

	}
}