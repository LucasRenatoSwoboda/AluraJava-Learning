package bytebank;

public class Conta_inv {
	double saldo;
	int agencia;
	int numero;
	String titular;

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {

		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public boolean transfere(double valor, Conta_inv destino) {
		if (saldo >= valor) {
			destino.saldo += valor;
			return true;
		}
		return false;
	}
}