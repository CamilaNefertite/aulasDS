package exercicioFixacao2;
import java.util.Scanner;
public class AreaCirculos {
	Scanner in = new Scanner (System.in);
	
	public void area1() {
		System.out.println("Digite o raio do circulo");
		double raio = in.nextDouble();
		double pi = 3.1415;
		double a = pi*(raio * raio);
		System.out.println(a);
	}
	public void area2(double raio) {
		double pi = 3.1415;
		double a = pi*(raio * raio);
		System.out.println(a);
		
	}
	public double area3() {
		System.out.println("Digite o raio do circulo");
		double raio = in.nextDouble();
		double pi = 3.1415;
		double a = pi*(raio * raio);
		return a;		
	}
	public double area(double raio) {
		double pi = 3.1415;
		double a = pi*(raio * raio);
		return a;
	}
}