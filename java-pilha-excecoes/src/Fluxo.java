
public class Fluxo {

		public static void main(String[] args) {
			System.out.println("Ini do main");
				metodo1();
			System.out.println("Fim do main");
		}
	
		public static void metodo1() {
			System.out.println("Ini do metodo1");
			try {
				metodo2();
			} catch (ArithmeticException | NullPointerException | MinhaExcecao | MinhaExcecao2 ex) {
				//String msg = ex.getMessage();
				//System.out.println("ArithmeticException " + msg);
				// ArithmeticException é uma classe
				System.out.println(ex.getMessage());
				ex.printStackTrace();
			} 
				
			System.out.println("Fim do metodo1");
		}
		
		public static void metodo2() throws MinhaExcecao2{
			System.out.println("Ini do metodo2");
			
			throw new MinhaExcecao2("Minha Excessão gerou erro");			
			
			//System.out.println("Fim do metodo2");
		}
}
