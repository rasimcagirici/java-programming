package day34_void_methods;

public class CallDisplayMethod {
    public static void main(String[] args) {
        FirstMethod.displayMessage();
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " - ");
            FirstMethod.displayMessage();
        }
    }
}
