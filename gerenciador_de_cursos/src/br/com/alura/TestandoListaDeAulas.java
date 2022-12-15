package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestandoListaDeAulas {

	public static void main(String[] args) {
		
		//
		Aula aula1 = new Aula("Revisando ArrayList", 20);
		Aula aula2 = new Aula("Listas de Objetos", 21);
		Aula aula3 = new Aula("Relacionamento de Listas e Objetos", 22);
		ArrayList<Aula> aulas = new ArrayList<>();
		
		//
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		//
		System.out.println(aulas);
		
		//
		Collections.sort(aulas);
		
		//
		aulas.forEach(aula -> {
			System.out.println(aula);
		});
		
		//
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);

		//
		aulas.sort(Comparator.comparing(Aula::getTitulo));
		System.out.println(aulas);
		
	}

}
