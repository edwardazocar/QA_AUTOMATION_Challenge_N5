package runner;

import utils.Common;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.*;

@Test
@CucumberOptions(
        features = "src/test/java/features",
        glue = "steps",
        plugin = { "pretty", "html:reportes/cucumber-reports.html" }
        , tags = "@CP-0001"
)
public class RunnerTests extends AbstractTestNGCucumberTests {
    @BeforeClass
    @Parameters("browser")
    public void getBrowser(String browser) {
        Common.browserName = browser;
    }
}
