package PensamentoMat;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		String nomeFuncionario = "";
		float novoSalario = 0;
		float salario = 0;
		float percentualAumento = 0.2f;
			
		Scanner leitor = new Scanner(System.in);
		String opcao = "";
		
		while(true) {
			
			System.out.println("Informe o nome do Funcion�rio");
			nomeFuncionario = leitor.nextLine();
			
			if(nomeFuncionario.equalsIgnoreCase("Fim")){
				System.out.println("Programa encerrado");
				System.exit(0);
			}
			
			System.out.println("Informe o valor do sal�rio: ");
			novoSalario = Float.parseFloat(leitor.nextLine());
			
			if(salario <= 500) {
				novoSalario = salario + (salario*percentualAumento);
				
				System.out.println("Nome Funcion�rio" + nomeFuncionario);
				System.out.println("O sal�rio antigo � de "+ salario);
				System.out.println("O novo sal�rio � de "+ novoSalario);
			}else {
				System.out.println("O valor n�o foi contemplado para aumento, deve ser inferior a 500,00!");
			}
			System.out.println("Para continuar digite qualquer valor e tecle enter!");
			opcao = leitor.nextLine();
			if(opcao.equalsIgnoreCase("N�o")){
				System.exit(0);
			}
		}
	}
}
