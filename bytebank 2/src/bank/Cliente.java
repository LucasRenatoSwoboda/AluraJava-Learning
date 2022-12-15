package bank;

// Dados dos clientes (Testando formatações diferentes de código para melhor visualização)
public class Cliente {
	private String nome;
	private String cpf;
	private String datNasc;

	public Cliente(String nome, String cpf, String dataNasc) {
		this.nome = nome;
		this.cpf = cpf;
		this.datNasc = dataNasc;
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

}
