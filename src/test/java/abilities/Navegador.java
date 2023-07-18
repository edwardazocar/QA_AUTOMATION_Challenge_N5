package abilities;

import factory.Session;
import utils.Configuration;

public class Navegador {

    public static void abrir() throws Exception {
        Configuration configuration = new Configuration();
        abrir(configuration.getUrl());
    }

    public static void abrir(String url) {
        Session.getInstance().getWebDriver().manage().deleteAllCookies();
        Session.getInstance().getWebDriver().get(url);
    }

}
