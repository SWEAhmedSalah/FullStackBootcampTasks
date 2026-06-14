package com.app;

public class Circle implements Shape {

    private Draw2d draw2d;
    private Draw3d draw3d;

    // Constructor injection required
    public Circle(Draw2d draw2d , Draw3d draw3d) {
        this.draw2d = draw2d;
        this.draw3d = draw3d;
    }

    public void draw2d() {
        draw2d.drawCircle();

    }

    @Override
    public void draw3d() {

    }

    @Override
    public String getShapeName() {
        return "Circle";
    }
}