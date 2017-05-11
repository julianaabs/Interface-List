public class Teste{

	public static void main(String[] args){

		AreaCalculavel t1 = new Triangulo(2.0, 3.0);
		t1.calcularArea();

		AreaCalculavel r1 = new Retangulo(4.0, 2.0);
		r1.calcularArea();

		AreaCalculavel q1 = new Quadrado(4.0, 4.0);
		q1.calcularArea();

		AreaCalculavel c1 = new Circulo(2.0);
		c1.calcularArea();
	}
}