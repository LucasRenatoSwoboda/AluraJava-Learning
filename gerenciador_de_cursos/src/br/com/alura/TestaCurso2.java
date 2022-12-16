package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		
		// Criando um Curso que possuí uma lista de aulas
		Curso javaCollections = new Curso ("Documentando as coleções do Java", "Paulo Silveira");
		javaCollections.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaCollections.adiciona(new Aula("Criando uma aula", 20));
		javaCollections.adiciona(new Aula("Modelando Coleções", 22));

		// Criando uma lista de aulas imutaveis e uma lista de aulas mutaveis
		List<Aula> aulasImutaveis = javaCollections.getAulas();
		List<Aula> aulas = new ArrayList<> (aulasImutaveis);
		
		// Imprimindo as aulas imutáveis que não podem passar pelo método sort para ordenação
		System.out.println(aulasImutaveis);
	
		// Ordenando aulas mutáveis e imprimindo na nova ordem.
		Collections.sort(aulas);	
		System.out.println(aulas);
	
		System.out.println(javaCollections.getTempoTotal());
		
		System.out.println(javaCollections);
		
	}

}
