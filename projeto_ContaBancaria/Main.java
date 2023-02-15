package projeto_ContaBancaria;
import projeto_ContaBancaria.Conta_bancaria.conta;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner escanear = new Scanner(System.in);

        System.out.printf("Voce ira cadastrar sua conta com a entrada de alguma quantia no saldo ou não? responda: ");
        conta usuario;
        String opcao = escanear.nextLine();
        System.out.printf("informe seu nome: ");
            String Nome = escanear.nextLine();
            System.out.printf("informe o numero da sua conta: ");
            int numero = escanear.nextInt();

        if (opcao.equals("sim")){
            System.out.printf("informe a quantiade de dinheiro que voce ira adicionar a conta: ");
            double dinheiro = escanear.nextDouble();
            usuario = new conta(Nome, numero, dinheiro);
        }
        else{
            usuario = new conta(Nome, numero);
        }

        System.out.println("\n");
        usuario.SituaçãoCadastral();
        System.out.println("\n");

        System.out.print("adicione dinheiro: ");
        usuario.adicionar_ao_saldo(escanear.nextDouble());
        System.out.println("\n");

        System.out.print("digite o valor que vc deseja sacar: ");
        usuario.SacarGrana(escanear.nextDouble());
        System.out.println("\n");

        escanear.nextLine();

        System.out.print("troque o seu nome: ");
        usuario.setNome(escanear.nextLine());
        escanear.close();
    }
}
