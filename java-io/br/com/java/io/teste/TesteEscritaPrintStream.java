package br.com.java.io.teste;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class TesteEscritaPrintStream {

	public static void main(String[] args) throws IOException {

		// Criando arquivo para escrita 
		//PrintStream ps = new PrintStream("Teste.txt");
		PrintStream ps = new PrintStream( new File("TesteEscritaPrintWriter.txt"));
		
		// Escrevendo dados no arquivo
		ps.println("Linha UM");
		ps.println();
		ps.print("Linha DOIS");
		
		// Fechando arquivo
		ps.close();
		
	}

}
