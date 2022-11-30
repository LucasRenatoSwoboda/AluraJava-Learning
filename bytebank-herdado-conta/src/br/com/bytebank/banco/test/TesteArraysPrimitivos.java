package br.com.bytebank.banco.test;

public class TesteArraysPrimitivos {

	public static void main(String[] args) {

		int idades[] = new int[5];
		idades[0] = 5;
		idades[3] = 2;
		idades[4] = 31;
		idades[2] = 25;
		idades[1] = 20;

//		System.out.println(idades[3]);
//		System.out.println(idades.length);

		for (int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
		}

		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}

	}

}
