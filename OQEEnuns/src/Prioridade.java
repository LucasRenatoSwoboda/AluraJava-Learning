
public enum Prioridade {
	//Para atribuir o valor deve ter um construtor
	MIN(1),NORMAL(5),MAX(10);
	
	private int valor;
	//Construtor
	Prioridade(int valor){
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}
	
}
