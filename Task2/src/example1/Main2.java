package example1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main2
{
	public static void main(String[] args)
	{
        // define spring container
        ApplicationContext container = new FileSystemXmlApplicationContext("/home/linuxmint/IdeaProjects/applicationContext.xml");

        // use Beans
        Shape circle = container.getBean("circleShape", CircleShape.class);
        circle.draw();

        Shape rectangle = container.getBean("rectangle", Rectangle.class);
        rectangle.draw();
    }
}
