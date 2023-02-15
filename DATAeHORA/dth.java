package DATAeHORA;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dth {
    public static void main(String[] args){
        //https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/format/DateTimeFormatter.html#:~:text=Class%20DateTimeFormatter.%20Formatter%20for%20printing%20and%20parsing%20date-time,date-time%20classes%20provide%20two%20methods%20-%20one%20
        
        //formatação para um tipo de data que vc quer aplicar --> java.time.format.DateTimeFormatter;
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        /*importante: o padrao de data e hora é o de grenwick, ou seja, o de londres, conhecido como "UMC", na linguagem é conhecido como Z;
        o padrão para representação de data é o seguinte: dia-mes-ano, exemplo: 02-12-2003. ao adicionar um horario a convenção é o seguinte: 
        dia-mes-anoTHoras:minutos:segundos.frac de segundos. 'T' significa o tempo... no padrão de Londres: tem um 'Z' no final
        */

        //INSTANCIAR OBJETOS DE DATA E HORA 

        //retorna a data local sem a hora --> java.time.LocalDate;
        LocalDate data01 = LocalDate.now();
        System.out.println(data01);
        //retorna a data e hora local com o horario --> ava.time.LocalDateTime
        LocalDateTime data02 = LocalDateTime.now();
        System.out.println(data02);
        //retorna data e hora no padrão de Londres 'Z' --> java.time.Instant (HORÁRIO GLOBAL);
        Instant data03 = Instant.now();
        System.out.println(data03);
        
        //permite que gere uma data a partir de um texto feito no padrão
        LocalDate data04 = LocalDate.parse("2022-07-04");
        System.out.println(data04);
        //agora com um horario
        LocalDateTime data05 = LocalDateTime.parse("2022-07-04T12:54:12.0");
        System.out.println(data05);
        //agora formatado para o padrão de Londres
        Instant data06 = Instant.parse("2022-07-04T12:54:12.0Z");
        System.out.println(data06);
        //horario de São Paulo
        Instant data07 = Instant.parse("2022-07-04T12:54:12-03:00");
        System.out.println(data07);

        LocalDate data08 = LocalDate.parse("24/02/2000", fmt1);
        System.out.println(data08);
        
        LocalDateTime data09 = LocalDateTime.parse("24/02/2000 12:5 1", fmt2);
        System.out.println(data09);

        //INSTANCIA DIAS, MES E ANO SEPARADAMENTE;
        LocalDate data10 = LocalDate.of(2021, 2, 2);
        System.out.println(data10);

    }
    
}
