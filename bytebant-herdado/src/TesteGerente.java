
public class TesteGerente {
	public static void main(String[] args) {
		
		Autenticavel referencia = new Gerente();
		Gerente g1 = new Gerente();
		
		g1.setNome("Gerente");
		g1.setCpf("11111111111");
		g1.setSalario(5000);
		g1.setSenha(1235645);
		
		boolean autentica = g1.autentica(1235645);
		
		System.out.println(autentica);
		System.out.println(g1.getBonificacao());
	}
}
