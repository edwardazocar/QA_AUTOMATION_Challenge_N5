package question.busqueda;

import actions.GetText;
import actions.ObtenerUrl;
import actions.Present;
import actions.Text;
import factory.Session;
import org.testng.Assert;

import static ui.netflix.PaginaHomeNetflix.*;
import static utils.UrlString.*;
import static utils.busqueda.DatosPaginaNetflix.*;

public class VerificarVisualizacionElementosPaginaNetflix {

    public static void comprobar() throws Exception {
        Assert.assertTrue(Present.element(TITULO_PAGINA_NETFLIX), "No se pudo encontrar el localizador del titulo de la pagina de netflix, No esta disponible");

        Assert.assertEquals(GetText.from(TITULO_PAGINA_NETFLIX), TITULO_PAGINA_NETFLIX_TXT, "El texto" + Text.get(TITULO_PAGINA_NETFLIX) + " no coincide con el esperado. Texto esperado: " + TITULO_PAGINA_NETFLIX_TXT);

        Assert.assertTrue(ObtenerUrl.contieneUrl(URL_PAGINA_NETFLIX), "No se pudo encontrar la url de la pagina de netflix, No esta disponible");

        // Imprimir el titulo de la pagina
        System.out.println("el titulo de la página es: " + Text.get(TITULO_PAGINA_NETFLIX));

        // Imprimir la url de la pagina
        System.out.println("la url de la página es: " + Session.getInstance().getWebDriver().getCurrentUrl());

    }
}
