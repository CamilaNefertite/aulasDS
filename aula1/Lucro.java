package aula1;
import java.util.Scanner;
public class Lucro {
 public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	double fabri, lucro, precoVen;
	
	System.out.println("Quantos reais você gasta para fabricar o produto?");
	fabri=in.nextDouble();
	
	System.out.println("Qual a porcentagem de lucro que você deseja ter em cima do produto?");
	lucro=in.nextDouble();
	
	precoVen=fabri+(lucro*(fabri/100));
	System.out.println("Para você ter "+lucro+"% de lucro, você precisá vender seu produto por R$"+precoVen);
 }
}
