package co.udea.certificacion.calidad.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.udea.certificacion.calidad.userinterfaces.UsuarioPage.TEXTOCREDITO;

public class ValidarPersonas implements Question<Boolean> {

    public static final String textoAValidar= "de consumo";

    @Override
    public Boolean answeredBy(Actor actor) {
        String stringTemporal = Text.of(TEXTOCREDITO).viewedBy(actor).asString();
        if (stringTemporal.contains(textoAValidar)) {
            return true;
        } else {
            return false;
        }
    }

    public static ValidarPersonas paginaCredito() {
        return new ValidarPersonas();
    }
}

