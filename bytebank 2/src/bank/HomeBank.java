package bank;

public class HomeBank {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Lucas Renato Swoboda", "01958404020", "13/06/1990");
		Conta conta1 = new Conta(cliente1);
		Cliente cliente2 = new Cliente("Teste", "13245678911", "13/06/1990");
		Conta conta2 = new Conta(cliente2);
		Conta conta3 = new Conta(cliente1);
		System.out.println(Conta.getTotalContas());
	}
}
