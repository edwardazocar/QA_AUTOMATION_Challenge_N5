package factory;

import utils.Browser;
import utils.Configuration;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;

public class WebDriverFactory {
    @Parameters("browser")
    public static WebDriver getDriver(String browser) throws Exception {
        Configuration configuration = new Configuration();
        browser = browser.toUpperCase().trim();
        switch (browser.trim()) {
            case Browser.CHROME:
                ChromeDriverCreator chromeDriverCreator = new ChromeDriverCreator();
                return chromeDriverCreator.createWebDriver();
            case Browser.FIREFOX:
                FirefoxDriverCreator firefoxDriverCreator = new FirefoxDriverCreator();
                return firefoxDriverCreator.createWebDriver();
            case Browser.EDGE:
                EdgeDriverCreator edgeDriverCreator = new EdgeDriverCreator();
                return edgeDriverCreator.createWebDriver();
            default:
                throw new Exception("El Navegador: " + browser + " no soportado o parametros enviados incorrectos");
        }
    }
}