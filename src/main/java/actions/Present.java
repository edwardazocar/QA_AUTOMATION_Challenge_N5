package actions;

import utils.Configuration;
import org.openqa.selenium.By;

public class Present {

    public static boolean element(By locator) throws Exception {
        Configuration configuration = new Configuration();
        return element(locator, configuration.getWaitSecond());
    }

    public static boolean element(By locator, int waitSeconds) throws Exception {
        return WaitUntil.present(locator, waitSeconds);
    }

}
