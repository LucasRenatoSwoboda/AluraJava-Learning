
public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		
		EditorVideo e1 = new EditorVideo();
		Designer d1 = new Designer();
		
		g1.setNome("Nome Gerente");
		g1.setSalario(5000);		
		
		e1.setNome("Nome Editor de vídeo");
		e1.setSalario(2500);
		
		d1.setNome("Teste Designer");
		d1.setSalario(2000);
		
		ControleBonificacao controle = new 
				ControleBonificacao();	
		 
		controle.registra(g1);
		controle.registra(e1);
		controle.registra(d1);
		
		System.out.println(controle.getSoma());
		
	}
}
