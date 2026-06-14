import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class Task01Test {

    ApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContext.xml");

    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    private void capture() {
        System.setOut(new PrintStream(outContent));
    }

    private String output() {
        return outContent.toString().trim();
    }

    @Test
    public void contextLoads() {
        assertNotNull(context);
    }

    @Test
    public void circleBeanExists() {
        assertNotNull(context.getBean("circle"));
    }

    @Test
    public void squareBeanExists() {
        assertNotNull(context.getBean("square"));
    }

    @Test
    public void circleUsesConstructorInjection() {
        Object circle = context.getBean("circle");

        boolean hasDraw2dField = false;

        for (var f : circle.getClass().getDeclaredFields()) {
            if (f.getType().getSimpleName().equals("Draw2d")) {
                hasDraw2dField = true;
            }
        }

        assertTrue("Circle must use Draw2d dependency", hasDraw2dField);
    }

    @Test
    public void squareUsesSetterInjection() {
        Object square = context.getBean("square");

        boolean hasDraw3dField = false;

        for (var f : square.getClass().getDeclaredFields()) {
            if (f.getType().getSimpleName().equals("Draw3d")) {
                hasDraw3dField = true;
            }
        }

        assertTrue("Square must use Draw3d dependency", hasDraw3dField);
    }

    @Test
    public void testCircleOutput() throws Exception {
        capture();

        Object circle = context.getBean("circle");

        circle.getClass().getMethod("draw2d").invoke(circle);

        assertTrue(output().contains("Drawing a 2d for Circle"));
    }

    @Test
    public void testSquareOutput() throws Exception {
        capture();

        Object square = context.getBean("square");

        square.getClass().getMethod("draw2d").invoke(square);

        assertTrue(output().contains("Drawing a 2d for Square"));
    }
}
