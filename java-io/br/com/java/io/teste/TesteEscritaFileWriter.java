package br.com.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {

		// FileWriter escreve direto no arquivo sem a necessidade de um OutputStream
		// FileWriter fw = new FileWriter("Teste.txt"); 
		BufferedWriter bw = new BufferedWriter(new FileWriter("Teste.txt"));
		
//		Poderiamos usar direto a referência de FileWriter para escrever no arquivo conforme abaixo:
//		fw.write("Linha Um");
//		fw.write(System.lineSeparator()); 	// Nova Linha
//		fw.write("Linha Dois\r\n"); 		// \r\n no Windows também pula linha na escrita. 
//		fw.write("Linha Três");
		 
		// Usando BufferedWriter para escrever no arquivo
		bw.write("Linha UM com BufferedWriter");
		bw.newLine();
		bw.write("Linha DOIS com BufferedWriter");
		
		// Fechando o arquivo
		bw.close();
		
	}

}
