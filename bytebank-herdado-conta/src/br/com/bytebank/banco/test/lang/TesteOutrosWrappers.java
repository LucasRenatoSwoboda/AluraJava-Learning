package br.com.bytebank.banco.test.lang;

public class TesteOutrosWrappers {

	public static void main(String[] args) {
		
		/**
		 * Entendendo mais unboxing e autoboxing
		 */
		
		// Com a classe Integer
		Integer idadeRef = Integer.valueOf(29); 	//AUTOBOXING transforma um primitivo em referência
		System.out.println(idadeRef.intValue()); 	//UNBOXING 	 transforma a referencia em primitivo
		
		// Com a classe Double
		Double dRef = Double.valueOf(3.2); 			//AUTOBOXING transforma um primitivo em referência
		System.out.println(dRef.doubleValue());		//UNBOXING 	 transforma a referencia em primitivo
		
		// Com a classe Boolean
		Boolean trueRef = Boolean.TRUE;				//AUTOBOXING transforma um primitivo em referência
		System.out.println(trueRef.booleanValue());	//UNBOXING 	 transforma a referencia em primitivo
		
	}

}
