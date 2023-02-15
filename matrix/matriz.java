package matrix;
import java.util.Locale;
import java.util.Scanner;

public class matriz {           
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int tamanho;
        System.out.print("informe a ordem da matriz: ");
        tamanho = sc.nextInt();
        int[][] matriz = new int[tamanho][tamanho];


        System.out.println("informe os valores da matriz de ordem: " + tamanho);

        for (int i = 0; i < tamanho; i++)
            for (int j = 0; j < tamanho; j++)
                matriz[i][j] = sc.nextInt();

         for (int i = 0; i < tamanho; i++){
            for (int j = 0; j < tamanho; j++)
                System.out.print(matriz[i][j] + " ");
            System.out.println();
        }   

        int j = 0;

        System.out.print("diagonal principal: ");
        for (int i = 0; i < tamanho; i++){
            System.out.print(matriz[i][j] + " ");
            j++;
        }

        


        sc.close();

    }

    
}
