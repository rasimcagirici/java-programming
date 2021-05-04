package day14_multi_branch_if_statements;

public class LogicalANDOperator {
    public static void main(String[] args) {
        int apples = 10;
        int oranges = 20;

        if(apples > 5 && oranges <20) {
            System.out.println("Apples count is " + apples + " and oranges counts is " + oranges);
        } else if(apples > 5 || oranges <20) {
            System.out.println("Apples count is more than 5" + " oranges count is less than 20");
        }
    }
}
