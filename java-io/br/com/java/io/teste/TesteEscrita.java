package br.com.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {

		// Fluxo de escrita usando classes Outputs e Writers
		OutputStream fos = new FileOutputStream("Atendimentos RECH2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		// Escrevendo no arquivo e fechando
		bw.write("Teste de escrita");
		bw.newLine(); // Cria nova linha para escrita
		bw.newLine(); // Cria nova linha para escrita
		bw.write("Teste2");
		bw.close();

		// Criando um BufferedWriter sem usar referências nas outras classes.
		BufferedWriter bw2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Teste.txt")));
		bw2.write("Teste");
		bw2.close();

	}

}
