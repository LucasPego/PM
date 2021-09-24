package Conta;

public class ContaCorrente {

	private double saldo;

	public ContaCorrente(float saldo) {
		this.saldo = saldo;
	}

	public ContaCorrente() {
		this.saldo = 0;
	}

	public void sacar(double valorSaque) {
		if (this.saldo >= valorSaque) {
			imprimirOperacao(1, valorSaque);
			saldo -= valorSaque;
		} else {
			System.out.println("Saldo insuficiente!");
		}
	}

	public void depositar(float valorDeposito) {
		imprimirOperacao(2, valorDeposito);
		this.saldo += valorDeposito;

	}

	public void imprimirOperacao(int operacao, double valorOperacao) {
		String op = operacao == 1 ? "-" : "+";
		var novoSaldo = 0.0;
		// novoSaldo = operacao == 1 ? getSaldo() - valorOperacao : getSaldo() +
		// valorOperacao;
		if (operacao == 1) {
			novoSaldo = getSaldo() - valorOperacao;
		} else {
			novoSaldo = getSaldo() + valorOperacao;
		}
		System.out.println("Operação: " + getSaldo() + op + valorOperacao + " = " + novoSaldo);
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
