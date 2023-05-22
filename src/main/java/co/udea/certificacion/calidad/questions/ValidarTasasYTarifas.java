package co.udea.certificacion.calidad.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.udea.certificacion.calidad.userinterfaces.personasPage.BOTONCONTINUAR;
import static co.udea.certificacion.calidad.userinterfaces.resultadosPage.TEXTORESULTADOS;

public class ValidarTasasYTarifas implements Question<Boolean> {

    private static final String textoAValidarResultados = "Te ofrecemos estas";
    @Override
    public Boolean answeredBy(Actor actor) {
        String stringTemporal = Text.of(TEXTORESULTADOS).viewedBy(actor).asString();
        if (stringTemporal.contains(textoAValidarResultados)) {
            return true;
        } else {
            return false;
        }
    }

    public static ValidarTasasYTarifas paginaResultados() {
        return new ValidarTasasYTarifas();
    }

}
