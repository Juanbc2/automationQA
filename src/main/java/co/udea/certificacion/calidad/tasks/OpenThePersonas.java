package co.udea.certificacion.calidad.tasks;

import co.udea.certificacion.calidad.interactions.saberMasButton;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenThePersonas implements Task {

    private PageObject page;

    public OpenThePersonas(PageObject page){
        this.page = page;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //interactions
        actor.attemptsTo(Open.browserOn(page));
        actor.attemptsTo(saberMasButton.presionarSaberMas());

    }


    public static OpenThePersonas Browser(PageObject page){
        return Tasks.instrumented(OpenThePersonas.class,page);
    }
}
