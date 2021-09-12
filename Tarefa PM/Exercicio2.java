package PensamentoMat;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		int nmr;

		int contador = 1;

		Scanner leitor = new Scanner(System.in);
		while (contador <= 10) {
			System.out.println("Informe o número " + contador);
			nmr = leitor.nextInt();
			if (nmr % 2 == 0) {
				System.out.println("O número é par!");
			} else {
				System.out.println("O númeor é ímpar!");
			}
			contador = contador + 1;
		}

	}

}
