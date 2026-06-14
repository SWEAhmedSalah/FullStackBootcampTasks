package com.app;

public class Square implements Shape {

    private Draw3d draw3d;
    private Draw2d draw2d;

    @Override
    public void draw2d() {
        draw2d.drawSquare();
    }

    @Override
    public void draw3d() {
        draw3d.drawSquare();
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    public void setDraw3d(Draw3d draw3d) {
        this.draw3d = draw3d;
    }

    public void setDraw2d(Draw2d draw2d) {
        this.draw2d = draw2d;
    }
}