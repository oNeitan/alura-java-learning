
public class Administrador extends Funcionario implements Autenticavel {

	private Autenticador autenticador;

	public Administrador() {
		this.autenticador = new Autenticador();
	}

	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	public boolean autenticar(int senha) {
		return this.autenticador.autenticar(senha);
	}

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 0;
	}

}
