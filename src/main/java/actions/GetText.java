package actions;

import org.openqa.selenium.By;

import static factory.Session.getInstance;

public class GetText {
    public static String from(By locator) {
        return getInstance().getWebDriver().findElement(locator).getText();
    }
}
