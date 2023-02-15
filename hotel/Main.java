package hotel;

import java.util.Locale;
import java.util.Scanner;
import hotel.cadastro.cad;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner escanear = new Scanner(System.in);
        cad[] cadastros = new cad[10];


        System.out.print("Digite a quantidade de estudantes que irão fazer a hospedagem (de 0 a 9): ");
        int estudantes = escanear.nextInt();
        System.out.println();

            escanear.nextLine();

        for (int i = 0; i < estudantes; i++){
            System.out.print("insrira o nome do estudante desse quarto: ");
            String nome = escanear.nextLine();
            System.out.print("insira o email do estudante: ");
            String email = escanear.nextLine();
            System.out.print("digite o numero do quarto em que vc a dicionar o estudante: ");
            int indice = escanear.nextInt();
            escanear.nextLine();
            System.out.println();

            cadastros[indice] =  new cad(nome, email);

        }
        System.out.println();


        System.out.println("---------CADASTROS---------");
        for (int i = 0; i < cadastros.length; i++){
            if (cadastros[i] != null)
                System.out.println("quarto: " + i + "\n" + cadastros[i].toString() + "\n");
        }
        escanear.close();

    }
    
}
