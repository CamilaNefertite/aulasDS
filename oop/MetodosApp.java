package atividadeAvaliativa1;
import java.util.Scanner;
public class MetodosApp {
	Scanner in = new Scanner(System.in);
	
	public int fatorial(int numeroFatorial) {
		int i=1, multi=1;
		
		while(i<=numeroFatorial) {
			multi*=i;
			i++;
		}
		return multi;
	}
	
	public void tabuada() {
		System.out.println("Digite um número ");
		int numeroTabuada = in.nextInt();
		
		System.out.println("\nTabuada do " +numeroTabuada+ ":\n");
		for (int i=0; i<11; i++) {
			double resul = numeroTabuada*i;
			System.out.println(numeroTabuada + " x " + i + " = " + resul);
		}	
	}
	
	public void triangulo(double b, double h) {
		double a = (b*h)/2;
		System.out.println("\nA área do triângulo dado é: " +a);
	}
	
	
}
