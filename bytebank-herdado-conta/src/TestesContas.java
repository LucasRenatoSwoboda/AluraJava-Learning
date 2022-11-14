
public class TestesContas {
	public static void main(String[] args) {
		
//		int a = 3;
//		int b = a/0;
//		
//		Corrente outra = null;
//		outra.depositar(200);
//		
		Cliente c1 = new Cliente("Cliente 1");
		Cliente c2 = new Cliente("Cliente 2");
		
		Corrente cc = new Corrente(c1);
		Poupanca cp = new Poupanca(c2);
		
		cc.depositar(100);
		cp.depositar(500);
		boolean t = cc.transferir(50, cp);
		System.out.println(t);
		System.out.printf("Saldo da cc = %.2f\nSaldo da cp = %.2f",cc.getSaldo(),cp.getSaldo());
		
	}
}
