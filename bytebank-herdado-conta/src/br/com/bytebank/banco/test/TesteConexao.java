package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conexao;

public class TesteConexao {

	public static void main(String[] args) {

		try (Conexao con = new Conexao()) {
			con.leDados();
		} catch (IllegalStateException ex) {
			System.out.println("Deu erro na conexão..");
		}

//		Conexao con = null;

		// finally sempre será executado entrando no try ou no catch

//		try {
//			con = new Conexao();
//			con.leDados();
//		}catch (IllegalStateException ex) {
//			System.out.println("Deu erro na conexão..");
//		} finally {
//			con.fecha();
//		}

	}

}
