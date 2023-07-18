package actions;

import factory.Session;
import utils.Configuration;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUntil {
    public static void present(By locator) throws Exception {
        Configuration configuration = new Configuration();
        present(locator, configuration.getWaitSecond());
    }

    public static boolean present(By locator, int seconds) throws Exception {
        boolean exist = false;
        Duration duration = Duration.ofSeconds(seconds);
        try {
            WebDriverWait wait = new WebDriverWait(Session.getInstance().getWebDriver(), duration);
            exist = wait.until(ExpectedConditions.and(
                    ExpectedConditions.presenceOfElementLocated(locator),
                    ExpectedConditions.visibilityOfElementLocated(locator),
                    ExpectedConditions.elementToBeClickable(locator)));
        } catch (NoSuchElementException | TimeoutException e) {
            e.printStackTrace();
        }
        return exist;
    }

}



