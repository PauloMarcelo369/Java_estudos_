package projeto_triangulo;

import java.util.Locale;
import java.util.Scanner;
import projeto_triangulo.lados.ladin;

public class triangulo {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner escanear = new Scanner(System.in);
        System.out.println("informe o tamanho das medidas dos lados do triangulo X: ");
        ladin x, y;

        x = new ladin();
        y = new ladin();

        x.a = escanear.nextDouble();
        x.b = escanear.nextDouble();
        x.c = escanear.nextDouble();

        System.out.println("informe o tamanho das medidas dos lados do triangulo Y: ");

        y.a = escanear.nextDouble();
        y.b = escanear.nextDouble();
        y.c = escanear.nextDouble();

        System.out.println("areaX: " + x.calcula_area());
        System.out.println("areaY: " + y.calcula_area());

        escanear.close();
        
    }
}
