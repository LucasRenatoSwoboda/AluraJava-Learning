
public class TestesContas {
	

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Lucas");
		Corrente cc = new Corrente(cliente);
		Corrente cc2 = new Corrente(cliente);
		
		cc.depositar(600);
		
		try {
			cc.transferir(600, cc2);
			System.out.printf("Transferência efetuado\nSaldo Atual: R$ %.2f", cc.getSaldo());
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
				
	}

}
