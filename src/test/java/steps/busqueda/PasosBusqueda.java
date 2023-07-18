package steps.busqueda;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import question.busqueda.VerificarVisualizacionElementosPaginaNetflix;
import tasks.busqueda.*;

public class PasosBusqueda {

    @Dado("que el usuario ingresa {string} en el buscador de google")
    public void queElUsuarioIngresaEnElBuscadorDeGoogle(String pagina) throws Exception {
        IngresarPaginaEnElBuscadorDeGoogle.realizar(pagina);
    }

    @Cuando("el usuario selecciona el resultado de la busqueda")
    public void elUsuarioSeleccionaElResultadoDeLaBusqueda() throws Exception {
        SeleccionarResultadoDeLaBusqueda.realizar();
    }

    @Entonces("se visualizan todos los elementos de la pagina de netflix")
    public void seVisualizanTodosLosElementosDeLaPaginaDeNetflix() throws Exception {
        VerificarVisualizacionElementosPaginaNetflix.comprobar();
    }
}
