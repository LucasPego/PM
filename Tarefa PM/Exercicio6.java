package PensamentoMat;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
		
		float percentualMaximo = 0.3f;
		float valorPrestacao = 0.0f;
		float valorSalario = 0.0f;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o valor do salário");
		valorSalario = leitor.nextFloat();
		
		System.out.println("Informe o valor da prestação");
		valorPrestacao = leitor.nextFloat();
		
		if(valorPrestacao <= (valorSalario * percentualMaximo)){
		System.out.println("Empréstimo aceito");
	}else {
		System.out.println("Empréstimo negado");
	}
}}
