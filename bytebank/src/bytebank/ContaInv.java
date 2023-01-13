package bytebank;

public class ContaInv {
	private int agenciaNumero;
	private int contaNumero;
	private Titular titular;
	private double saldo;

	private static int contadorAgencia;
	private static int contadorConta;

	// Construtor com títular apenas
	public ContaInv(Titular titular) {
		this.agenciaNumero += contadorAgencia;
		this.contaNumero += contaNumero;
		this.titular = titular;
		this.saldo = 0;
	}

	// Construtor com titular, agencia e conta.
	public ContaInv(Titular titular, int agenciaNumero, int contaNumero) {
		this.agenciaNumero = agenciaNumero;
		this.contaNumero = contaNumero;
		this.titular = titular;
		this.saldo = 0;
	}

	// Deposita valor na conta
	public void deposita(double valor) {
		this.saldo += valor;
	}

	// Saca valor da conta se possuí saldo
	public void saca(double valor) {
		if (valor > saldo)
			throw new RuntimeException(String.format(
					"Valor a sacar não pode ser maior que o saldo\nSaldo = %.2f - Valor = %.2f ", this.saldo, valor));
		this.saldo -= valor;
	}

	// Transfere valor da conta se possuí saldo
	public void transfere(double valor, ContaInv conta) {
		saca(valor);
		conta.saldo += valor;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
}