package actions;

import factory.Session;

public class ObtenerUrl {

    public static boolean contieneUrl(String URLContaint) {
        String url = Session.getInstance().getWebDriver().getCurrentUrl();
        return url.contains(URLContaint);
    }
}
