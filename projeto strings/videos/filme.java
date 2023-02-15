package videos;

import java.util.Scanner;

public class filme {
    public static void Imprimir(){
        Scanner escanear = new Scanner(System.in);
        System.out.println("insira o numero de filmes que vc ja assistiu: ");
        int b = escanear.nextInt();
        System.out.println("vc ja viu " + b + " filmes");
        escanear.close();
    }
}
