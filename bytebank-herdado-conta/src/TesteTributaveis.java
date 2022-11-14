public class TesteTributaveis {
	
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Teste");
		Corrente cc = new Corrente(c1);
		cc.depositar(100);
		
		SeguroDeVida sv = new SeguroDeVida();
		
		CalculadoraDeImposto calc = new CalculadoraDeImposto();
		calc.registra(cc);
		calc.registra(sv);
		
		System.out.println(calc.getTotalImposto());
		
	}

}