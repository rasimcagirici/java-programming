package day33_arrays;

import java.util.Arrays;

public class MultiArrayExample {
    public static void main(String[] args) {
        String[][] users = new String[3][2];
        users[0][0] = "Teodoras Tsvetanow";
        users[0][1] = "TeodorasPWD12";
        users[1][0] = "Anna Ziyayeva";
        users[1][1] = "AnnaAlmaty123";
        users[2][0] = "Parvin Altae";
        users[2][1] = "ParvinVienna321";

        String[][] usersData = { {"Teodoras Tsvetanow", "TeodorasPWD12"},
                                {"Anna Ziyayeva", "AnnaAlmaty123"},
                                {"Parvin Altae", "ParvinVienna321"} };

        System.out.println(usersData[0][0]);
        System.out.println(usersData[1][0]);
        System.out.println(usersData[2][0]);

        System.out.println(usersData[0][1]);
        System.out.println(usersData[1][1]);
        System.out.println(usersData[2][1]);

        System.out.println(Arrays.deepToString(usersData));
    }
}
