
public class TesteSistema {
	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		Administrador a = new Administrador();
		a.setSenha(3333);
		
		Cliente c = new Cliente();
		c.setSenha(2222);
	
		SistemaInterno sI = new SistemaInterno();
		sI.autentica(g);
		sI.autentica(a);
		sI.autentica(c);
	}
}
