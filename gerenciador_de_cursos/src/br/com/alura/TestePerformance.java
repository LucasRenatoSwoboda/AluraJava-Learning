package br.com.alura;

import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;

public class TestePerformance {

	public static void main(String[] args) {
		
		// Coleção para testar a diferença de desempenho de HashSet e ArrayList
		Collection<Integer> numeros = new HashSet<Integer>(); // Trocar entre: HashSet <-> ArrayList 
		
		// Iniciar contagem da inclusão
		long inicioInclusao = System.currentTimeMillis();
		
		// Adicionar elementos na coleção
		for (int i = 0; i <= 100000 ; i++) {
			numeros.add(i);
		}
		
		// Termino da contagem da inclusão
		long fimInclusao = System.currentTimeMillis();
		
		// Imprime resultado do desempenho Inclusão
		System.out.println("Tempo para inclusão: " + (fimInclusao - inicioInclusao) + " milisegundos");
		
		// Inicia contagem de pesquisa/busca
		long inicioBusca = System.currentTimeMillis();
		
		// Inicia busca
		numeros.forEach(numero -> {
			numeros.contains(numero);
		});
		
		// Termino da contagem da busca
		long fimBusca = System.currentTimeMillis();
		
		// Imprime resultado da busca de resultado total de desempenho
		System.out.println("Tempo para pesquisa: " +(fimBusca - inicioBusca) + " milisegundos");
		System.out.println("Tempo total das duas operações: " + ( (fimBusca - inicioBusca) + (fimInclusao - inicioInclusao) ) + " milisegundos");
		
	}

}
