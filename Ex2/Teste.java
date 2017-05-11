public class Teste{

	public static void main(String[] args){

		Calculadora calcC = new CalculadoraCientifica();

		calcC.somar(2.00, 3.00);
		calcC.subtrair(10.00, 5.00);
		calcC.multiplicar(2.00, 5.00);
		calcC.dividir(4.00, 0.00);

		((CalculadoraCientifica)calcC).raiz(9.00);
		((CalculadoraCientifica)calcC).potencia(3.00, 3.00);
		//((ContaCorrente)contaCorre).taxa();

		Calculadora calcF = new CalculadoraFinanceira();

		((CalculadoraFinanceira)calcF).aumentoPercentual(125.00, 20.00);
	}
}