package bank;

// Classe para criar uma conta
public class Conta {
	private Cliente titular;
	private int agencia;
	private int conta;
	private double saldo;
	private static int totalContas;

	// Construtor deve receber por parâmetro um titular
	public Conta(Cliente cliente) {
		this.agencia = 1;
		this.conta = ++totalContas;
		this.titular = cliente;
	}

	// Métodos de acesso get para retornar titular, agência, conta e saldo
	public Cliente getTitular() {
		return this.titular;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public int getConta() {
		return this.conta;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public static int getTotalContas() {
		return Conta.totalContas;
	}

	// Método de acesso set para alterar o saldo
	public void setSaldo(double valor) {
		this.saldo = valor;
	}

	// Método para sacar somente se possuir saldo
	// maior ou igual ao valor sacado
	public boolean sacar(double valor) {
		if (valor <= getSaldo()) {
			double novoSaldo = getSaldo() - valor;
			setSaldo(novoSaldo);
			return true;
		}
		return false;
	}

	// Método para depositar um valor na conta
	public void depositar(double valor) {
		double novoSaldo = getSaldo() + valor;
		setSaldo(novoSaldo);
	}

	// Método para transferir um valor se tiver saldo
	public boolean transferir(double valor, int ag, int cc) {
		if (valor >= getSaldo()) {
			return true;
		}
		return false;
	}

}
