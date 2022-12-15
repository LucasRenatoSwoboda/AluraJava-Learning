package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.Corrente;
import br.com.bytebank.banco.modelo.Poupanca;

public class TesteArrayListEquals {
	public static void main(String[] args) {

		// Cria ArrayList de contas. Instancia dois objetos tipos contas, 
		// um corrente e outro poupança, adiciona na lista os dois objetos
		ArrayList<Conta> listaContas = new ArrayList<Conta>(2);
		Conta contaCorrente = new Corrente(new Cliente("Lucas 1"));
		Conta contaPoupanca = new Poupanca(new Cliente("Lucas 2"));
		listaContas.add(contaCorrente);
		listaContas.add(contaPoupanca);
		
		// Mostra os dados de cada conta na lista
		for (Conta conta: listaContas) {
			System.out.println(conta);
		}
		
		// Separar informações mostradas no terminal
		System.out.println("---------------------------------");
		
		// Retorna se objeto nos parametros está dentro da lista
		System.out.println("Objeto contaCorrente existe na lista? " + listaContas.contains(contaCorrente));
		Conta contaCorrente2 = contaCorrente;
		System.out.println("Objeto contaCorrente existe na lista? " + listaContas.contains(contaCorrente2));
		
		// Separar informações mostradas no terminal
		System.out.println("---------------------------------");
		
		// Verifica se já existe a conta no paramatro do método isEqual na lista de contas
		Conta contaPoupanca2 = new Poupanca(new Cliente("Teste"));
		for (Conta conta : listaContas) {
			if (conta.isEqual(contaPoupanca2)) {
				System.out.println("Já existe essa conta!");
				break;
			} 
		}
		
		// Verifica se já existe a conta no paramatro do método equals na lista de contas
		Conta contaPoupanca3 = new Poupanca(new Cliente("Teste"));
		listaContas.add(contaPoupanca3);
		for (Conta conta : listaContas) {
			if (conta.equals(contaPoupanca3)) {
				System.out.println("Já existe essa conta!");
				break;
			} 
		}
		
	}
}