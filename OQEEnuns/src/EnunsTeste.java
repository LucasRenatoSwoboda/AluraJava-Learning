
public class EnunsTeste {
	
	public static void main(String [] args) {
		
		System.out.println(Thread.MAX_PRIORITY);
		
		Thread t = new 
				Thread(() -> 
				System.out.println
				("rodando..."));
		//MAX_PRIORITY é um valor inteiro = 10
		//quando usamos uma descrição p/
		//representar esse valor, estamos
		//usando Enuns.
		t.setPriority(Thread.MAX_PRIORITY);
		t.start();
		
		Prioridade pMin = Prioridade.MIN;
		Prioridade pMax = Prioridade.MAX;
		Prioridade pNor = Prioridade.NORMAL;
		
		System.out.println(pMin.name());
		System.out.println(pMax.name());
		System.out.println(pNor.name());
		System.out.println(pMin.ordinal()); 
		//MIN é 0 por que foi o primeiro
		//objeto declarado
		System.out.println(pNor.ordinal());
		//NOR é 1 por ser o segundo objeto
		//declarado... 
		System.out.println(pMax.ordinal());
		
		System.out.println(pMin.getValor());
		System.out.println(pNor.getValor());
		
	}
	
}
