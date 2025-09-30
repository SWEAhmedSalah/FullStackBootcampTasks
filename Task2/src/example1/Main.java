package example1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
	public static void main(String[] args)
	{
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");

        CircleShape circleShape = container.getBean("circleShape", CircleShape.class);

        circleShape.draw();

        Rectangle rectangle = container.getBean("rectangle", Rectangle.class);

        rectangle.draw();
    }
}
