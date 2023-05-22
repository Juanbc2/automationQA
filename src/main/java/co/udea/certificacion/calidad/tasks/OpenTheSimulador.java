package co.udea.certificacion.calidad.tasks;

import co.udea.certificacion.calidad.interactions.simularButton;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class OpenTheSimulador implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(simularButton.presionarSimular());
    }

    public static OpenTheSimulador Simulador(PageObject page){
        return Tasks.instrumented(OpenTheSimulador.class,page);
    }
}
