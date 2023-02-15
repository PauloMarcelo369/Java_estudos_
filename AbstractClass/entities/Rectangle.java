package entities;

import entities.enums.color;

public final class Rectangle extends Shape {

    private Double Width;
    private Double Height;

    public Rectangle(){
        super();
    }
    public Rectangle(color color, Double width, Double height) {
        super(color);
        Width = width;
        Height = height;
    }
    public Double getWidth() {
        return Width;
    }
    public void setWidth(Double width) {
        Width = width;
    }
    public Double getHeight() {
        return Height;
    }
    public void setHeight(Double height) {
        Height = height;
    }

    public double Area(){
        return Width * Height;
    }

}
