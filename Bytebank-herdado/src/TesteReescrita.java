
public class TesteReescrita {
	public static void main(String[] args) {

		Gerente g1 = new Gerente();

		g1.setNome("Natan");
		g1.setCpf("12312312344");
		g1.setSalario(5000);

		g1.setSenha(123456);
		System.out.println(g1.autenticar(12345));

		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());

		System.out.println(g1.getBonificacao());

	}
}
