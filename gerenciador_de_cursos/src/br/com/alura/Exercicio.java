package br.com.alura;

import java.util.HashMap;
import java.util.Map;

public class Exercicio {

	public static void main(String [] args) {
		
		Map<Integer, String> pessoas = new HashMap<>();	
		
		pessoas.put(1, "Lucas Renato");
		pessoas.put(2, "Jéssica Oliveira");
		pessoas.put(3, "Bernardo Renato");
		pessoas.put(4, "Ohana Manuela");
		pessoas.put(5, "Joaquim Henrique");
		
		pessoas.keySet().forEach(pessoa -> {
			System.out.println(pessoas.get(pessoa));
		});
		
	}
	
}
