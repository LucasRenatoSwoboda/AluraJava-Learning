package br.com.bytebank.banco.test.util;

import java.util.Comparator;

import br.com.bytebank.banco.modelo.Conta;

//Classe para comparar números de contas
class NumeroDaContaComparador implements Comparator<Conta> {
	/**
	 * Código comentado 1 = Compara as duas numerações de contas e retorna: negativo
	 * se c1 < c2, 0 se c1 == c2, positovo se c1 > c2
	 * 
	 * Código comentado 2 = Compara as contas, se 0 as contas são iguais, se 1 c1 >
	 * c2, se -1 c1 < c2
	 * 
	 * Código efetivo = Utiliza o método compare da classe Integer para comparar as
	 * contas.
	 */
	@Override
	public int compare(Conta c1, Conta c2) {

		return Integer.compare(c1.getConta(), c2.getConta());

		// Código comentado 1
//		return c1.getConta() - c2.getConta();

		// Código comentado 2
//		if (c1.getConta() < c2.getConta())
//			return -1;
//		if (c1.getConta() > c2.getConta())
//			return 1;
//		return 0;
	}
}
