package br.com.bytebank.banco.especial;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;

public class ContaEspecial extends Conta{
	
	public ContaEspecial(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void depositar(double valor) {
		super.saldo += valor;
	}
		
}
