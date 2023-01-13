package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		ContaInv primeiraConta = new ContaInv(new Titular("Renato", 1958404020, "13/06/1990"), 123, 123456);
		primeiraConta.deposita(200);
		System.out.println("O saldo é: " + primeiraConta.getSaldo());
		primeiraConta.deposita(200);
		System.out.println("O saldo mudou para: " + primeiraConta.getSaldo());
	}
}
