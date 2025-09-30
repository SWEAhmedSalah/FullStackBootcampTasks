package com.ioc.example;

public class Circle implements Shape {

    private DrawShape drawShape;
    private int radius;

    public Circle(DrawShape drawShape , int radius) {
        this.drawShape = drawShape;
        this.radius = radius;
    }
    
    

    public Circle() {
    }

    public Circle(DrawShape drawShape) {
    }

    @Override
    public void draw() {
        drawShape.draw(getShapeName());
    }

    @Override
    public String getShapeName() {
        return "circle";
    }
}
