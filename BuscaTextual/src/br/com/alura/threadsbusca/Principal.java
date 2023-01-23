package br.com.alura.threadsbusca;

/**
 * Busca o nome da váriavel nos arquivos lidos.
 * @author lucas
 *
 */

public class Principal {

	public static void main(String[] args) {

		String nome = "Jef";

		Thread threadAssinaturas1 = new Thread(new TarefaBucaTextual("assinaturas1.txt", nome));
		Thread threadAssinaturas2 = new Thread(new TarefaBucaTextual("assinaturas2.txt", nome));
		Thread threadAutores = new Thread(new TarefaBucaTextual("autores.txt", nome));
		
		threadAssinaturas1.start();
		threadAssinaturas2.start();
		threadAutores.start();
		
	}

}
