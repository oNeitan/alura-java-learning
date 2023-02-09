
public class TesteInterfaceEComposicao {
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setSenha(12345);

		Administrador adm1 = new Administrador();
		adm1.setSenha(22222);

		Cliente c1 = new Cliente();
		c1.setSenha(22345);

		c1.autenticar(12345);
		adm1.autenticar(22222);
		g1.autenticar(12345);

	}
}
