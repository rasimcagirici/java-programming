package day63_collections;

import java.util.HashMap;
import java.util.Map;

public class MapsExamples {

    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"James");
        map.put(2,"Anna");
        map.put(2,"Daria"); //Daria will replace Anna because you can't have duplicate keys
        map.put(100,"Maxim");
        map.put(101,"Maxim"); //key has to be unique but value can be the same
        System.out.println(map);
        System.out.println(map.get(100));
        System.out.println(map.get(50));
        map.remove(1);
        System.out.println(map);
        map.put(1,"Kinga");
        System.out.println(map);
        map.remove("Maxim");

    }

}
