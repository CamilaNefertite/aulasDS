package exercicioFixacao3;
import java.util.Scanner;
public class CadastrarExibir {
	Scanner in=new Scanner(System.in);
	
	public void cadastrarPessoa1(String nome, int idade, double peso, String email ) {
		System.out.println("Qual seu nome?");
		nome = in.next();
		
		System.out.println("Okay "+nome+", e qual a sua idade?");
		idade = in.nextInt();
		
		System.out.println("E o seu peso?");
		peso= in.nextDouble();
		
		System.out.println("Otímo! Para finalizar, qual é o seu e-mail, "+nome+"?");
		email = in.next();
	}
	
	
	
}