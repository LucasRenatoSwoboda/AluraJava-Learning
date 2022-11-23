package br.com.bytebank.banco.modelo;

/**
 * Classe que representa uma conta abstrada
 * 
 * @author Lucas Renato Swoboda
 * @version 1.0
 */

// Classe para criar uma conta
public abstract class Conta {
	private Cliente titular;
	private int agencia;
	private int conta;
	protected double saldo;
	private static int totalContas;

	/**
	 * Construtor para inicializar o objeto conta a partir do cliente.
	 * @param cliente
	 */
	
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

	/**
	 * Valor precisa ser maior ou igual ao saldo
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteExceptionChecked
	 */
	
	// Método para sacar somente se possuir saldo
	// maior ou igual ao valor sacado
	public void sacar(double valor) throws SaldoInsuficienteExceptionChecked {
		if (getSaldo() < valor) {
			throw new SaldoInsuficienteExceptionChecked(String.format("Saldo insuficiente.\nSaldo Atual: R$ %.2f\nValor que tentou sacar: R$ %.2f", getSaldo(), valor));	
		}
		setSaldo(getSaldo() - valor);
	}

	// Método para depositar um valor na conta
	public abstract void depositar(double valor) ;

	// Método para transferir um valor se tiver saldo
	public void transferir(double valor, Conta cc) throws SaldoInsuficienteExceptionChecked {
		this.sacar(valor);
		cc.depositar(valor);
	}
}
