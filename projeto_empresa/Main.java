import estoque.product;

import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner escanear = new Scanner(System.in);
        product produtos = new product("nenhum", 0.00);

        System.out.println("informe o nome do produto:");
        produtos.setProduto(escanear.nextLine());
        System.out.println("indorme o preço do produto:");
        produtos.setPreco(escanear.nextDouble());
        System.out.println("informe a quantidade de produtos:");
        produtos.setQuantidade(escanear.nextInt());

        System.out.println("\n");
        
        int escolha;

        System.out.println("(1)informações do produto\n" + "(2)inserir produtos\n" + "(3)remover produtos\n" );
        escolha = escanear.nextInt();

        if (escolha == 1){
            produtos.InformaçõesDoProduto();
        }
        else if (escolha == 2){
            produtos.inserir();
        }
        else if (escolha == 3){
            produtos.remover();
        }
        escanear.close();
    }
}