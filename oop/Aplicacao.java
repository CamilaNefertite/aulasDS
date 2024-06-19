package poo;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o 1⁰ numero");
        int primeiroN = in.nextInt();
        
        System.out.println("Digite o 2⁰ numero");
        int segundoN = in.nextInt();
        
        System.out.println("Digite o 3⁰ numero");
        int terceiroN = in.nextInt();
        
        System.out.println("Digite o 4⁰ numero");
        int quartoN = in.nextInt();
        
        Matematica matematica = new Matematica();
        
        // Usando a sobrecarga do método somar
        int resultado2 = matematica.somar(primeiroN, segundoN);     
        System.out.println("Resultado da soma de 2 números: " + resultado2);
        
        int resultado3 = matematica.somar(primeiroN, segundoN, terceiroN);     
        System.out.println("Resultado da soma de 3 números: " + resultado3);
        
        int resultado4 = matematica.somar(primeiroN, segundoN, terceiroN, quartoN);     
        System.out.println("Resultado da soma de 4 números: " + resultado4);
        
        in.close();
    }
}
