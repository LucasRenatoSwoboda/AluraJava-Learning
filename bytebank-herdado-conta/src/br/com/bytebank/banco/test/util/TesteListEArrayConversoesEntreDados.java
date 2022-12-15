package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteListEArrayConversoesEntreDados {

	public static void main(String[] args) {
		
		/*
		 * Uma lista só aceita objetos. Quando criamos uma 
		 * classe primitiva que não é um objeto, por "debaixo
		 * dos panos" o Java cria um objeto, como o feito na
		 * variável idadeRef, guardando valor primitivo para 
		 * adicionar a lista
		 */
		
		// Arrays  
		int[] idades = new int[5];
		String[] nomes = new String[5];
		// ArrayList
		List<Integer> numeros = new ArrayList<Integer>();
		
		// Variável primitiva
		int idade = 29; // Integer
		
		// Como o java faz por "baixo dos panos" quando tentamos adiciona:
		// Integer idadeRef = new Integer(29);
		// Melhor forma de criar um objeto:
		Integer idadeRef2 = Integer.valueOf(idade);
		numeros.add(idadeRef2.intValue()); // Autoboxing
		
		// Pegando um valor de uma String usando a Wrapper class
		String s = "10"; 
		int idadeWithIntegerValueOf = Integer.valueOf(idade);
		int sWithIntegerParseInt = Integer.parseInt(s);
		// Valueof pode receber uma string e utilizara o método parse
		System.out.println(idadeWithIntegerValueOf); 
		System.out.println(sWithIntegerParseInt);
		
		// Pegando um valor de um objeto Integer e transformando em double
		double idadeRef2WithDoubleVelue = idadeRef2.doubleValue();
		System.out.println(idadeRef2WithDoubleVelue);
	}
}
