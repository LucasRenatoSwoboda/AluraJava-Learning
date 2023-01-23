package br.com.alura.threadsbusca;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TarefaBucaTextual implements Runnable {

	private String nomeBusca;
	private String nomeArquivo;

	public TarefaBucaTextual(String nomeArquivo, String nomeBusca) {
		this.nomeArquivo = nomeArquivo;
		this.nomeBusca = nomeBusca;
	}

	@Override
	public void run() {
		try {
			Scanner scanner = new Scanner(new File(nomeArquivo));
			int numLinha = 1;
			while (scanner.hasNextLine()) {
				String linha = scanner.nextLine();
				if (linha.toLowerCase().contains(nomeBusca.toLowerCase())) {
					System.out.println("Encontrado no arquivo: " + nomeArquivo +
							" - " + linha + " - linha nº <" + numLinha + ">");
				}
				numLinha++;
			}

			scanner.close();
		} catch (FileNotFoundException e) {
		new RuntimeException(e);
			e.printStackTrace();
		}
	}

}
