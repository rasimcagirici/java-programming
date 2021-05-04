package day41_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
        List<String> myCars = new ArrayList<>();
        myCars.add("Tesla");
        myCars.add("Range Rover");
        myCars.add("Mercedes");
        myCars.add("BMW");
        myCars.add("Ferrari");
        myCars.add(0, "Jeep");
        myCars.add(1, "Porsche");
        myCars.add(2, "Bentley");
        System.out.println(myCars);
        String allCarsIn1St = myCars.toString();
        System.out.println(allCarsIn1St);
        myCars.set(0, "Lamborghini");
        System.out.println(myCars);
        myCars.set(4, "Honda");
        System.out.println(myCars);
        myCars.set(4, "Range Rover");
        System.out.println(myCars);
        System.out.println("Index of BMW = " + myCars.indexOf("BMW"));
        int teslaIndex = myCars.indexOf("Tesla");
        System.out.println("Index of Tesla = " + teslaIndex);
        myCars.set(teslaIndex, "Sahin");
        System.out.println(myCars);
        myCars.set(teslaIndex, "Tesla");
        System.out.println(myCars);
        myCars.set(myCars.indexOf("BMW"), "Trabant");
        System.out.println(myCars);
        myCars.set(myCars.indexOf("Trabant"),"BMW");
        System.out.println(myCars);

        if (myCars.contains("BMW")) {
            myCars.set(myCars.indexOf("BMW"), "Bugatti");
        } else {
            System.out.println("BMW not found");
        }
        System.out.println("After setting Buggatti = " + myCars);
        myCars.add("BMW");
        System.out.println(myCars);
        Collections.sort(myCars);
        System.out.println(myCars);
        myCars.add("Trabant");
        myCars.add("Lada");
        myCars.add("Toyota");

        for (int i = 0; i < myCars.size(); i++) {
            if (myCars.get(i).equals("Trabant")) {
                myCars.set(i, "Prius");
            } else if (myCars.get(i).equals("Lada")) {
                myCars.set(i, "Lexus");
            } else if (myCars.get(i).equals("Toyota")) {
                myCars.set(i,"Audi");
            }
        }
        Collections.sort(myCars);
        System.out.println(myCars);
    }
}
