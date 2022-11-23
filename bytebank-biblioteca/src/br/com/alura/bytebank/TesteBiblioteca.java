package br.com.alura.bytebank;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Corrente;

public class TesteBiblioteca {

	public static void main(String[] args) {
		
		Corrente cc = new Corrente(new Cliente("Lucas"));
		
		cc.depositar(500);
		
		System.out.println(String.format("Saldo R$ %.2f", cc.getSaldo()));
		
	}

}
