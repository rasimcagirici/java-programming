package day49_static;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

public class StaticMethods {
    int num = 10;
    static int count = 5;

    public static void displayMessages(String message) {
        System.out.println("Message: " + message);
        //System.out.println("num = " + num); //ERROR: num is instance variable. static can't access
        System.out.println("count = " + count);
    }

    public static void anotherStaticMethod() {
        System.out.println("another static method");
        displayMessages("Hello");
    }

    public void instanceMethod() {
        System.out.println("instanceMethod");
        System.out.println("num = " + num);
        System.out.println("count = " + count);
        displayMessages("hello from instance method");
    }
}
