package br.com.alura;

public class Aula implements Comparable<Aula> {

	// Atributos da classe Aula
	private String titulo;
	private int tempo;

	// Construtor
	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}

	// Métodos Getters
	public String getTitulo() {
		return titulo;
	}

	public int getTempo() {
		return tempo;
	}

	// Sobreescrita método toString
	@Override
	public String toString() {
		String retorno = String.format("[ Aula: %s - Tempo: %d minutos ]", getTitulo(), getTempo());
		return retorno;
	}

	// Método da Interface Comparable para comparar uma classe Aula
	@Override
	public int compareTo(Aula outraAula) {
		return getTitulo().compareTo(outraAula.getTitulo());
	}
	
}
