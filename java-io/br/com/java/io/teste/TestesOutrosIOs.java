package br.com.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class TestesOutrosIOs {

	public static void main(String[] args) throws IOException {

		/**
		 * Lendo informações do teclado e do console e reescrevendo no console usando 
		 * bibliotecas de baixo nível.
		 */
		
		// Lendo entrada dos consoles com System.in
		BufferedReader brc = new BufferedReader(new InputStreamReader(System.in));
		// Escrevendo no console com Syste.out
		BufferedWriter bwc = new BufferedWriter(new OutputStreamWriter(System.out));
		String linha = brc.readLine();
		while (linha != null && !linha.isEmpty()) {
			bwc.write(linha);
			bwc.newLine(); 
			bwc.flush(); //Libera as informações do buffer (Não retem a informação)
			linha = brc.readLine();
		}
		brc.close();
		bwc.close();
		
		/**
		 * Lendo e enviando informações na rede
		 */
		
		
		// APENAS EXEMPLO, NÃO FUNCIONARÁ
		// Socket s = new Socket();
		// BufferedReader brr = new BufferedReader( new InputStreamReader ( s.getInputStream() ));
		// BufferedWriter bwr = new BufferedWriter( new OutputStreamWriter ( s.getOutputStream() ));
	}

}
