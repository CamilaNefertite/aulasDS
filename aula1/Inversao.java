import java.util.Scanner;
public class Inversao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int numero, centena, dezena, unidade, nInvertido;
        
        do {
            System.out.println("Digite um número: ");
            numero = in.nextInt();
        } while (numero < 100 || numero > 999);
        
        centena = numero / 100;
        dezena = (numero % 100) / 10;
        unidade = numero % 10;
        
        nInvertido = unidade * 100 + dezena * 10 + centena;
        
        System.out.println("Seu número invertido é: " + nInvertido);
    }
}
