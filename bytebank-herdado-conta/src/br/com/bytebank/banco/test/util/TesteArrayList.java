package br.com.bytebank.banco.test.util;

import java.util.LinkedList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.Corrente;
import br.com.bytebank.banco.modelo.Poupanca;
import br.com.bytebank.banco.modelo.Cliente;

public class TesteArrayList {
	public static void main(String[] args) {

		// Iniciando Lista. Cria uma lista de contas com LinkedList
		// Instancia objetos do tipo conta corrente e conta poupança e adiciona a lista
		LinkedList<Conta> listaContas = new LinkedList<Conta>();
		Conta contaCorrente = new Corrente(new Cliente("Lucas"));
		Conta contaPoupanca = new Poupanca(new Cliente("Jéssica"));
		listaContas.add(contaCorrente);
		listaContas.add(contaPoupanca);
		// Imprime tamanho da lista antes e depois de remover o elemento da conta corrente
		System.out.println("Tamanho da lista: " + listaContas.size());
		listaContas.remove(contaCorrente);
		System.out.println("Tamanho da lista: " + listaContas.size());
		// Adiciona novamente elemento de conta corrente, itera verificando existencia da 
		// conta poupança na lista
		listaContas.add(contaCorrente);
		for(Conta conta: listaContas) {
			if (conta.equals(contaPoupanca)) {
				System.out.println("Encontrou a conta: AG-" + conta.getAgencia() + " conta nº: " + conta.getConta());
			}
		}
	}
}