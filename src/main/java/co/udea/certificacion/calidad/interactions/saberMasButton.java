package co.udea.certificacion.calidad.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


import static co.udea.certificacion.calidad.userinterfaces.personasPage.BOTONSABERMAS;
import static co.udea.certificacion.calidad.userinterfaces.personasPage.CERRARMODAL;

public class saberMasButton implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CERRARMODAL));
        actor.attemptsTo(Click.on(BOTONSABERMAS));
    }

    public static saberMasButton presionarSaberMas() {
        return Tasks.instrumented(saberMasButton.class);
    }

}
