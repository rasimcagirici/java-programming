package day10_shorthand_operators;

public class IncrementDecrementOperators {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i = " + i);
        i++;
        System.out.println("i = " + i);
        
        int linesOfCode = 15;
        System.out.println("LinesOfCode = " + linesOfCode);
        linesOfCode++;
        ++linesOfCode;
        linesOfCode += linesOfCode;
        linesOfCode = linesOfCode + 1;
        System.out.println("linesOfCode = " + linesOfCode);

        linesOfCode--;
        --linesOfCode;
        linesOfCode -= 1;
        linesOfCode = linesOfCode - 1;
        
    }
}
