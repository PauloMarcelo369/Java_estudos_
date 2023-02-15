package projeto_triangulo.lados;

public class ladin {
    public double a;
    public double b;
    public double c;

    public double calcula_area(){

        double P1 = (a + b + c) / 2.0; 
        double areaX = Math.sqrt(P1 * (P1 - a) * (P1 - b) * (P1 - c));

        return areaX;
    }
}
