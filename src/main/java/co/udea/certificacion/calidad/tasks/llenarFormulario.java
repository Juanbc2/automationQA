package co.udea.certificacion.calidad.tasks;

import co.udea.certificacion.calidad.interactions.rellenarFormulario;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.udea.certificacion.calidad.userinterfaces.simuladorPage.BOTONSIMULADOR;

public class llenarFormulario implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(rellenarFormulario.escribirCampos());
        actor.attemptsTo(Click.on(BOTONSIMULADOR));
    }

    public static llenarFormulario Simulacion(PageObject page){
        return Tasks.instrumented(llenarFormulario.class,page);
    }
}
