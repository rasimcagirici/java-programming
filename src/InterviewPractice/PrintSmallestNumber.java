package InterviewPractice;

public class PrintSmallestNumber {

    public static void main(String[] args) {

        int array[][] = {{2,4,0},{3,1,7},{1,2,9}};
        int smallNumber = array[0][0];
        int largestNumber = array[0][0];

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                if (smallNumber > array[i][j]) {
                    smallNumber = array[i][j];
                    largestNumber = array[i][j];
                    for (int k = 0; k < 3; k++) {
                        if (largestNumber < array[k][j]) {
                            largestNumber = array[k][j];
                        }
                    }
                }
            }
        }
        System.out.println(smallNumber);
        System.out.println(largestNumber);
    }
}
