package cadastro;
import cadastro.cad.user;
import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner escanear = new Scanner(System.in);


        System.out.print("informe a quantidade de usuarios que vc deseja cadastrar: ");
        int N = escanear.nextInt();
        user[] vetor = new user[N];
        escanear.nextLine();

        for (int i = 0; i < vetor.length; i++){
            System.out.println("----------CADASTRO-----------");

            System.out.print("informe o nome do USER: ");
            String nome = escanear.nextLine();
            System.out.print("informe a idade do USER: ");
            int idade = escanear.nextInt();
            System.out.print("informe o cps do USER: ");
            int cpf = escanear.nextInt();
            System.out.print("informe a senha do USER: ");
            int senha = escanear.nextInt();
            System.out.println("-----------------------------");
            escanear.nextLine();
            vetor[i] = new user(nome, idade, cpf, senha);
        }

        System.out.println("");
        System.out.println("DADOS INICIADOS!!!");
        System.out.println("");

        System.out.print("informe o ID do usuario ao qual vc quer ver os dados: ");
        int ID = escanear.nextInt();
        System.out.println("Os dados do usuario co ID informado são: " + vetor[ID].toString());

        escanear.close();

    }
    
}
