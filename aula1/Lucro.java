package aula1;
import java.util.Scanner;
public class Lucro {
 public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	double fabri, lucro, precoVen;
	
	System.out.println("Quantos reais voc� gasta para fabricar o produto?");
	fabri=in.nextDouble();
	
	System.out.println("Qual a porcentagem de lucro que voc� deseja ter em cima do produto?");
	lucro=in.nextDouble();
	
	precoVen=fabri+(lucro*(fabri/100));
	System.out.println("Para voc� ter "+lucro+"% de lucro, voc� precis� vender seu produto por R$"+precoVen);
 }
}
