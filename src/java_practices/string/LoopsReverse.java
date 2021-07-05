package java_practices.string;

public class LoopsReverse {

    public static void main(String[] args) {

        int count = 1;

        for (int i = 4; i > 0; i--) {

            System.out.print(count++ + " ");

           for (int j = i; j < 4; j++) {

               System.out.print(count++ + " ");

           }

          System.out.println();

       }

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                System.out.print("\t");
            }
            System.out.println();
        }

        int counter = 0;

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter+=3);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
