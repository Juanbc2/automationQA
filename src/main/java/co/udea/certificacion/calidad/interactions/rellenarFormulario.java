package co.udea.certificacion.calidad.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.udea.certificacion.calidad.userinterfaces.personasPage.BOTONCONTINUAR;
import static co.udea.certificacion.calidad.userinterfaces.simuladorPage.*;

public class rellenarFormulario implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BOTONCONTINUAR));
        actor.attemptsTo(Click.on(BOTONRADIALSI));
        actor.attemptsTo(Enter.theValue("2000000").into(INPUTMONTO));
        actor.attemptsTo(Enter.theValue("72").into(INPUTMESES));
        actor.attemptsTo(Click.on(INPUTFECHA));
        actor.attemptsTo(Click.on(YEAR));
        actor.attemptsTo(Click.on(MONTH));
        actor.attemptsTo(Click.on(DAY));

    }

    public static rellenarFormulario escribirCampos() {
        return Tasks.instrumented(rellenarFormulario.class);
    }

}
