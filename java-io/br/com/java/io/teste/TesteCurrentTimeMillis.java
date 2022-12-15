package br.com.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteCurrentTimeMillis {

	public static void main(String[] args) throws IOException {

		// Cria variável para guardar o milisegundo inicial de processamento 
		// Ao executar essa linha, recebemos os milissegundos que passaram
		// desde 1 de janeiro de 1970
		long ini = System.currentTimeMillis();

		// Abre arquivo para leitura e escrita
		BufferedReader lerArquivo = new BufferedReader(
				new InputStreamReader(new FileInputStream("Atendimentos RECH.txt")));
		BufferedWriter escreverArquivo = new BufferedWriter(new FileWriter("Arquivo copiado.txt"));
		
		
		// Processo de cópia de um arquivo para outro
		String linha = lerArquivo.readLine();
		while (linha != null) {
			escreverArquivo.write(linha);
			escreverArquivo.newLine();
			linha = lerArquivo.readLine();
		}
		
		// Fechando arquivos
		lerArquivo.close();
		escreverArquivo.close();
	
		// Encerrando o contador de milisegundos
		long fim = System.currentTimeMillis();
		
		// Imprimindo o tempo de processamento em milisegundos
		System.out.println("Tempo de execução: " + (fim-ini) + " milisegundos");
		
	}

}
