package PensamentoMat;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		float precoGasolina = 2.5f;
		float precoRefrigerante = 2.0f;
		float litrosGasolina = 0.0f;
		int quantidadeRefrigerantes = 0;
		float subtotalGasolina = 0.0f;
		float subtotalRefrigerante = 0.0f;
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe a quantidade de litros de gasolina: ");
		litrosGasolina = leitor.nextFloat();
		System.out.println("Informe a quantidade de refrigerantes: ");
		quantidadeRefrigerantes = leitor.nextInt();
		
		subtotalGasolina = litrosGasolina * precoGasolina;
		subtotalRefrigerante = quantidadeRefrigerantes * precoRefrigerante;
		System.out.println("Subtotal Gasolina " + subtotalGasolina);
		System.out.println("Subtotal Refrigerante " + subtotalRefrigerante);
		System.out.println("Valor Total " + (subtotalGasolina + subtotalRefrigerante));
	}
}
