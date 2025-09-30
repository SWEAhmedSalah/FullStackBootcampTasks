package example1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CircleShape implements Shape {         //circleShape

    private DrawShape drawShape;


    @Autowired
    public CircleShape(DrawShape drawShape) {
        this.drawShape = drawShape;
    }


    public CircleShape() {
    }

    @Override
    public void draw() {
        drawShape.draw(getShapeName());
    }

    @Override
    public String getShapeName() {
        return "circle";
    }


    public void connectToDatabase(){
        System.out.println("Connecting to database...");
    }

}
