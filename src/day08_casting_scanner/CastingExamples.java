package day08_casting_scanner;

public class CastingExamples {
    public static void main(String[] args) {

        int num1 = 22;
        byte num2 = (byte)num1;
        short num3 = (short)num1;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        
        double num4 = 55.3;
        float num5 = (float)num4;
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);

        double num6 = 1234.5;
        int num7 = (int)num6;
        System.out.println("num6 = " + num6);
        System.out.println("num7 = " + num7);
        
        int num8 = 300;
        byte num9 = (byte)num8;
        System.out.println("num8 = " + num8);
        System.out.println("num9 = " + num9);
        
        char letter = 'R';
        int numletter = letter;
        System.out.println("letter = " + letter);
        System.out.println("numletter = " + numletter);

    }
}
