package java_practices.string;

public class StringReverse {

    public static void main(String[] args) {

        String r = "madam";
        String result = "";

        StringBuffer sb = new StringBuffer(r);

        sb.reverse();
        System.out.println(r.equals(sb.toString()));



        for (int i = r.length()-1; i >= 0; i--) {
            result += r.charAt(i);
        }
        System.out.println(r.equals(result));
    }


}
