package br.com.alura;

public class TestaBuscaAlunosNoCurso {

	public static void main(String[] args) {
		// Criando um curso
		Curso javaCollections = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		
		// Criando aulas do curso
		javaCollections.adiciona(new Aula("Listas", 35));
		javaCollections.adiciona(new Aula("ArrayList", 32));
		javaCollections.adiciona(new Aula("Set", 45));
		javaCollections.adiciona(new Aula("HashSet", 25));
		javaCollections.adiciona(new Aula("TreeSet", 21));
		
		// Criando alunos do curso
		Aluno a1 = new Aluno("Lucas", 3157687);
		Aluno a2 = new Aluno("Jessica", 6656463);
		Aluno a3 = new Aluno("Bernardo", 6518898);
		Aluno a4 = new Aluno("Ohana", 95930);
		Aluno a5 = new Aluno("Joaquim", 368318);
		
		// Matriculando alunos
		javaCollections.matricula(a1);
		javaCollections.matricula(a2);
		javaCollections.matricula(a3);
		javaCollections.matricula(a4);
		javaCollections.matricula(a5);
		
		// Buscando alunos com métodos que buscam pela matricula com Map e sem Map
		Aluno aluno = javaCollections.buscaMatriculado(6518898);
		System.out.println(aluno);
		Aluno alunoBusca = javaCollections.buscaMatriculadoComMap(31576879);
		System.out.println(alunoBusca);
	}
	
}
