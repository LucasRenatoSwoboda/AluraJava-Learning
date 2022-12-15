package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {

		// Criando objetos String
		String aula1 = "Conhecendo Mais de Listas";
		String aula2 = "Modelando a Classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";

		// Criando ArrayList de Strings e adiciona as aulas
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		// Imprime aulas
		System.out.println(aulas);

		// Remove a primeira aula
		aulas.remove(0);

		// Imprimindo todas as aulas em um foreach
		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}

		// Pegando uma informação da Array pelo indice e imprimindo
		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula é: " + primeiraAula);

		// Usando for com iterador i
		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("Aula: " + aulas.get(i));
		}

		// Usando lambda forEach da ArrayList
		aulas.forEach(aula -> {
			System.out.println("Aula: " + aula);
		});

		// Colocando nova aula para testar ordenação com Collections
		aulas.add("Aumentando Nosso Conhecimento");
		Collections.sort(aulas);
		
		// Usando lambda forEach para imprimir as aulas ordenadas
		aulas.forEach(aula ->{
			System.out.println("Aula: " + aula);
		});
		
	}

}
