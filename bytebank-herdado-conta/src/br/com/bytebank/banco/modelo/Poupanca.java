package br.com.bytebank.banco.modelo;

public class Poupanca extends Conta {
	
	public Poupanca(Cliente cliente) {
		super(cliente);
	}
	
	@Override
	public void depositar(double valor) {
		setSaldo(getSaldo() + valor);		
	}
}
