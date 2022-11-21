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
	public void sacar(double valor) {
		super.sacar(valor);
	}
	
	@Override
	public void transferir(double valor, Conta cc) {
		super.transferir(valor, cc);
		double taxa = 0.5;
		setSaldo((getSaldo()-taxa));
	}
	
	@Override
	public void depositar(double valor) {
		setSaldo(getSaldo() + valor);		
	}
	
}