package co.udea.certificacion.calidad.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.udea.certificacion.calidad.userinterfaces.personasPage.BOTONCONTINUAR;


public class ValidarSimulador implements Question<Boolean> {

    private static final String textoAValidarSimulador = "CONTINUAR";

    @Override
    public Boolean answeredBy(Actor actor) {
        String stringTemporal = Text.of(BOTONCONTINUAR).viewedBy(actor).asString();
        if (stringTemporal.contains(textoAValidarSimulador)) {
            return true;
        } else {
            return false;
        }
    }


    public static ValidarSimulador paginaSimulador() {
        return new ValidarSimulador();
    }
}
