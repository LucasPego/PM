package PensamentoMat;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		String opcaoTabuada = "";
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe a tabuada que deseja ver");
		System.out.println("* = Multiplicação");
		System.out.println("/ = Divisão");
		opcaoTabuada = leitor.nextLine();
		
		if(opcaoTabuada.equalsIgnoreCase("x")) {
			for(int x = 0; x < 10; x++) {
				for (int y = 0; y <= 10; y++) {
					System.out.println(x + "*" + y + "=" + (x*y));
				}	
			}
			for(int x = 0; x < 10; x++) {
				for (int y = 0; y <= 10; y++) {
					System.out.println(x + "*" + y + "=" + (x*y));
				}	
			}
		}
	}
}
