package br.com.alura.threads;

public class RunPrintStg {

	public static void main(String[] args) {
		
		Runnable imprime = new ImprimeString("Esse é a mensagem da Thread!");
		Thread threadImprime = new Thread(imprime, "Nome Da Thread Imprime");
		
		threadImprime.start();
			
	}

}
