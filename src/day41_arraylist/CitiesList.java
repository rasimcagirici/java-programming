package day41_arraylist;

import java.util.ArrayList;

public class CitiesList {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("New York City");
        cities.add("Los Angeles");
        cities.add("Istanbul");
        cities.add("Sakarya");
        cities.add("Washington DC");
        cities.add(0,"Ashgabat");
        System.out.println(cities);
        System.out.println("First city = " + cities.get(0));
        System.out.println("Last city = " + cities.get(cities.size()-1));
        System.out.println("Count of items = " + cities.size());

        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + " ");
        }
        System.out.println();

        for (String each : cities) {
            System.out.print(each + " ");
        }
        System.out.println();

        cities.remove(4);
        cities.remove("Ashgabat");
        System.out.println(cities);
        cities.clear();
        System.out.println(cities);
    }
}
