package factory;

import utils.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxDriverCreator extends WebDriverCreator {
    @Override
    public WebDriver createWebDriver() throws Exception {
        Configuration configuration = new Configuration();
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("-private");
        options.setHeadless(configuration.getHeadless());
        return new FirefoxDriver(options);
    }
}