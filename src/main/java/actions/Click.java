package actions;

import factory.Session;
import org.openqa.selenium.By;


public class Click {
    public static void on(By locator) throws Exception {
        WaitUntil.present(locator);
        Session.getInstance().getWebDriver().findElement(locator).click();
    }

}
