
public class ControleBonificacao {
	private double totalBon;

	public void registrar(Funcionario f) {
		double boni = f.getBonificacao();
		this.totalBon += boni;
	}

	public double getTotalBon() {
		return this.totalBon;
	}

}
