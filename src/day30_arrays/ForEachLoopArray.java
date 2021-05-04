package day30_arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {
        int[] data = {25, 50, 75, 100, 125, 150, 175, 200, 500, 900};
        int count = 1;

        for (int i = 0; i < data.length; i++) {
            System.out.println("data " + count + " is " + data[i]);
            count++;
        }

        for (int eachNum : data ) {
            System.out.println("data " + count + " is " + eachNum);
            count++;
        }
        System.out.println(data[data.length-1]);

        for (int i = data.length-1; i >= 0; i--) {
            System.out.print(data[i] + " ");
        }
    }
}
