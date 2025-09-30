package com.ioc.example;

public class Main
{
	public static void main(String[] args)
	{
        Rectangle rectangle = new Rectangle();
        rectangle.setDrawShape(new DrawShape());
        rectangle.draw();
    }
}
