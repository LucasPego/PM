package FormasGeometricas;

public class Metodos {
	public void calcular (Retangulo x) {
		float calcA = x.getLadoQuadrado()*x.getLadoQuadrado();
		float calcP = x.getLadoQuadrado()*4;
		System.out.println("�rea do Quadrado = "+calcA+"cm^2");
		System.out.println("Per�metro do Quadrado = "+calcP+"cm");
		return;
	}
}
