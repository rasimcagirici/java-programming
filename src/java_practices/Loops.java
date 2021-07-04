package java_practices;

public class Loops {

    public static void main(String[] args) {

        int count = 1;

        for (int i = 0; i < 4; i++) {

            System.out.print(count++ + " ");

            for (int j = i; j < 3; j++) {
                System.out.print(count++ + " ");
            }

            System.out.println();
        }
    }

}
