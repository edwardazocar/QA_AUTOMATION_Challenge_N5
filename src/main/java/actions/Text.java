package actions;

import factory.Session;
import org.openqa.selenium.By;

public class Text {
    public static void set(By locator, String text) throws Exception {
        WaitUntil.present(locator);
        Session.getInstance().getWebDriver().findElement(locator).clear();
        Session.getInstance().getWebDriver().findElement(locator).sendKeys(text);
    }

    public static String get(By locator) throws Exception {
        WaitUntil.present(locator);
        return Session.getInstance().getWebDriver().findElement(locator).getText().trim();
    }

}
