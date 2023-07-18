package factory;

import utils.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverCreator extends WebDriverCreator {
    @Override
    public WebDriver createWebDriver() throws Exception {
        Configuration configuration = new Configuration();
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--incognito");
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-gpu");
        options.addArguments("--start-maximized");
        //options.setHeadless(configuration.getHeadless());
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation", "load-extension"});
        return new ChromeDriver(options);
    }
}

