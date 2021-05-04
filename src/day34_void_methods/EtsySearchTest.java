package day34_void_methods;

public class EtsySearchTest {
    public static void main(String[] args) {
        System.out.println("----STARTING ETSY SEARCH SMOKE TEST----");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultDisplayed();
        System.out.println("----ETSY SMOKE TEST COMPLETED - PASS----");
    }
    public static void openBrowser() {
        System.out.println("Launching Google Chrome browser");
    }
    public static void navigateToEtsyUrl() {
        System.out.println("Navigating to https://etsy.com/");
    }
    public static void searchForWoodenSpoon() {
        System.out.println("PASS: Verify Etsy home page is displayed");
        System.out.println("Type 'Wooden spoon' in search field and click search");
    }
    public static void verifyResultDisplayed() {
        System.out.println("PASS: Search results are successfully displayed");
    }

}
