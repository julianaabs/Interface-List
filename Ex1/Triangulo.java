public class Triangulo implements AreaCalculavel{

	private double base;

	private double altura;

	public Triangulo(){}

	public Triangulo(double base, double altura){
		this.base = base;
		this.altura = altura;

	}

	public void calcularArea(){
		System.out.println("Area do triangulo:" + (base*altura)/2);
	}
}