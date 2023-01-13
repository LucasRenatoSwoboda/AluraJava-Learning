package br.com.alura;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TesteOrdenaFuncionarios {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario("Lucas", 32);
		Funcionario f2 = new Funcionario("Bernardo", 8);
		Funcionario f3 = new Funcionario("Joaquim", 4);
		Funcionario f4 = new Funcionario("Jéssica", 28);
		Funcionario f5 = new Funcionario("Ohana", 7);

		Set<Funcionario> funcionarios = new TreeSet<>(new OrdenadorPorIdade());
		
		funcionarios.add(f1);
		funcionarios.add(f2);
		funcionarios.add(f3);
		funcionarios.add(f4);
		funcionarios.add(f5);
		
		Iterator<Funcionario> iterador = funcionarios.iterator();
		
		while (iterador.hasNext())
			System.out.println(iterador.next());
		
	}

}
