package java_practices.string;

public class StringClassDemo {

    public static void main(String[] args) {

        String a = "hello";

        System.out.println(a.charAt(2));

        System.out.println(a.indexOf("e"));

        System.out.println(a.concat(" world"));

        a = a.concat(" world");

        System.out.println(a);

        StringBuffer sb = new StringBuffer("hello");
        sb.append(" world");
        System.out.println(sb);

        sb.insert(2,"She");
        System.out.println(sb);

        sb.replace(5,7,"aa");
        System.out.println(sb);

        sb.deleteCharAt(12);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        //StringBuilder is not thread safe. It is non synchronized, it is faster


    }

}
