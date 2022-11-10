
public class Administrador extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador;
	
	public Administrador() {
		AutenticacaoUtil util = new AutenticacaoUtil();
	}
	
	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);		
	}
	
	public double getBonificacao() {
		return 0;
	}
}
