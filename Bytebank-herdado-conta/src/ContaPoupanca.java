
public class ContaPoupanca extends Conta implements Tributavel {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.1;
	}

	@Override
	public boolean saca(double valor) {
		if (super.saldo >= valor) {
			super.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

}
