package day18_conditions_practice_strings_intro;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {
        String todaysClass = "basketball";

        if(todaysClass.equals("java"))
            System.out.println("Java is fun");
        else if(todaysClass.equals("python"))
            System.out.println("Python is fun");
        else if(todaysClass.equals("soft skills"))
            System.out.println("Soft skills is fun");
        else
            System.out.println("It is not java, python, or soft skills it is " + todaysClass);

        int a = 1;
        if (a == 1) {
            System.out.println("a is 1");
            System.out.println("1 is a");
        }
    }
}
