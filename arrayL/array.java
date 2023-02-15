package arrayL;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;

public class array {
    public static void main(String[] args){

        //ESSE CONTEUDO SERÁ DEVERAS IMPORTANTE PARA FUTUROS PROJETOS NA CADEIRA DE POO

        //como não posso instaciar uma interface, então só posso instaciar uma classe que implemente a interface, que no caso, é a arraylist.
        //importante, entre <> eu não posso utilizar os tipos primitivos, pois eles não aceitam o valor NULO
        List<String> lista = new ArrayList<>(10);

       //metodo para adicionar elementos na posição n+1 do arrayList.
        lista.add("10");
        lista.add("121");
        lista.add("12");
        lista.add("43");
        lista.add("14");
        lista.add("15");

       //esse metodo permite que vc adicione elementos em quelquer posição do arraylist, seja no começo ou no final;

        lista.add(2, "100000");

        //esse metodo retorna o tamanho da lista
        int tamanho = lista.size();

        //esse metodo percorre o arraylist, procurando um dado igual e o removendo de sua posição
        //por exemplo: se fosse uma array list de strings a sintaxe seria |lista.remove("item a ser achado");|

        lista.remove("100000");

        //ja essa versão remove o que está no indice sugerido;

        lista.remove(2);

        for (String i : lista){
            System.out.println(i);
        }

        System.out.println("--------------------------------");
        //remoção por predicado
        //isso quer dizer, x tal que, se o caracter x na posição '0 for igual a 1, então remova'
        lista.removeIf(x -> x.charAt() == '1');
        for (String i : lista){
            System.out.println(i);
        }

        //retorna o indice onde esta o obejto string apontado
        int index = lista.indexOf("43");

    }
    
}
