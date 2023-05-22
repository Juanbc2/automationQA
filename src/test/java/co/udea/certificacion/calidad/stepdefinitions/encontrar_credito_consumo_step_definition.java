package co.udea.certificacion.calidad.stepdefinitions;

import co.udea.certificacion.calidad.questions.ValidarPersonas;
import co.udea.certificacion.calidad.questions.ValidarSimulador;
import co.udea.certificacion.calidad.tasks.OpenThePersonas;
import co.udea.certificacion.calidad.tasks.OpenTheSimulador;
import co.udea.certificacion.calidad.userinterfaces.creditosPage;
import co.udea.certificacion.calidad.userinterfaces.personasPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;


@RunWith(CucumberWithSerenity.class)
public class encontrar_credito_consumo_step_definition {

    @Managed(driver = "edge")
    public WebDriver driver;
    private Actor personaNatural = Actor.named("Juan");

    @Before
    public void preStage() {
        driver.manage().window().maximize();
        personaNatural.can(BrowseTheWeb.with(driver));
    }

    @Given("que me encuentro en la pagina personas de Bancolombia")
    public void queMeEncuentroEnLaPaginaPersonas() {
        personaNatural.can(BrowseTheWeb.with(driver));
    }

    @When("encuentre el modulo de simulador")
    public void encuentreElModuloDeSimulador() {
        personaNatural.attemptsTo(OpenThePersonas.Browser(new personasPage()));
        personaNatural.should(seeThat(ValidarPersonas.paginaCredito(), equalTo(true)));
        personaNatural.attemptsTo(OpenTheSimulador.Simulador(new creditosPage()));
    }

    @Then("verifico que estoy en el simulador")
    public void verificoQueEstoyEnElSimulador() {
        personaNatural.should(seeThat(ValidarSimulador.paginaSimulador(), equalTo(true)));
    }
}

