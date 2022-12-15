package br.com.java.io.teste;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws IOException {

		// Criando um Scanner para ler o arquivo de contas
		Scanner scanner = new Scanner(new File("contas.csv"));

		// Faz um laço para exibir cada linha (hasNextLine
		// testa se tem uma nova linha e retorna true or false
		while (scanner.hasNextLine()) {

			// Colocando a linha em uma variável
			String linha = scanner.nextLine();

			// Novo Scanner para receber a linha e delimitar vírgula
			Scanner linhaScanner = new Scanner(linha);
			
			// Definindo padrão americado para não dar erro no nextDouble pela pontuação
			linhaScanner.useLocale(Locale.US);
			
			// Definindo delimitador de informações como uma vírgula.
			linhaScanner.useDelimiter(",");
			
			// Joga as informações delimitadas em uma nova variável
			String tipoConta = linhaScanner.next();
			int agenciaConta = linhaScanner.nextInt();
			int numeroConta = linhaScanner.nextInt();
			String titularConta = linhaScanner.next();
			double saldoConta = linhaScanner.nextDouble();
			
			// Formatando dados para exibição 
			// Da para definir a quantidade de digitos ou colocar zero conforme abaixo:
			// 07 define o uso de 7 caracteres e preenche com 0 antes
			// 20 define o uso de 20 caracteres e preenche com espaços
			// 10.2f define duas casas depois da virugula e 10 caracteres prenchendo com espaço antes
			String valorFormatado = String.format("%2s - %04d-%07d - %20s - %10.2f", tipoConta, 
					agenciaConta, numeroConta, titularConta, saldoConta);
			
			//Imprime os valores delimitados e fecha o arquivo linhaScanner.
			System.out.println(valorFormatado);
			linhaScanner.close();

			// Parseando essa vareavel onde tem ',' e jogando em um Array
			// Usando o método Arrays para exibir as informações deste Array já parseado
			String[] valores = linha.split(",");
			System.out.println(Arrays.toString(valores));
		}

		scanner.close();
	}

}
