
public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	@Override
	public double getValorImposto() {
		return 0.2 * super.getSaldo();
	}

	@Override
	public boolean saca(double valor) {
		if (super.saldo >= valor) {
			super.saldo -= valor + 0.2;
			return true;
		} else {
			return false;
		}
	}

}
