package br.com.bytebank.banco.modelo;

public class CalculadoraDeImposto {
	
	private double totalImposto;
	
	public void registra(Tributavel t) {
		this.totalImposto += t.getValorImposto();
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}
	
}
