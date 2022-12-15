package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * Classe representa um cliente
 * 
 * @author lucas
 * @version 1.0
 */

// Dados dos clientes (Testando formatações diferentes de código para melhor visualização)

public class Cliente implements Serializable {
	
	private static final long serialVersionUID = 193417458509485772L;
	
	// Atributos de um cliente
	private String nome;
	private String cpf;
	private String datNasc;

	// Construtor
	public Cliente(String nome) {
		this.nome = nome;
		this.cpf = "000.000.000-00";
		this.datNasc = "00/00/0000";
	}

	public String getNome() {
		return this.nome;
	}

	public String getCpf() {
		String newCpf = formataCPF(this.cpf);
		return newCpf;
	}

	public String formataCPF(String cpf) {
		char cpfC[] = new char[14];

		for (int c = 0; c < 14; c++) {
			if (c == 3 || c == 7)
				cpfC[c] = '.';
			if (c == 11)
				cpfC[c] = '-';
			if (c == 0 || c == 1 || c == 2)
				cpfC[c] = cpf.charAt(c);
			if (c == 4 || c == 5 || c == 6)
				cpfC[c] = cpf.charAt(c - 1);
			if (c == 8 || c == 9 || c == 10)
				cpfC[c] = cpf.charAt(c - 2);
			if (c == 12 || c == 13)
				cpfC[c] = cpf.charAt(c - 3);
		}

		String newCpf = "";

		for (int i = 0; i < 14; i++) {
			newCpf += cpfC[i];
		}

		return newCpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setDatNasc(String datNasc) {
		this.datNasc = datNasc;
	}

}
