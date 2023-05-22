package co.udea.certificacion.calidad.tasks;

import co.udea.certificacion.calidad.interactions.saberMasButton;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenThe implements Task {

    private PageObject page;

    public OpenThe(PageObject page){
        this.page = page;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //interactions
        actor.attemptsTo(Open.browserOn(page));
        actor.attemptsTo(saberMasButton.presionarSaberMas());
    }


    public static OpenThe Browser(PageObject page){
        return Tasks.instrumented(OpenThe.class,page);
    }
}
