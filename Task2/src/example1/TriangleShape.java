package example1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TriangleShape implements Shape
{
    @Autowired
    private DrawShape drawShape;

    @Override
    public void draw() {
        drawShape.draw(this.getShapeName());
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }
}
