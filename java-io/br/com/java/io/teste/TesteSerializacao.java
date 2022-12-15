package br.com.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// Criando um objeto String
		// Criando um arquivo para salvar em hd um arquivo binario de dados
		// Passando o Objeto String para o arquivo binário.
		// Fechando o arquivo.
		String nome = "Lucas Swoboda";
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
		oos.writeObject(nome);
		oos.close();

		//
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		String nomeRetornado = (String) ois.readObject();
		ois.close();
		System.out.println(nomeRetornado);
		
	}

}
