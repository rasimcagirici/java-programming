package day23_string_manipulation_while_loop;

public class FirstLoop {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 5) {
            System.out.println("Seni Cok seviyorum Seda!!!");
            i++;
        }

        byte b = 104;
        boolean check = b < 100;
        if (check) {
            b -= 100;

        } else {
            b = 50;
        }
        System.out.println(b);

}
}
