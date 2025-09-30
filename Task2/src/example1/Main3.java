package example1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main3
{
	public static void main(String[] args)
	{
        // define spring container
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");

        CircleShape circleShape = (CircleShape) container.getBean("circleShape");

//        circleShape.draw();

        Rectangle rectangle = (Rectangle) container.getBean("rectangle");
        rectangle.draw();

        TriangleShape triangleShape = (TriangleShape) container.getBean("triangleShape");
        triangleShape.draw();
    }
}
