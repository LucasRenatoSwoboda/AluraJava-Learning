package br.com.bytebank.banco.test.lang;

public class TesteConstantesClassesWrapper {

	public static void main(String[] args) {
		
		/**
		 * Constantes das classes Wrapper 
		 */
		
		/**
		 * Integer
		 */
		
		// Valores possíveis armazenados em um Integer.
		System.out.println("Valor máximo de um int: " + Integer.MAX_VALUE);
		System.out.println("Valor minímo de um int: " + Integer.MIN_VALUE);
		
		// Quantidade de bytes e bits de um Integer
		System.out.println(Integer.BYTES + " bytes");
		System.out.println(Integer.SIZE + " bits");
		
		/**
		 * Double
		 */
		
		// Valores possíveis e elevações possíveis.
		System.out.println("Expoente máximo: " + Double.MAX_EXPONENT);
		System.out.println("Expoente minímo: " + Double.MIN_EXPONENT);
		System.out.println("Valor máximo: " + Double.MAX_VALUE);
		System.out.println("Valor mínimo: " + Double.MIN_VALUE);
		System.out.println("" + Double.MIN_NORMAL);
		
		// Quantidade de bytes e bits de um Double
		System.out.println(Double.BYTES + " bytes");
		System.out.println("" + Double.SIZE + " bits");
		
		// NaN = Not a number
		System.out.println("" + Double.NaN);
		
		// Infinitos positivos e negativos
		System.out.println("" + Double.NEGATIVE_INFINITY);
		System.out.println("" + Double.POSITIVE_INFINITY);
		
	}

}
