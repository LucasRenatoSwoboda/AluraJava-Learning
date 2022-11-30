package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Corrente;
import br.com.bytebank.banco.modelo.Poupanca;

public class TesteObject {

	public static void main(String[] args) {

		System.out.println("x");
		System.out.println(3);
		System.out.println(false);

		Corrente cc = new Corrente(new Cliente("Lucas"));
		Poupanca cp = new Poupanca(new Cliente("Lucas"));

		println(cc);

		System.out.println(cc);
		System.out.println(cp);

	}

	static void println() {
	}

	static void println(int num) {
	}

	static void println(boolean logico) {
	}

	static void println(Object ref) {
	}
}
