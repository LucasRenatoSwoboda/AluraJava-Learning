
public class FluxoComTratamento {

		public static void main(String[] args) {
			System.out.println("Ini do main");
				metodo1();
			System.out.println("Fim do main");
		}
	
		public static void metodo1() {
			System.out.println("Ini do metodo1");
			try {
				metodo2();
			} catch (Exception ex) {
				//String msg = ex.getMessage();
				//System.out.println("ArithmeticException " + msg);
				// ArithmeticException é uma classe
				ex.printStackTrace();
			} 
				
			System.out.println("Fim do metodo1");
		}
		
		public static void metodo2() {
			System.out.println("Ini do metodo2");
			for (int i = 1; i <= 5; i++) {
				System.out.println(i);
				// Aprendendo exceções
//				try {
				int a = i / 0;
//				Conta c = null;
//				c.deposita();
//				} catch (ArithmeticException ex) {
//					System.out.println("ArithmeticException = " + ex);
//				}
			}
			System.out.println("Fim do metodo2");
		}
		
}
