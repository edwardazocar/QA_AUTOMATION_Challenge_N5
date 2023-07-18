package steps;

import abilities.Navegador;
import factory.Session;
import factory.WebDriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.Common;

import java.io.ByteArrayInputStream;

import static utils.Common.jsonGeneralData;

public class Hooks {
    @Before
    public void antes(Scenario scenario) throws Exception {
        Session.getInstance().setWebDriver(WebDriverFactory.getDriver(Common.browserName));
        System.out.println("--------------------------------------------------------------");
        System.out.println("Scenario  : " + scenario.getName());
        System.out.println("Feature   : " + scenario.getUri());
        System.out.println("Info Tags : " + scenario.getSourceTagNames());
        if (Session.getInstance().getWebDriver() == null)
            System.out.println("Dirver    : is null");
        else
            System.out.println("Dirver    : is not null");
        System.out.println("--------------------------------------------------------------");
        Navegador.abrir();
    }

    @After
    public void despues(Scenario scenario) {
        System.out.println("--------------------------------------------------------------");
        System.out.println("Final scenario state  : " + scenario.getStatus());
        System.out.println("--------------------------------------------------------------");
        Allure.addAttachment(
                scenario.getName(),
                new ByteArrayInputStream(((TakesScreenshot) Session.getInstance().getWebDriver()).getScreenshotAs(OutputType.BYTES))
        );
        if (Session.getInstance().getWebDriver() != null) {
            Session.getInstance().getWebDriver().quit();
            Session.getInstance().removeWebDriver();
        }
        jsonGeneralData.clear();
    }

    @Before("@REGRESION")
    public void methodsExecuteBefore() {
        System.out.println("************ INICIANDO TEST. ******************");
    }

    @After("@REGRESION")
    public void methodsExecuteAfter() {
        System.out.println("************ FINALIZO TEST. ******************");
    }

}
