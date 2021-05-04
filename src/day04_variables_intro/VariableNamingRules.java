package day04_variables_intro;

public class VariableNamingRules {
    public static void main(String[] args){
        int static2 = 22;
        int $tatic = 44;
        int staticVar = 234;

        int salary$ = 55;
//        int 1stMonthSlary == 3000; --> error, cannot start with number
        int $ = 10;
        int _ = 3;
        System.out.println($);
        System.out.println(_);
        /*Above variables ($ and _) work fine but it is not recommended.
          we should use meaningful names
         */


    }
}
