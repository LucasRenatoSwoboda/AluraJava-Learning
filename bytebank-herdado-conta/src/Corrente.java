public class Corrente extends Conta implements Tributavel {
	
	public Corrente(Cliente cliente) {
		super(cliente);
	}
	
	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return super.getSaldo() * 0.01;
	}
	
	@Override
	public boolean sacar(double valor) {
		double taxa = 0.2;
		return super.sacar((valor - taxa));
	}
	
	@Override
	public boolean transferir(double valor, Conta cc) {
		double taxa = 0.5;
		setSaldo((getSaldo()-taxa));
		return super.transferir(valor, cc);
	}
	
	@Override
	public void depositar(double valor) {
		setSaldo(getSaldo() + valor);		
	}
	
}