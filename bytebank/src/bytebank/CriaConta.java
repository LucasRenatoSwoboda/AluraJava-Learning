package bytebank;

public class CriaConta {
	public static void main (String [] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.agencia = 123;
		primeiraConta.numero = 123456;
		primeiraConta.titular = "Lucas";
		primeiraConta.saldo = 200.00;
		System.out.println("O saldo é: " + primeiraConta.saldo);
		primeiraConta.saldo += 200.00;
		System.out.println("O saldo mudou para: " + primeiraConta.saldo);
	}
}
