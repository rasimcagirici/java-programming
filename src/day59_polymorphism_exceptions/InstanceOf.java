package day59_polymorphism_exceptions;


import day57_abstraction_polymorphism.shapes.Circle;
import day57_abstraction_polymorphism.shapes.Shape;
import day57_abstraction_polymorphism.shapes.Square;


public class InstanceOf {

    public static void main(String[] args) {

        Shape shape = new Square();

        System.out.println(shape instanceof Circle);
        System.out.println(shape instanceof Square);

        if (shape instanceof Circle) {
            System.out.println("It is a Circle object");
        } else if (shape instanceof Square) {
            System.out.println("It is a Square object");
        }

        System.out.println(shape.getClass().getSimpleName());
        System.out.println(shape.getClass().getName());

        WebElement el = new Link();
        System.out.println(el.getClass().getSimpleName());

    }

}
