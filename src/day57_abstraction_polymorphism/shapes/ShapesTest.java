package day57_abstraction_polymorphism.shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapesTest {
    public static void main(String[] args) {

        Shapes triangle = new Triangle();
        triangle.draw();

        Shapes circle = new Circle();
        circle.draw();

        Shapes square = new Square();
        square.draw();

        List<Shapes> shapes = new ArrayList<>();
        shapes.add(new Triangle());
        shapes.add(new Circle());
        shapes.add(new Square());

        for (Shapes each : shapes) {
            each.draw();
        }
    }
}
