package FormasGeometricas;

public class Retangulo {
	private int ladoQuadrado;
	
	public Retangulo(int ladoQuadrado) { 
		this.ladoQuadrado = ladoQuadrado;
	}
	
	public Retangulo() {
		
	}
	
	public int getLadoQuadrado() {
		return ladoQuadrado;
	}

	public void setLadoQuadrado(int ladoQuadrado) {
		this.ladoQuadrado = ladoQuadrado;
	}

	public void calcA(float ladoMenor, float ladoMaior) {
		float calcArea = ladoMenor*ladoMaior;
		System.out.println("Área = "+ calcArea + "cm^2");
	}
	
	public void calcP(float ladoMenor, float ladoMaior) {
		float calcPerimetro = (ladoMenor*2)+(ladoMaior*2);
		System.out.println("Perímetro = "+ calcPerimetro + "cm");
	}
}
