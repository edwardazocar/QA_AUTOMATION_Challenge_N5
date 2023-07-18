package actions;

import utils.Configuration;
import org.openqa.selenium.By;
import org.testng.Assert;

public class IsPresent {
    public static void element(By locator, int waitSeconds) throws Exception {
        Assert.assertTrue(WaitUntil.present(locator, waitSeconds), "<No se encuentra el localizador: " + locator.toString() + ">");
    }

    public static void element(By locator) throws Exception {
        Configuration configuration = new Configuration();
        element(locator, configuration.getWaitSecond());
    }

}
