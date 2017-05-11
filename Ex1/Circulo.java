import java.text.DecimalFormat;

public class Circulo implements AreaCalculavel{

	private double raio;

	private double area;

	public Circulo(){}

	public Circulo(double raio){
		this.raio = raio;
		this.area = raio * raio * 3.1415;

	}

	public void calcularArea(){
		DecimalFormat df = new DecimalFormat("#.00");
		String newArea = df.format(area);

		System.out.println("Area do circulo:" + newArea);
	}
}