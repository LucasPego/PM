package Relogio;


import java.util.Scanner;

public class Relogio {

	private int hora;
	private int min;

	public Relogio(int hora, int min) {
		this.hora = hora;
		this.min = min;

	}
	
	public void proximahora() {
		for (int i = 0; i == 24; i++) {
			System.out.println("Hora atual: " + i);
		}
	}

	public void proximoMin() {
		min += 1;
		if (min == 60) {
			hora += 1;
			min = 0;
			if (hora == 24) {
				hora = 0;
			}

		}

	}

	public void imprimir() {
		System.out.println(hora + ":" + min);

	}

	public void mudarHora() {  //era hora ou minuto, então escolhi hora
		Scanner scan = new Scanner(System.in);
		System.out.println("Escolha a hora = ");
		hora = scan.nextInt();

		if (hora <= 24) {

			System.out.println("Nova hora: " + hora);
		} else {
			System.out.println("Hora inválida");
		}
	}
	
	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}
}
