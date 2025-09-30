package com.ioc.example;

public class Rectangle implements Shape {

    private DrawShape drawShape;
    private int height;
    private int width;

    public Rectangle()
    {}


    @Override
    public void draw() {
        System.out.println("draw Rectangle");
    }

    @Override
    public String getShapeName() {
        return "rectangle";
    }

    public DrawShape getDrawShape() {
        return drawShape;
    }

    public void setDrawShape(DrawShape drawShape) {
        this.drawShape = drawShape;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
