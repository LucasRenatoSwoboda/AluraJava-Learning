
public class Cliente implements Autenticavel {
	
	private AutenticacaoUtil autenticador;
	
	public Cliente() {
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
	
}
