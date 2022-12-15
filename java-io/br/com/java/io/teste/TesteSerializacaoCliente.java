package br.com.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;

public class TesteSerializacaoCliente {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

//		// Cria um objeto cliente
//		Cliente cliente = new Cliente("Renato");
//		cliente.setCpf("01958404020");
//		cliente.setDatNasc("13/06/1990");
//
//		// Cria objeto que cria um arquivo e passa o objeto cliente para esse arquivo
//		// binário
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Arquivo_Cliente.bin"));
//		oos.writeObject(cliente);

		// Cria objeto para abrir o arquivo e passa o objeto cliente do arquivo para um
		// referencia
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Arquivo_Cliente.bin"));
		Cliente clienteRetorno = (Cliente) ois.readObject();

		// Imprime o nome para confirmar que o objeto retornou para essa nova referência
		System.out.println(clienteRetorno.getNome());

		// Fecha todos os objetos de I/O
//		oos.close();
		ois.close();

	}

}
