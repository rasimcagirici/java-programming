package day17_ternary_nested_conditions;

public class TeslaNestedIf {
    public static void main(String[] args) {
        char model = 'S';
        String trim = "long range";

        if (model == 'S') {
            if (trim.equals("long range")) {
                System.out.println("It is cheap one");
                System.out.println("range: 412");
                System.out.println("top speed: 155mph");
                System.out.println("0-60-3.1 sec");
            }
            if(trim.equals("Plaid")) {
                System.out.println();
            }
        }


    }
}
