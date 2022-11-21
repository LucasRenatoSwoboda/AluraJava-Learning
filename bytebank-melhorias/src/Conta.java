public abstract class Conta {
    // Atributos
    private int numeroAgencia;
    private int numeroConta;
    private double saldo;

    // Construtor Padrão
    public Conta(int agencia, int conta) {
        this.numeroAgencia = agencia;
        this.numeroConta = conta;
        this.saldo = 0;
    }

    // Getters and Setters
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Depositar
    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
    }

    public void chamarExcecaoSaldoInsuficiente(double valor) {
    	throw new SaldoInsuficienteExcecao("O seu saldo é insuficiente para" +
                " realizar o saque.\n Saldo: R$" + getSaldo() + " < R$" + valor);
    }
    
    // Sacar
    public void sacar(double valor) {
        if (getSaldo() < valor)
        	chamarExcecaoSaldoInsuficiente(valor);
        setSaldo(getSaldo() - valor);
    }
    
    // Transferir
    public void transferir(double valor, Conta cc) {
    	sacar(valor);
    	cc.depositar(valor);
    }

}