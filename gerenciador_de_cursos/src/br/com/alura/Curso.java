package br.com.alura;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {

	// Atributos do curso
	public String nome;
	public String instrutor;
	List<Aula> aulas = new LinkedList<Aula>();

	// Construtor
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	
	// Métodos Getters
	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	//Getter para lista de aula imutável
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	// Método para adicionar aula
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	// Método para retornar o tempo de todas as aulas
	public int getTempoTotal() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}

	@Override
	public String toString() {
		return "[Curso: " + this.getNome() + " - tempo total: " + this.getTempoTotal() + " - aulas: " + this.getAulas()
				+ "]";
	}

}
