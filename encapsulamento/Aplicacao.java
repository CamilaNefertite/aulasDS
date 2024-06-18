package atividadeAvaliativa1;
import java.util.Scanner;
public class Aplicacao {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		
		System.out.println("Qual operação deseja fazer?\n1 para Fatorial | 2 para Tabuada | 3 Área do Triângulo");
		int opcao = in.nextInt();
		
		if(opcao == 1) {
			MetodosApp maFa = new MetodosApp();
			
			System.out.println("Qual número você deseja fatorar?");
			int numeroFatorial = in.nextInt();
			
			System.out.println("\nO fatorial de " +numeroFatorial+ " é de "+maFa.fatorial(numeroFatorial));
			
		}else if(opcao == 2) {
			MetodosApp maTa = new MetodosApp();
			
			maTa.tabuada();
			
		}else if(opcao==3) {
			MetodosApp maTr = new MetodosApp();
			
			System.out.println("Digite a base do triângulo:");
			double b = in.nextDouble();
			
			System.out.println("Digite a altura do mesmo:");
			double h = in.nextDouble();
			

			maTr.triangulo(b, h);
		}else {
			System.out.println("Escolha inválida. Escolha novamente!");
		}
		
		
	
	}
}