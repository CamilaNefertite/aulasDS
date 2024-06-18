
package atividadeAvaliativa2;
import java.util.Scanner;
public class Aplicacao {
	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);

		Carro car = new Carro();

		System.out.println("Qual o modelo do carro?");
		car.setModelo(in.nextLine());
		
		System.out.println("Qual o nome do fabricante?");
		car.setFabri(in.nextLine());

		System.out.println("Qual o ano de fabricação?");
		car.setAnoFabri(in.nextLine());


		System.out.println("\nInformações do Carro\n");
		System.out.println("Modelo: " +car.getModelo());
		System.out.println("Fabricante: " +car.getFabri());
		System.out.println("Ano de Fabricação: " +car.getAnoFabri());

	}
}
