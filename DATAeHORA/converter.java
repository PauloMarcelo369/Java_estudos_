package DATAeHORA;

import java.time.ZoneId;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class converter {
    public static void main(String[] args){
        /* 
        -----O metodo o metodo getAvailableZoneIds() me retorna todos os fuso horários disponiveis
        for (String s : ZoneId.getAvailableZoneIds()){
            System.out.println(s);
        }
        */
        LocalDate dt1 = LocalDate.parse("2022-02-21");
        LocalDateTime dt2 = LocalDateTime.parse("2022-02-21T23:59");
        Instant dt3 = Instant.parse("2001-02-21T12:51:21Z");

        //converter Instant em LocalDate ou em LocalDateTime, para isso, será necessária 
        LocalDate r1 = LocalDate.ofInstant(dt3, ZoneId.systemDefault());
        LocalDateTime r2 = LocalDateTime.ofInstant(dt3, ZoneId.systemDefault());

        LocalDate r3 = LocalDate.ofInstant(dt3, ZoneId.of("Portugal"));
        LocalDateTime r4 = LocalDateTime.ofInstant(dt3, ZoneId.of("Portugal"));

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(dt3 + "   " + r4);

        //metodos para retornnar dia, mes, ano
        System.out.println(dt1.getDayOfMonth());
        System.out.println(dt1.getYear());
        //retorna o nome do mes
        System.out.println(dt1.getMonth());

        //retornar horas, minutos e segundos
        System.out.println(dt2.getHour());
        System.out.println(dt2.getMinute());
        System.out.println(dt2.getSecond());

        ///////////////////////////////////////////////////////////////////////////////////////////////
        //operações com datas
        System.out.println("--------------------------------------------------------------");


        LocalDate dt4 = LocalDate.parse("2023-03-21");
        LocalDateTime dt5 = LocalDateTime.parse("2023-03-21T23:59");

        LocalDate SemanaPassada = dt4.minusDays(7);
        LocalDate SemanaQueVem = dt4.plusDays(7);
        LocalDateTime horapassada = dt5.minusHours(4);

        LocalDate SemanaPassada02 = dt4.minus(7, ChronoUnit.DAYS);
        LocalDateTime horapassada02 = dt5.minus(4, ChronoUnit.HOURS);

        System.out.println(SemanaPassada);
        System.out.println(SemanaQueVem);
        System.out.println(horapassada);
        System.out.println(SemanaPassada02);
        System.out.println(horapassada02);


        


    }
}