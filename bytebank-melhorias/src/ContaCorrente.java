
public class ContaCorrente extends Conta {
	
	public ContaCorrente(int agencia, int conta) {
		super(agencia,conta);
	}
	
	@Override
	public void depositar(double valor) {
		super.depositar(valor);
	}
	
	@Override
	public void sacar(double valor) {
		super.sacar(valor);
		if (getSaldo() <= 0){
			
		}
	}
	
	
}
