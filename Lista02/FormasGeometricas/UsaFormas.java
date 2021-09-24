package FormasGeometricas;

public class UsaFormas {
	public static void main(String[] args) {

		Circulo i = new Circulo();

		i.calcA(5);
		i.calcP(5);

		System.out.println("--------------------------------------------------------------------------------");

		Retangulo x = new Retangulo();

		x.calcA(5, 8);
		x.calcP(5, 8);

		System.out.println("---------------------------------------------------------------------------------");

		Retangulo y = new Retangulo(5);
		Metodos metodo = new Metodos();
		
		metodo.calcular(y);
		
	}
}
