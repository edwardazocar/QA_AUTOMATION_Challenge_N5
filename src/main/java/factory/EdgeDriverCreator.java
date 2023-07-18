package factory;

import utils.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class EdgeDriverCreator extends WebDriverCreator {
    @Override
    public WebDriver createWebDriver() throws Exception {
        Configuration configuration = new Configuration();
        WebDriverManager.edgedriver().setup();
        EdgeOptions options = new EdgeOptions();
        options.addArguments("InPrivate");
        options.setHeadless(configuration.getHeadless());
        return new EdgeDriver(options);
    }
}


