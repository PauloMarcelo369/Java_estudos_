package entities;
import entities.enums.color;

public class Circle extends Shape {
    private static final double PI = 3.14;
    private Double Radius;

    Circle(){super();}

    public Circle(color color, Double radius) {
        super(color);
        Radius = radius;
    }

    public Double getRadius() {
        return Radius;
    }

    public void setRadius(Double radius) {
        Radius = radius;
    }

    @Override
    public double Area(){
        return Radius * Radius * PI;
    }
}
