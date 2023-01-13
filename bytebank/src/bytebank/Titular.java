package bytebank;

public class Titular {

	private String nome;
	private int cpf;
	private String nascimento;
	
	public Titular(String nome, int cpf, String nascimento) {
		if (Integer.toString(cpf).length() > 11) 
			throw new RuntimeException("CPF deve possuir menos de 11 digitos");		
		this.nome = nome;
		this.cpf = cpf;
		this.nascimento = nascimento;
	}
	
}
