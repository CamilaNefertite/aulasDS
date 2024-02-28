package aula1;
import java.util.Scanner;
public class SalarioProfessor {
 public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	 double salCom,valorAula,aulaDada, salF;
	 
	 System.out.println("Quantas aulas mês você dá por mês?");
	 	aulaDada=in.nextDouble();
	 	
	 System.out.println("Qual o valor em reais de cada aula dada?");
	 	valorAula=in.nextDouble();
	 	
	 	salCom=aulaDada*valorAula;
	 
	 if (salCom<1212){
		salF=salCom-(7.5*(salCom/100));
		System.out.println("Seu sálario é de: R$"+salF);
		
	 } else if (salCom>1212.01){
			salF=salCom-(9*(salCom/100));
			System.out.println("Seu sálario é de: R$"+salF);
			
	 } else if (salCom>2427.36){
			salF=salCom-(12*(salCom/100));
			System.out.println("Seu sálario é de: R$"+salF);
			
	 } else if (salCom>3641.04){
			salF=salCom-(14*(salCom/100));
			System.out.println("Seu sálario é de: R$"+salF);
			
	 } else if (salCom>7087.23){
			salF=salCom-(14.5*(salCom/100));
			System.out.println("Seu sálario é de: R$"+salF);
			
	 } else if  (salCom>12136.80){
			salF=salCom-(16.5*(salCom/100));
			System.out.println("Seu sálario é de: R$"+salF);
			
	 } else	 if (salCom>24273.58){
			salF=salCom-(19*(salCom/100));
			System.out.println("Seu sálario é de: R$"+salF);
			
	 } else{
			salF=salCom-(22*(salCom/100));
			System.out.println("Seu sálario é de: R$"+salF);
	 } 	

 }
 
}