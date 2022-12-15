package br.com.bytebank.banco.test.util;

import java.util.Comparator;

import br.com.bytebank.banco.modelo.Conta;

//Classe para comparar nomes dos titulares
public class TitularDaContaComparador implements Comparator<Conta> {

	/**
	 * Compara as letras dos nomes do titular usando o método da classe String
	 * compareTo
	 */
	@Override
	public int compare(Conta c1, Conta c2) {
		String nomeTitularC1 = c1.getTitular().getNome();
		String nomeTitularC2 = c2.getTitular().getNome();
		return nomeTitularC1.compareTo(nomeTitularC2);
	}

}