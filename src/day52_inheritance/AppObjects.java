package day52_inheritance;

public class AppObjects {
    public static void main(String[] args) {

        MobileApp mobileApp = new MobileApp();
        mobileApp.setName("YouTube");
        mobileApp.useTheApp(15);
        mobileApp.download();

        Instagram instagram = new Instagram();
        instagram.setName("Instagram");
        instagram.useTheApp(20);
        instagram.setVersion(5.3);
        instagram.download();

        Discord discord = new Discord();
        discord.setName("Discord");
        discord.useTheApp(20);
        discord.setVersion(6.234);
        discord.download();


    }
}
