package bytebank;

public class TesteMetodo {

	public static void main(String[] args) {
		ContaInv contaDoPaulo = new ContaInv(new Titular("Paulo", 1958404020, "13/06/1990"));
		contaDoPaulo.deposita(100);
		contaDoPaulo.deposita(50);
		System.out.println("O saldo atual é: " + contaDoPaulo.getSaldo());
		contaDoPaulo.saca(100);
		System.out.println("O saldo atuel é: " + contaDoPaulo.getSaldo());
		contaDoPaulo.saca(100);

	}
}