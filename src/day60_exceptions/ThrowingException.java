package day60_exceptions;

public class ThrowingException {
    public static void main(String[] args) {
        System.out.println("Lets create exceptions");
//        RuntimeException e = new RuntimeException();
//        throw e;
        throw new RuntimeException();
    }
}
