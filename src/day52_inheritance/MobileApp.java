package day52_inheritance;

public class MobileApp {
    String name;
    double version;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public double getVersion() {
        return version;
    }

    protected boolean download() {
        System.out.println("App: " + name + " version: " + version + " is downloaded");
        return true;
    }

    public void useTheApp(int minutes) {
        System.out.println("Using " + name + " app for " + minutes + " minutes");
    }
}
