package com.app;

public class Rectangle implements Shape {

    private Draw2d draw2d;
    private Draw3d draw3d;

    public Rectangle(Draw2d draw2d , Draw3d draw3d) {
        this.draw2d = draw2d;
        this.draw3d = draw3d;
    }

    public Rectangle()
    {
        this.draw2d = new Draw2d();
        this.draw3d = new Draw3d();
    }


    @Override
    public void draw2d() {
        System.out.println("draw 2d Rectangle");
    }

    @Override
    public void draw3d() {System.out.println("draw 3d Rectangle");}

    @Override
    public String getShapeName() {
        return "Rectangle";
    }
}
