package excercises;

import java.util.ArrayList;

import java.util.*;

public class ReplitExample {
    public static String blogDb(ArrayList<String[]> r, String id) {
        String result = "";
        for (int i = 0; i < r.size(); i++) {
            for (int j = 0; j < r.size(); j++) {
                if (r.get(i)[j].equals(id)) {
                    result += r.get(i)[j+1] + "\n" + r.get(i)[j+2];
                }
            }
        }
        return result;
    }
    // Do not touch below
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String id = in.next();
        in.nextLine();
        ArrayList<String[]> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(new String[]{in.nextLine(), in.nextLine(), in.nextLine()});
        }

        System.out.println(blogDb(list, id));

    }
}