package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

public class TesteComparacoesWithCollections {

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
		System.out.println("Antes da comparação");
		for (Conta conta : listaContas) {
			System.out.println(conta);
		}

		// Organiza por número de contas com Collections
		// Imprime as contas dentro da lista depois da organização
		Collections.sort(listaContas, new NumeroDaContaComparador());
		System.out.println("\nDepois da comparação");
		for (Conta conta : listaContas) {
			System.out.println(conta);
		}

		// Reverte os itens da lista
		// Imprime as contas dentro da lista depois da reversão
		Collections.reverse(listaContas);
		System.out.println("\nDepois da reversão");
		for (Conta conta : listaContas) {
			System.out.println(conta);
		}

		// Método shuffle organiza de forma aleatória a lista
		// Imprime as contas dentro da lista depois da organização aleatória
		Collections.shuffle(listaContas);
		System.out.println("\nDepois da Shuffle");
		for (Conta conta : listaContas) {
			System.out.println(conta);
		}
		
		// Usa o comparador criado na classe conta
		// Imprime as contas dentro da lista depois da organização aleatória
		Collections.sort(listaContas);
		System.out.println("\nDepois da organização natural da classe conta");
		for (Conta conta : listaContas) {
			System.out.println(conta + " - Saldo: R$" +conta.getSaldo());
		}
	}

}
