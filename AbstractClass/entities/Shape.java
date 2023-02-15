package entities;

import entities.enums.color;;

public abstract class Shape {
    private color Color;

    Shape(){}

    public Shape(color color) {
        Color = color;
    }

    public color getColor() {
        return Color;
    }

    public void setColor(color color) {
        Color = color;
    }
    public abstract double Area();
}
