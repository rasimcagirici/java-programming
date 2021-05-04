package excercises;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(3224));

    }
    public static boolean isPalindrome(int num) {
        int temp = num;
        int reverse = 0;
        while (temp != 0) {
            int lastDigit = temp % 10;
            reverse = (reverse * 10) + lastDigit;
            temp = temp / 10;
        }
        return reverse == num;
    }
}
