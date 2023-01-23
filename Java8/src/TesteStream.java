import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TesteStream {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// Cursos (nome, quantidade de alunos)
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("Java 8", 133));
		cursos.add(new Curso("JavaScript", 145));
		cursos.add(new Curso("C", 40));
		cursos.add(new Curso("Ruby", 65));

		// Exibir cursos em ordem de aluno ao usuário
		System.out.println("Organiza e exibe cursos em ordem de alunos");
		cursos.sort(Comparator.comparingInt(Curso::getAlunos));
		cursos.forEach(System.out::println);
		System.out.println();

		// Somar os alunos dos cursos com 100 ou mais alunos
		System.out.println("Exibindo a soma de todos os alunos dos cursos que tenham 100 ou mais alunos: ");
		int sum = cursos.stream().filter(c -> c.getAlunos() >= 100).mapToInt(c -> c.getAlunos()).sum();
		System.out.println(sum);
		System.out.println();
		
		//Exibe a média de alunos
		cursos.stream().mapToDouble(Curso::getAlunos).average().ifPresent(valor -> System.out.println("A média de alunos é: " + valor));
		System.out.println();

		// Se existir um elemento válido imprimirá o curso
		System.out.println("Exibindo um elemento com mais de 100 alunos: ");
		cursos.stream().filter(c -> c.getAlunos() >= 1000).findAny().ifPresent(System.out::println);
		cursos.stream().filter(c -> c.getAlunos() >= 100).findAny().ifPresent(System.out::println);
		System.out.println();
		
		// Coletar elementos após filtrar em uma nova List
		System.out.println("Exibindo cursos da List com mais de 100 alunos: ");
		List<Curso> cursosNewList = cursos.stream().filter(c -> c.getAlunos() >= 100).collect(Collectors.toList());
		cursosNewList.forEach(System.out::println);
		System.out.println();

		// Coletar elementos após filtrar em um Map 
		// paralleStream é multitread
		System.out.println("Exibindo cursos do Map com mais de 100 alunos: ");
		Map<String, Integer> cursosNewMap = cursos.parallelStream().filter(c -> c.getAlunos() >= 100)
				.collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()));
		cursosNewMap
				.forEach((cursoNome, alunosCurso) -> System.out.println("Curso: " + cursoNome + " - " + alunosCurso));
		System.out.println();

		// Revisando leitura e escrita de objetos (Exceções / Serialização)
		System.out.println(
				"Exibindo curso serializado em um arquivo binário e depois voltando para o fluxo do programa: ");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("teste.bin"));
		oos.writeObject(cursos.get(0));
		oos.close();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("teste.bin"));
		Curso c1 = (Curso) ois.readObject();
		ois.close();
		System.out.println(c1);

	}

}

class Curso implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3138765461L;
	private String nome;
	private int alunos;

	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return this.nome;
	}

	public int getAlunos() {
		return this.alunos;
	}

	@Override
	public String toString() {
		return "Curso: " + getNome() + " - " + getAlunos();
	}

}