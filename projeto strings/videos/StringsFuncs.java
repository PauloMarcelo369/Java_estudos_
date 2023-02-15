package videos;
import java.lang.ref.Cleaner;
import java.util.Scanner;

public class StringsFuncs{
    public static void UsoDeStrings(){
        Scanner escanear = new Scanner(System.in);
        String a;
        Boolean s = true;
        System.out.println("informe uma string: ");
        a = escanear.nextLine();

        while(s){
            System.out.println("|o que vc deseja fazer com sua String?|");
            System.out.println("(1)remover espaços\n(2)contar numero de caracteres\n(3)ver se uma substring esta contida na string\n(4)caixa alta\n(5)caixa baixa"
            + "\n(6)mostrar string a partir de um certo index\n(7)sair\n");

            int b = escanear.nextInt();

            if (b == 1){
                System.out.println(a.trim() + "\n");

            }
            else if (b == 2){
                System.out.println(a.length() + "\n");
            }
            else if (b == 3){
                System.out.println("informe o SubString: ");
                String h = escanear.nextLine();
                if (a.contains(h)){
                    System.out.println("Sim!");
                    System.out.println("o endereço da primeira vez que essa substring apareceu é: " + a.indexOf(h));
                    System.out.println("o endereço da ultima vez que essa substring apareceu é: " + a.lastIndexOf(h) + "\n");
                }
                else {System.out.println("essa substring nao esta presente na string!\n");}
            }
            else if (b == 4){
                System.out.println(a.toUpperCase());
            }
            else if (b == 5){
                System.out.println(a.toLowerCase());

            }
            else if (b==6){
                System.out.println("digite o valor do index: ");
                int f = escanear.nextInt();
                System.out.println(a.substring(f) + "\n");
            }
            else if (b==7){
                System.out.println("sistema fechado!!!\n");
                s = false;

            }
        }
        escanear.close();
    } 
}