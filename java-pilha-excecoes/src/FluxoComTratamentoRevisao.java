
public class FluxoComTratamentoRevisao {

	public static void main(String [] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch (MinhaExcecaoRevisao ex) {
			ex.printStackTrace();
		}
		System.out.println("Fim do main");
	}
	
	public static void metodo1() throws MinhaExcecaoRevisao {
		System.out.println("Ini do método 1");
		metodo2();
		System.out.println("Fim do método 1");
	}
	
	public static void metodo2() throws MinhaExcecaoRevisao {
		System.out.println("Ini do método 2");
		throw new MinhaExcecaoRevisao("Erro - Minha Exceção");
		
		//System.out.println("Fim do método 2");
	}
	
}
