package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TesteAlunos {

	public static void main(String[] args) {

		// Set é um conjunto 
		Set<String> alunos = new HashSet<>();
		alunos.add("Rodrigo Arg");
		alunos.add("Alberto Souza");
		alunos.add("Nico Ste");
		alunos.add("Renan Liz");
		alunos.add("Lucas Renato");
		alunos.add("Lucas Renato");
		
		
		// ForEach
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		// ForEach Lambda
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		
		System.out.println(alunos);
		
	}
	
}
