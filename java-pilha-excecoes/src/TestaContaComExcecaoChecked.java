
public class TestaContaComExcecaoChecked {

	public static void main(String[] args) /*throws MinhaExcecao2*/  {
		Conta c = new Conta();
		
		try {
			c.deposita();
		} catch (MinhaExcecao2 ex) {
			System.out.println("tratamento...");
		}
		
	}

}
