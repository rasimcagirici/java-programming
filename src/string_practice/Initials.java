package string_practice;

public class Initials {
    public static void main(String[] args) {
        String name = "Nurseda Cagirici";
        System.out.println(name.substring(0,1).toUpperCase()+name.substring(name.indexOf(" ")+1,name.indexOf(" ")+2).toUpperCase());
        int space = name.indexOf(" ");
        String initials = name.substring(0,1).toUpperCase();
        initials += name.substring(space+1,space+2).toUpperCase();
        System.out.println("initials = " + initials);
    }
}
