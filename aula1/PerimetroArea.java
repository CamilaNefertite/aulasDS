package aula1;
import java.util.Scanner;
public class PerimetroArea {
 public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	int base,altura, resp, peri, area;
	
	System.out.println("Digite a base do ret�ngulo:");
	 base=in.nextInt();
	
	System.out.println("Digite a altura do ret�ngulo:");
	 altura=in.nextInt();
	 
	 peri=2*(base+altura);
	 area=base*altura;
	 
	 System.out.println("O perimetro do seu ret�ngulo � de:"+peri);
	 System.out.println("A area do seu ret�ngulo � de:"+area);
	 
	 
 	}
 
 }
 
