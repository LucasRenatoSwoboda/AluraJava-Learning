package br.com.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {

		// Classe que recebe o arquivo
		InputStream fis = new FileInputStream("Atendimentos RECH.txt");

		// Classe que converte o arquivo inicial em um InputStremReader
		Reader isr = new InputStreamReader(fis);

		// Classe que conforme o InputStreamReader em um BefferedReader
		BufferedReader br = new BufferedReader(isr);

		// Imprime na tela a primeira linha com o método da classe BufferedReader =>
		// readLine
		System.out.println(br.readLine());

		// Laço para ler todas as linhas do arquivo
		String linha = br.readLine();
		while(linha != null) {
			System.out.println(linha);
			linha = br.readLine(); // linha recebe a próxima linha
		}
		
		// Fecha o arquivo em leitura.
		br.close();

		// Uma forma de melhorar (visão pessoal não da aula) Criando objetos diretos sem
		// referências.
		BufferedReader br2 = new BufferedReader(new InputStreamReader(new FileInputStream("Atendimentos RECH.txt")));
		System.out.println(br2.readLine());
		br2.close();
		
		
		
	}

}
