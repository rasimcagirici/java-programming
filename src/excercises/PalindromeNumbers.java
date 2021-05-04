package excercises;

public class PalindromeNumbers {
    public static void main(String[] args) {

        int num = 1321;
        int temp = num;
        int reverse = 0;
        boolean isPalindrome = false;
        while (temp != 0) {
            int lastDigit;
            lastDigit = temp % 10;
            reverse = (reverse * 10) + lastDigit;
            temp = temp / 10;
        }
        if (reverse == num) {
            isPalindrome = true;
        }
        System.out.println(isPalindrome);

    }
}
