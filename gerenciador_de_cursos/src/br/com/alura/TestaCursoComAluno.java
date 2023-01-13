package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		// Criando um Curso que possuí uma lista de aulas
		Curso javaCollections = new Curso("Documentando as coleções do Java", "Paulo Silveira");
		javaCollections.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaCollections.adiciona(new Aula("Criando uma aula", 20));
		javaCollections.adiciona(new Aula("Modelando Coleções", 22));

		// Criando alunos e inserindo estes na coleção de alunos no curso
		Aluno a1 = new Aluno("Lucas", 123456);
		Aluno a2 = new Aluno("Renato", 654321);
		Aluno a3 = new Aluno("Swoboda", 156431);
		javaCollections.matricula(a1);
		javaCollections.matricula(a2);
		javaCollections.matricula(a3);

		// Imprime alunos matrículados:
		System.out.println("Todos os alunos matriculados no curso: ");
		javaCollections.getAlunos().forEach(aluno -> {
			System.out.println(aluno);
		});

		// Testa se aluno a1 está matrículado
		System.out.println("O aluno " + a1 + " está matrículado? ");
		System.out.println(javaCollections.estaMatriculado(a1) ? "Sim" : "Não");

		// Cria novo aluno, e testa se o mesmo está matriculado
		// Para funcionar foi necessário Sobreescrever o método equals e hashCode na
		// classe aluno
		Aluno alunoBusca = new Aluno("Lucas", 123456);
		System.out.println("O aluno da busca: " + alunoBusca.getNome() + " está matrículado? "
				+ (javaCollections.estaMatriculado(alunoBusca) ? "Sim" : "Não"));

		// Em versões antigas do Java se usava o iterador para passar por todos
		// os elementos de uma coleção, pois não existia o método forEach.
		Set<Aluno> alunos = javaCollections.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();

		// Enquando houver próximo aluno (hasNext retorna se tem mais um elemento)
		// next retorna o próximo elemento
		while (iterador.hasNext())
			System.out.println(iterador.next());

	}

}
