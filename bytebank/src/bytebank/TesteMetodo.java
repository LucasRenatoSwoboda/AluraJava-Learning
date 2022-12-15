package bytebank;

public class TesteMetodo {

	public static void main(String[] args) {
		Conta_inv contaDoPaulo = new Conta_inv();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		contaDoPaulo.titular = "Paulo Silveira";
		System.out.println("O saldo atual é: " + contaDoPaulo.saldo);
		contaDoPaulo.saca(100);
		System.out.println("O saldo atuel é: " + contaDoPaulo.saldo);
		boolean sacou = contaDoPaulo.saca(100);
		if (sacou)
			System.out.println("Sacou com sucesso!");
		else
			System.out.println("Saque não foi realizado!");
		Conta_inv contaDaMarcela = new Conta_inv();
		contaDaMarcela.saldo = 1000.00;
		if (contaDaMarcela.transfere(300, contaDoPaulo))
			System.out.println("Transferência com sucesso");
		else
			System.out.println("Transferência não realizada");

	}
}