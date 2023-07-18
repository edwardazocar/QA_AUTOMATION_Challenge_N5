package tasks.busqueda;

import actions.Click;
import actions.IsPresent;

import static ui.google.PaginaResultadoBusqueda.*;

public class SeleccionarResultadoDeLaBusqueda {

    public static void realizar() throws Exception {
        IsPresent.element(PAGINA_NETFLIX);
        Click.on(PAGINA_NETFLIX);
    }
}
