package day07_arithmetic_operators_casting;

public class StringConcat {
    public static void main(String[] args) {
        System.out.println("Java" + 5 + 3);
        System.out.println(5 + 3 + "Java");
        System.out.println("Java" + (5+3));

        System.out.println("Hello" + 1+2+3);
        System.out.println("Hello" + (1+2+3));

        String str1 = "Hello";
        String str2 = "Friends";
        System.out.println(str1 + " " + str2);
        int num1 = 7;
        int num2 = 8;
        System.out.println(num1+""+num2);

        char char1 = 'a';
        char char2 = 'b';
        System.out.println(char1+char2);
        System.out.println(char1 + "" + char2);
    }
}
