package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.Corrente;
import br.com.bytebank.banco.modelo.Poupanca;

/**
 * 
 * @author lucas
 *
 *         Utilizando método de comparação da lista (sort) e criando uma classe
 *         de comparação logo abaixo dessa.
 * 
 */

public class TesteLambdaListForEach {

	public static void main(String[] args) {

		// Cria varias contas, entre correntes e poupanças
		// todas já com valores iniciais depositados.
		Conta cc1 = new Corrente(new Cliente("Swoboda"));
		cc1.depositar(333);
		Conta cp1 = new Poupanca(new Cliente("Lucas"));
		cp1.depositar(444);
		Conta cc2 = new Corrente(new Cliente("Jéssica"));
		cc2.depositar(111);
		Conta cp2 = new Poupanca(new Cliente("Ohana"));
		cp2.depositar(222);
		Conta cc3 = new Corrente(new Cliente("Bernardo"));
		cc3.depositar(555);
		Conta cp3 = new Poupanca(new Cliente("Renato"));
		cp3.depositar(666);
		Conta cc4 = new Corrente(new Cliente("Manuela"));
		cc4.depositar(777);
		Conta cp4 = new Poupanca(new Cliente("Henrique"));
		cp4.depositar(999);

		// Cria uma lista de contas e adiciona todas as contas a lista
		List<Conta> listaContas = new ArrayList<>();
		listaContas.add(cc2);
		listaContas.add(cc4);
		listaContas.add(cp1);
		listaContas.add(cp2);
		listaContas.add(cp4);
		listaContas.add(cp3);
		listaContas.add(cc3);
		listaContas.add(cc1);

		// Imprime as contas dentro da lista antes da organização
		System.out.println("Antes da comparação"); // Lambda no forEach da lista
		listaContas.forEach((conta) -> System.out.println(conta)); // Iteração Lambda

		// Cria um objeto da classe comparadora e utiliza
		// o objeto comparador para o método sort da lista.
		// Essa forma de fazer o código em uma única aplicação
		// sem precisar criar uma classe para tal função.
		listaContas.sort( // Lambda representado por -> // Oganizando com Lambda
				(c1, c2) -> Integer.compare(c1.getConta(), c2.getConta()));

		// Imprime as contas dentro da lista depois da comparação número
		System.out.println("\nDepois da comparação");
		listaContas.forEach((conta) -> System.out.println(conta)); // Iteração Lambda

		// Cria um objeto da classe comparadora e utiliza
		// o objeto comparador para o método sort da lista.
		// Essa forma de fazer o código em uma única aplicação
		// sem precisar criar uma classe para tal função.
		Comparator<Conta> comparaTitular = (c1, c2) -> c1.getTitular().getNome().compareTo(c2.getTitular().getNome()); // Lambda
		listaContas.sort(comparaTitular); // usando a referencia para comparar

		// Imprime as contas dentro da lista depois da comparação títular
		System.out.println("\nDepois da comparação");
		listaContas.forEach((conta) -> System.out.println(conta));

	}

}