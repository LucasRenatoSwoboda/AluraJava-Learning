package br.com.alura;

import java.util.Comparator;

public class OrdenadorPorIdade implements Comparator<Funcionario> {

	@Override
	public int compare(Funcionario f1, Funcionario f2) {
		return Integer.compare(f1.getIdade(), f2.getIdade());
	}

}
