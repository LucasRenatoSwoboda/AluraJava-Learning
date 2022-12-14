package br.com.bytebank.banco.test.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import br.com.bytebank.banco.modelo.Corrente;
import br.com.bytebank.banco.modelo.Poupanca;

public class TesteDeserializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		// Cria objeto para ler o arquivo e gravar em um novo objeto do tipo conta
		// Imprime os dados desse objeto
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream ("cc.bin"));
		Corrente cc1 = (Corrente) ois.readObject(); 
		System.out.println(cc1.toString());
		ois.close();
		
		ObjectInputStream oisPoupanca = new ObjectInputStream(new FileInputStream ("cp.bin"));
		Poupanca cp1 = (Poupanca) oisPoupanca.readObject();
		System.out.println(cp1.toString());
		oisPoupanca.close();
		
	}

}
