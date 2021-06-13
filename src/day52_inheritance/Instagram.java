package day52_inheritance;

public class Instagram extends MobileApp {

    public void postPhoto() {
        System.out.println("Posting photo on Instagram");
    }

    @Override
    protected boolean download() {
        System.out.println("Download Instagram " + version);
        super.download();
        return true;
    }

    @Override
    public void useTheApp(int minutes) {

        System.out.println("Using instagram app features");
        postPhoto();
        super.useTheApp(20);

    }
}
