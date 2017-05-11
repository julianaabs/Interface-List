public class CalculadoraCientifica implements Calculadora{

	private double x, y;

	public CalculadoraCientifica(){
		this.x = 0;
		this.y = 0;
	}

	public void somar(double x, double y){
		System.out.println("Soma: " + (x+y));
	}

	public void subtrair(double x, double y){
		System.out.println("Subtraçao: " + (x-y));
	}

	public void dividir(double x, double y){
		System.out.println("Divisao: " + (x/y));
	}

	public void multiplicar(double x, double y){
		System.out.println("Multiplicaçao: " + (x*y));
	}

	public void raiz(double x){
		System.out.println("Raiz: " + Math.sqrt(x));
	}

	public void potencia(double x, double y){
		System.out.println("Potencia: " + Math.pow(x, y) + "\n");
	}
}