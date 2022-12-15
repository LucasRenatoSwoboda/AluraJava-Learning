package br.com.alura;

public class TestaCurso {

	public static void main(String[] args) {
		
		Curso javaCollections = new Curso ("Documento as coleções do Java", "Paulo Silveira");
		javaCollections.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaCollections.adiciona(new Aula("Criando uma aula", 20));
		javaCollections.adiciona(new Aula("Modelando Coleções", 22));
		
		System.out.println(javaCollections.getAulas());

		
		
	}

}
