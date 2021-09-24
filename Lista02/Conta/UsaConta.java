package Conta;

public class UsaConta {
	public static void main(String[] args) {
		ContaCorrente lucas = new ContaCorrente(1800);

		lucas.sacar(100);
		lucas.depositar(100);
	}
}
