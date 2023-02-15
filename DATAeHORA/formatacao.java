package DATAeHORA;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class formatacao {

    public static void main(String[] args){
        LocalDate date01 = LocalDate.parse("2000-04-21");
        LocalDateTime date02 = LocalDateTime.parse("2000-04-21T09:12");
        Instant date03 = Instant.parse("2001-02-21T12:51:21Z");
        System.out.println("INSTANCIAÇÃO DE DATAS:");
        System.out.println(date01);
        System.out.println(date02);
        System.out.println(date03);
        System.out.println("--------------------------------------");

        //com isso, irei passar os dates anteriores de forma formatada, no modelo abaixo
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        //with zone especifica o fuso horario usado, no caso, ZoneId.systemDefault() retorna o fuso padrão da maquina
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        //imprime date1 com a formatação produzida acima, (tres formas de fazer) 
        System.out.println(date01.format(fmt1));
        System.out.println(fmt1.format(date01));
        System.out.println(date01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("--------------------------------------");
        System.out.println(date02.format(fmt2));
        System.out.println(fmt2.format(date02));
        System.out.println("--------------------------------------");
        //so posso imprimir instant desse jeito
        System.out.println(fmt3.format(date03));

    }
    
}
