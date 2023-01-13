package br.com.bytebank.banco.test.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Corrente;
import br.com.bytebank.banco.modelo.Poupanca;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException {
		
		// Cria Objeto do tipo cliente
		Cliente cliente = new Cliente("Renato");
		cliente.setCpf("01901901919");
		cliente.setDatNasc("31/01/1971");
	
		// Cria Objeto do tipo conta e passa o cliente
		Corrente cc1 = new Corrente(cliente);
		cc1.depositar(250);
				
		// Cria arquivo para gravar esse objeto
		ObjectOutputStream oosCorrente = new ObjectOutputStream (new FileOutputStream ("cc.bin"));
		oosCorrente.writeObject(cc1);		
		oosCorrente.close();
		
		Poupanca cp1 = new Poupanca(new Cliente("Renato"));
		cp1.depositar(290);
		ObjectOutputStream oosPoupanca = new ObjectOutputStream (new FileOutputStream ("cp.bin"));
		oosPoupanca.writeObject(cp1);
		oosPoupanca.close();
		
	}

}
