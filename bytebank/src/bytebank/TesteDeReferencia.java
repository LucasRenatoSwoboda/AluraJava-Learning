package bytebank;

public class TesteDeReferencia {

	public static void main(String[] args) {

		ContaInv primConta = new ContaInv(new Titular("Lucas", 1958404020, "13/06/1990"));
		primConta.deposita(200);

		// primConta é uma referência a um objeto do tipo conta.

	}

}
