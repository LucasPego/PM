package FormasGeometricas;

public class Circulo {
	public void calcA(float raio) {
		float calcArea = 3.14f*(raio*raio);
		System.out.println("�rea do c�rculo = "+ calcArea + "cm^2");
	}
	
	public void calcP(float raio) {
		float calcPerimetro = 2*raio*3.14f;
		System.out.println("Perimetro do c�rculo = " + calcPerimetro + "cm");
	}
	
}
