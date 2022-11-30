package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.Corrente;
import br.com.bytebank.banco.modelo.Poupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		Conta[] contas = new Conta[5];

		Corrente cc1 = new Corrente(new Cliente("Lucas 1"));
		Poupanca cp1 = new Poupanca(new Cliente("Lucas 2"));

		contas[0] = cp1;
		contas[1] = cc1;
		
		Poupanca ref = (Poupanca) contas[0];
		
		System.out.println(ref.toString());
		System.out.println(cc1.toString());
		
		Object [] referencias = new Object[5];
		
		referencias[0] = cp1;
		referencias[1] = new Cliente("Teste");
		referencias[2] = 5;
		referencias[3] = "String";
		referencias[4] = true;
		
		try {
			System.out.println(((Poupanca)referencias[1]).getTitular().getNome());
		}catch(Exception ex) {
			ex.printStackTrace();
		}
			
		
//		for (int i = 0; i < contas.length; i++ ) {
//			contas[i] = new Corrente(new Cliente("Lucas" + i));
//		}
//		
//		for (Conta corrente : contas) {
//			System.out.println(corrente.toString() + " Cliente: " + corrente.getTitular().getNome());
//		}

	}

}
