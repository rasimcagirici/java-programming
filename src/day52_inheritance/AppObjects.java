package day52_inheritance;

public class AppObjects {
    public static void main(String[] args) {

        MobileApp mobileApp = new MobileApp();
        mobileApp.name = "Youtube";
        mobileApp.useTheApp(15);

        Instagram instagram = new Instagram();
        instagram.name = "Instagram";
        instagram.useTheApp(20);

        Discord discord = new Discord();
        discord.name = "Discord";
        discord.useTheApp(20);


    }
}
