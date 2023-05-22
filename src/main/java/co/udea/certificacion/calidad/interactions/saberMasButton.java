package co.udea.certificacion.calidad.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnBy;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.udea.certificacion.calidad.userinterfaces.UsuarioPage.BOTONSABERMAS;
import static co.udea.certificacion.calidad.userinterfaces.UsuarioPage.CERRARMODAL;

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
