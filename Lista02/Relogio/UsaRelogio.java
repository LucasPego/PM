package Relogio;

import java.util.Scanner;

public class UsaRelogio {
	public static void main(String[] args) {

		Relogio horario = new Relogio(22, 15);
		
		horario.proximoMin();
		horario.imprimir();
		horario.mudarHora();
		

	}

}
