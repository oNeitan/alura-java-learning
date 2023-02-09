
public class SistemaInterno {
	private int senha = 12345;

	public void autenticar(Autenticavel g) {

		boolean autenticou = g.autenticar(this.senha);

		if (autenticou) {
			System.out.println("Acesso permitido!");
		} else {
			System.out.println("Acesso negado!");
		}

	}
}