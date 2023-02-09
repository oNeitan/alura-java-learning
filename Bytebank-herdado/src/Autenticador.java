
public class Autenticador {
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autenticar(int senha) {
		if (this.senha == senha) {
			System.out.println("Senha correta!");
			return true;
		} else {
			System.out.println("Senha não confere!");
			return false;
		}
	}
}
