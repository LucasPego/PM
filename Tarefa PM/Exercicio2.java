package PensamentoMat;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		int nmr;

		int contador = 1;

		Scanner leitor = new Scanner(System.in);
		while (contador <= 10) {
			System.out.println("Informe o n�mero " + contador);
			nmr = leitor.nextInt();
			if (nmr % 2 == 0) {
				System.out.println("O n�mero � par!");
			} else {
				System.out.println("O n�meor � �mpar!");
			}
			contador = contador + 1;
		}

	}

}
