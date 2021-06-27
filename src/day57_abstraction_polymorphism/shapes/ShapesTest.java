package day57_abstraction_polymorphism.shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Shapes triangle = new Triangle();
        triangle.draw();

        Shapes circle = new Circle();
        circle.draw();

        Shapes square = new Square();
        square.draw();

    }
}
