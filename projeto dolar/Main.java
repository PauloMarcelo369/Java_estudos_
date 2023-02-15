import dolar.cotacao;
import java.util.Scanner;

public class Main{
    

    public static void main(String[] args){
        Scanner escanear = new Scanner(System.in);
        System.out.printf("what is the dollar price? %.2f\n", cotacao.Dolar);
        System.out.println("How many dollars will be bought? ");
        int a = escanear.nextInt();

        System.out.printf("Amount to be paid in reais = %.2f", cotacao.converter(a));

        escanear.close();

    }
}