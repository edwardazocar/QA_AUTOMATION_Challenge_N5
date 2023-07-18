package tasks.busqueda;

import actions.Click;
import actions.IsPresent;
import actions.Text;

import static ui.google.PaginaGoogle.*;

public class IngresarPaginaEnElBuscadorDeGoogle {

    public static void realizar(String pagina) throws Exception {
        IsPresent.element(INGRESAR_TEXTO_BUSCADOR);
        Text.set(INGRESAR_TEXTO_BUSCADOR, pagina);
        Thread.sleep(2000);
        Click.on(SELECCIONAR_PAGINA);
    }
}
