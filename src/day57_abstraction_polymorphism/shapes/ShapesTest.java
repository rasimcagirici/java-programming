package day57_abstraction_polymorphism.shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapesTest {
    public static void main(String[] args) {

        Shape triangle = new Triangle();
        triangle.draw();

        Shape circle = new Circle();
        circle.draw();

        Shape square = new Square();
        square.draw();

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Triangle());
        shapes.add(new Circle());
        shapes.add(new Square());

        for (Shape each : shapes) {
            each.draw();
        }
    }
}
