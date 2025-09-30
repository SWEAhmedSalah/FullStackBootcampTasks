package com.ioc.example;

public class Main3
{
	public static void main(String[] args)
	{
       Circle circle = new Circle(new DrawShape());
       circle.draw();
    }
}
