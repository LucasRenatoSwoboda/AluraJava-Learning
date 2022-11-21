
public class FluxoRevisao {

	public static void main(String [] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException ex) {
			ex.printStackTrace();
		}
		System.out.println("Fim do main");
	}
	
	public static void metodo1() {
		System.out.println("Ini do método 1");
		metodo2();
		System.out.println("Fim do método 1");
	}
	
	public static void metodo2()  {
		System.out.println("Ini do método 2");
		 
		throw new ArithmeticException("Mensagem de ERRO");
		//System.out.println("Fim do método 2");
	}
	
}
