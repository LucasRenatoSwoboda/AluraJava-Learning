package br.com.alura;

import java.util.Objects;

public class Aluno implements Comparable<Aluno> {

	private String nome;
	private int numeroMatricula;

	public Aluno(String nome, int numeroMatricula) {
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	@Override
	public String toString() {
		return "[Aluno: " + this.nome + " - Matrícula: " + this.numeroMatricula + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome) && numeroMatricula == other.numeroMatricula;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nome, numeroMatricula);
	}

	// Implementado para usar a estrutura TreeSet
	@Override
	public int compareTo(Aluno aluno) {
		return this.getNome().compareTo(aluno.getNome());
	}

}
