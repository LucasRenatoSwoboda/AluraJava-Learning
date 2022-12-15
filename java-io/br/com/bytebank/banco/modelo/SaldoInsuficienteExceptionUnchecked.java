package br.com.bytebank.banco.modelo;

public class SaldoInsuficienteExceptionUnchecked extends RuntimeException {
	
	public SaldoInsuficienteExceptionUnchecked (String message) {
		super(message);
	}
	
}
