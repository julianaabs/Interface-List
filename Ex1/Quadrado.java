public class Quadrado implements AreaCalculavel{
	
	private double base;

	private double altura;

	public Quadrado(){}

	public Quadrado(double base, double altura){
		this.base = base;
		this.altura = altura;

	}

	public void calcularArea(){
		System.out.println("Area do quadrado:" + (base*altura)/2);
	}
}