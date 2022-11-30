package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.Corrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class Teste {

	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc = new Corrente(new Cliente("Lucas"));
		
		guardador.adiciona(cc);
		
		for(int i = 0; i < 7; i++) 
			guardador.adiciona( new Corrente(new Cliente("Lucas" + i)));
			
		int tamanho = guardador.getQuantidadeDeElementos();		
		System.out.println("A lista possui: " + tamanho + " elementos.");
		
		Conta ref = guardador.getReferencia(3);
		
		System.out.println("Número da conta: " + ref.getConta());
		
	}

}
