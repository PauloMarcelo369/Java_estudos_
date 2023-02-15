package dolar;

public class cotacao {
    public static final double Dolar = 3.10;

    public static double converter(int quantidade){
        return quantidade * Dolar * 1.06;
    }
    
}
