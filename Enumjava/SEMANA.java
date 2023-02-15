import dias_da_semana.dias.checar;

import java.util.Scanner;

import dias_da_semana.ver_dias;

public class SEMANA{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ver_dias SEMANA = new ver_dias(checar.SEGUNDA, checar.TERÇA, checar.QUARTA, 
        checar.QUINTA, checar.SEXTA, checar.SÁBADO, checar.DOMINGO);
        System.out.println(SEMANA);

        String digiteSEGUNDA = sc.nextLine();
        //esse metodo permite que ue leia uma string e a converta em um 'ENUM' conhecido
        checar dia = checar.valueOf(digiteSEGUNDA);

        System.out.println(dia);



    }

}