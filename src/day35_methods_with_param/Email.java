package day35_methods_with_param;

public class Email {
    public static void main(String[] args) {
        buildEmail("rasim","gmail");
        buildEmail("rasimcagirici","gmail");
        buildEmail("nursedacagirici","gmail");
        buildEmail("baby","cagirici");
        buildEmail("Rasim Cagirici 4".replace(" ", "_").toLowerCase(),"gmail");
    }
    public static void buildEmail(String name, String domain) {
        System.out.println(name + "@" + domain + ".com");
    }
}
