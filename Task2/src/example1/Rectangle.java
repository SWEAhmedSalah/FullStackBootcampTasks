package example1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Rectangle implements Shape {

    private DrawShape drawShape;

    @Override
    public void draw() {
        drawShape.draw(getShapeName());
    }

    @Override
    public String getShapeName() {
        return "rectangle";
    }

    public DrawShape getDrawShape() {
        return drawShape;
    }

    @Autowired
    public void setDrawShape(DrawShape drawShape) {
        this.drawShape = drawShape;
    }
}
