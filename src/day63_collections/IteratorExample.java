package day63_collections;

import day41_arraylist.ArraysAsList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("john");
        list.add("jamie");
        list.add("jorege");

        System.out.println(list);

        Iterator<String> it = list.iterator();

        it.next();
        it.remove();

        System.out.println(list);

        Set<String> names = new HashSet<>();
        names.add("james");
        names.add("kinga");
        names.add("mj");
        names.add("john");
        names.add("pavrin");

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("john")) {
                iterator.remove();
            }
        }

        System.out.println(names);


    }


}
