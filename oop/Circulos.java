package exercicioFixacao2;
import java.util.Scanner;
public class Circulos {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		System.out.println("Escolhe o metodo que você deseja (1,2,3,4)");
		int metDesejado = in.nextInt();
		
		if(metDesejado==1) {
			AreaCirculos ac = new AreaCirculos();
			ac.area1();
			
		}else if (metDesejado==2){
			System.out.println("Digite o raio do circulo");
			double raio = in.nextDouble();
			AreaCirculos ac2 = new AreaCirculos();
			ac2.area2(raio);
			
	       } else if (metDesejado == 3) {
	            AreaCirculos ac3 = new AreaCirculos();
	            ac3.area3();
	            

			
		}else {
			System.out.println("Digite o raio do circulo");
			double raio = in.nextDouble();
			
			AreaCirculos ac4 = new AreaCirculos();

			System.out.println(ac4.area(raio));
		}	
	}
}
