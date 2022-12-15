package br.com.bytebank.banco.test.lang;

import java.util.ArrayList;
import java.util.List;

public class TesteClasseNumber {

	public static void main(String[] args) {
		
		/**
		 * Todos as classes numéricas herdam a classe Number
		 */
		
		// Criar uma referencia Number e atribuir um valor Integer
		// Criar uma referencia Number e atribuir um valor Double
		Number numeroIntegerRef = Integer.valueOf(29);
		System.out.println(numeroIntegerRef);
		Number numeroDoubleRef = Double.valueOf(29.5);
		System.out.println(numeroDoubleRef);

		// Criando uma lista de Números geréricas com a classe Number
		// atribuindo dois valores a lista, um Double e um Integer
		List<Number> numerosLista = new ArrayList<>(); 
		numerosLista.add(numeroIntegerRef);
		numerosLista.add(numeroDoubleRef);
	
		System.out.println("Número Index 0 = " + numerosLista.get(0));
		System.out.println("Número Index 1 = " + numerosLista.get(1));
		
	}

}
