package br.com.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TesteCopiaArquivo {

	public static void main(String[] args) throws IOException {
		
		// Iniciando Arquivos de leitura e de escrita
		BufferedReader br = new BufferedReader( new InputStreamReader( new FileInputStream( "Atendimentos RECH.txt" ) ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( new FileOutputStream("Teste.txt")));
		
		String linha = br.readLine();
		
		while (linha != null) {
			
			bw.write(linha);
 			bw.newLine();
 			linha = br.readLine();
		
		}
		
		br.close();
		bw.close();
	}

}
