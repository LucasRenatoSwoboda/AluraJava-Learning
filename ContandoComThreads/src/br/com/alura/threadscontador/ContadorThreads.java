package br.com.alura.threadscontador;

/**
 * Cria dois contadores paralelos para ver a diferença na execução entre as Threads
 * @author lucas
 *
 */

public class ContadorThreads {

	public static void main(String[] args) {
		
		Thread contador1 = new Thread(new Contador());
		Thread contador2 = new Thread(new Contador());

		contador1.start();
		contador2.start();
		
	}

}
