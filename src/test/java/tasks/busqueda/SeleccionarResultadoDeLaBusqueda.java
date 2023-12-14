package tasks.busqueda;

import actions.Click;
import actions.IsPresent;
import actions.Present;

import static ui.google.PaginaResultadoBusqueda.*;

public class SeleccionarResultadoDeLaBusqueda {

    public static void realizar() throws Exception {
        if (Present.element(BOTON_AHORA_NO, 2)) {
            Click.on(BOTON_AHORA_NO);
        }
        IsPresent.element(PAGINA_NETFLIX);
        Click.on(PAGINA_NETFLIX);
    }
}
