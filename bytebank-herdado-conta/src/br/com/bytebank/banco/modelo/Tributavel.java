package br.com.bytebank.banco.modelo;

public interface Tributavel {
	//Podemos declarar sem a declaração public abstract
	//essas informações já são implicitas na interface
	public abstract double getValorImposto();
	
}
