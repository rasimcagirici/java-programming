package day52_inheritance;

public class Discord extends MobileApp{

    public void chat(String someone) {
        System.out.println("Chatting with " + someone);
    }

    @Override
    protected boolean download() {
        System.out.println("Download Discord " + version);
        super.download();
        return true;
    }

    @Override
    public void useTheApp(int minutes) {
        super.useTheApp(minutes);
        chat("Vladislav");
    }


}
