package day59_polymorphism_exceptions;

public class ElementsTest {

    public static void main(String[] args) {

        Link link = new Link();
        link.click();
        link.sendKeys("Hi");
        link.getText();
        link.getLinkHref();

        WebElement link1 = new Link();
        link1.click();
        link1.sendKeys("Hello");
        link1.getText();

        WebElement username = new InputField();

        WebElementUtil.clickElement(link1);
        WebElementUtil.clickElement(username);

        WebElement login = WebElementUtil.getLinkWithText("Hello");
        login.click();

    }

}
