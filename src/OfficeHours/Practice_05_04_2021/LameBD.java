package OfficeHours.Practice_05_04_2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LameBD {
    public static String lameDB(String db, String op, String id, String data) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList(db.split("#")));

        int idNum = Integer.parseInt(id);

        switch (op) {
            case "add":
                if (idNum > list.size()) {
                    list.add(idNum-1,id+data);
                } else {
                    int newId = 1;
                    String str = "";
                    for (int i = 0; i < list.size(); i++) {
                        if (i == idNum-1) {
                            str += idNum + data + "#";
                            newId++;
                        }
                        str += newId++ + list.get(i).substring(1) + "#";
                    }
                    return str.substring(0,str.length()-1);
                }
                break;
            case "edit":
                list.set(idNum-1,id + data);
                break;
            case "delete":
                list.remove(idNum-1);
                break;
        }
        String listStr = list.toString();
        return listStr.substring(1,listStr.length()-1).replace(", ","#");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(lameDB("1etsy#2wooden#3spoon","add","4","aaa"));
        System.out.println(lameDB("1test#2bla#3foo","edit","2","bbb"));
        System.out.println(lameDB("1tst#2bla#3foo","delete","1",""));
        System.out.println(lameDB("1etsy#2wooden#3spoon","add","1","bbb"));
    }
}
