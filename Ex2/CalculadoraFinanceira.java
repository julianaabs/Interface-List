public class CalculadoraFinanceira implements Calculadora{

	private double x, y;

	public CalculadoraFinanceira(){
		this.x = 0;
		this.y = 0;
	}

	public void somar(double x, double y){
		System.out.println("Soma: " + (x+y) + "\n");
	}

	public void subtrair(double x, double y){
		System.out.println("Subtraçao: " + (x-y) + "\n");
	}

	public void dividir(double x, double y){
		System.out.println("Divisao: " + (x/y) + "\n");
	}

	public void multiplicar(double x, double y){
		System.out.println("Multiplicaçao: " + (x*y) + "\n");
	}

	public void aumentoPercentual(double x, double percent){
		System.out.println("Aumento de " + (x*percent)/100 + " reais.");
		System.out.println("Valor com aumento: " + (x+(x*percent)/100));
	}
}