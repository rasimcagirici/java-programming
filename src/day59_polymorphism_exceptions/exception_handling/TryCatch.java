package day59_polymorphism_exceptions.exception_handling;

public class TryCatch {

    public static void main(String[] args) {
        try {

            System.out.println(10/2);
            System.out.println(10/0);
            System.out.println(10/3);

        } catch (ArithmeticException a) {

            System.out.println("Can't divide by zero or three");

        }
    }
}
