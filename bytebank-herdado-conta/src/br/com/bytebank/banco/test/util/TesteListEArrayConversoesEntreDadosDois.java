package br.com.bytebank.banco.test.util;

import java.util.List;
import java.util.ArrayList;

public class TesteListEArrayConversoesEntreDadosDois {

	public static void main(String[] args) {
		
		// Array de primitivos
		int [] idades = new int[5];
		// Array de referência criada com a classe Wrapper
		String [] nomes = new String[5];
		
		// Em listas só existe de referências
		List numeros = new ArrayList();
		
		// Mesmo assim conseguidos usar uma variável primitivo e adiciona-lá na lista.
		int idade = 29;
		numeros.add(idade);
		
	}

}
