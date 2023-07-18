package factory;

import org.openqa.selenium.WebDriver;

public abstract class WebDriverCreator {
    public abstract WebDriver createWebDriver() throws Exception;
}

