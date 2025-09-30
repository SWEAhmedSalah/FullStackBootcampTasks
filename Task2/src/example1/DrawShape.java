package example1;

import org.springframework.stereotype.Component;

@Component
public class DrawShape
{
    public void draw(String shapeName)
    {
        System.out.printf("%s is now Drawing\n" , shapeName);
    }
}
