package br.com.alura.threadscontador;

public class Contador implements Runnable {

	
	/**
	 * Imprime de 1 à 1000 quebrando a linha quando o valor for múltiplo de 3
	 */
	@Override
	public void run() {
		for (int i = 1; i <= 1000; i++) {
			System.out.print("<ID: " + Thread.currentThread().getId() + " = " + i + ">   ");
			if ((i % 3) == 0)
				System.out.println();
		}

	}

}
