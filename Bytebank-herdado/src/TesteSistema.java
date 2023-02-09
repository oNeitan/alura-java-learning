
public class TesteSistema {
	public static void main(String[] args) {
		Gerente g1 = new Gerente();

		g1.setSenha(12345);

		Administrador adm1 = new Administrador();
		adm1.setSenha(22345);

		Cliente c1 = new Cliente();
		c1.setSenha(12345);

		SistemaInterno si = new SistemaInterno();

		si.autenticar(c1);
		si.autenticar(g1);
		si.autenticar(adm1);

	}

}
