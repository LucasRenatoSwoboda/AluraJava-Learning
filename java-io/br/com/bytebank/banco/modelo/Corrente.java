package br.com.bytebank.banco.modelo;

public class Corrente extends Conta implements Tributavel {
	
	public Corrente(Cliente cliente) {
		super(cliente);
	}
	
	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return super.getSaldo() * 0.01;
	}
	
	@Override
	public void sacar(double valor) throws SaldoInsuficienteExceptionChecked {
		super.sacar(valor);
	}
	
	@Override
	public void transferir(double valor, Conta cc) throws SaldoInsuficienteExceptionChecked {
		super.transferir(valor, cc);
		setSaldo(getSaldo() - 0.5);
 	}
	
	@Override
	public void depositar(double valor) {
		setSaldo(getSaldo() + valor);		
	}
	
	@Override
	public String toString() {
		return "Conta Corrente: " + super.toString();
	}
	
}