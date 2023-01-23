package br.com.alura.threads;

public class ImprimeString implements Runnable {

	String stg;
	
	public ImprimeString(String stg) {
		this.stg = stg;
	}
	
	@Override
	public void run() {
		System.out.println(stg);		
	}
	
}