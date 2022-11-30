package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.Corrente;
import br.com.bytebank.banco.modelo.Poupanca;

public class TesteLinkedList {
	public static void main(String[] args) {

		// Cria um Array de referencias Conta jogando dois objetos diferentes na lista
		// (Corrente e Poupanca)
		ArrayList<Conta> listaContas = new ArrayList<Conta>();
		Conta cc = new Corrente(new Cliente("Lucas 1"));
		Conta cp = new Poupanca(new Cliente("Lucas 1"));
		listaContas.add(cc);
		listaContas.add(cp);

		// Imprime tamanho da lista de contas
		System.out.println("Tamanho da lista: " + listaContas.size());

		// Get um elemento da lista de contas e joga em ref, e imprime o número da conta
		// dessa ref.
		Conta ref = listaContas.get(0);
		System.out.println("Número da conta: " + ref.getConta());

		// Remove o elemento da posição 0 da lista de contas. Imprime novo tamanho da
		// lista de contas após exclusão.
		listaContas.remove(0);
		System.out.println("Tamanho atual da lista: " + listaContas.size());

		// Separação para impressão
		System.out.println("----------------------------------");

		// Adiciona um novo elemento a lista de contas
		listaContas.add(new Corrente(new Cliente("Teste")));

		// Imprime toString de cada objeto na lista de contas
		for (int i = 0; i < listaContas.size(); i++) {
			Object conta = listaContas.get(i);
			System.out.println(conta);
		}

		// Separação para impressão
		System.out.println("----------------------------------");

		// Imprime cada objeto da lista de contas
		for (Conta conta : listaContas) {
			System.out.println(conta);
		}

		// Separação para impressão
		System.out.println("----------------------------------");

		// Cria um Array de referencias Cliente jogando 3 objetos e imprimindo tamanho.
		ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
		for (int i = 0; i < 3; i++)
			listaClientes.add(new Cliente("Lucas " + i));
		System.out.println("Tamanho atual da lista = " + listaClientes.size());

		// Definindo um ArrayList com tamanho inicial
		ArrayList listaEstados = new ArrayList(26); // capacidade inicial

		// Adicionando elementos a lista de estados
		listaEstados.add("RJ");
		listaEstados.add("SP");
		listaEstados.add("RS");

		// Criando uma lista com atraves de outra e mostrando todos os estados
		ArrayList novaListaEstados = new ArrayList(listaEstados);
		for (Object estado : novaListaEstados)
			System.out.println("Estado - " + estado);
	}
}