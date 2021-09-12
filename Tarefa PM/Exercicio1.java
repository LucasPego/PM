package PensamentoMat;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		float valorSalario;
		float percentAumento;
		float calculo;
		float salarioAumentado;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o valor do salário = ");
		valorSalario = leitor.nextFloat();
		
		System.out.println("Informe o percentual de aumento = ");
		percentAumento = leitor.nextFloat();
		
		calculo = (valorSalario * (percentAumento/100));
		salarioAumentado = calculo + valorSalario;
		
		System.out.println("Valor do aumento é de R$" + calculo);
		System.out.println("Salário aumentado é de R$" + salarioAumentado);
		
	}

}
