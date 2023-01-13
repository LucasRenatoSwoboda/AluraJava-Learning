package br.com.alura;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

	// Atributos do curso
	private String nome;
	private String instrutor;
	List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

	// Construtor
	public Curso(String nome, String instrutor) {
		if (nome == null)
			throw new NullPointerException("Nome não pode ser nulo");
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

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	// Getter para lista de aula imutável
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

	// Método para matricular aluno
	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}

	// Compara se o aluno está matrículado
	public boolean estaMatriculado(Aluno a1) {
		return this.alunos.contains(a1);
	}

	// Busca o matrículado pelo número da matrícula (Sem MAP)
	public Aluno buscaMatriculado(int matricula) {
		for (Aluno aluno : alunos) {
			if (aluno.getNumeroMatricula() == matricula)
				return aluno;
		}
		throw new NoSuchElementException("Matrícula não encontrada!");
	}

	// Busca o matrículado para o número da matrícula (Com MAP)
	public Aluno buscaMatriculadoComMap(int numeroMatricula) {
		if (!matriculaParaAluno.containsKey(numeroMatricula))
			throw new NoSuchElementException("Aluno não encontrado!");
		return matriculaParaAluno.get(numeroMatricula);
	}
	
}
