
public class Cliente implements Autenticavel {

	private Autenticador autenticador;

	public Cliente() {
		this.autenticador = new Autenticador();
	}

	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	public boolean autenticar(int senha) {
		return this.autenticador.autenticar(senha);
	}
}
