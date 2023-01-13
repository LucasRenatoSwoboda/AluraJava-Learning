package bytebank;

public class TesteContaInv {

	public static void main(String[] args) {

		Titular titular = new Titular("Renato", 1958404020, "13/06/1990");
		
		ContaInv conta = new ContaInv(titular);
		
		conta.deposita(500);
		
		System.out.println(conta.getSaldo());
		
	}

}