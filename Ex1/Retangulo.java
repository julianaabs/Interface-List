public class Retangulo implements AreaCalculavel{
	
	private double base;

	private double altura;

	public Retangulo(){}


	public Retangulo(double base, double altura){
		this.base = base;
		this.altura = altura;

	}

	public void calcularArea(){
		System.out.println("Area do retangulo:" + (base*altura));
	}
}