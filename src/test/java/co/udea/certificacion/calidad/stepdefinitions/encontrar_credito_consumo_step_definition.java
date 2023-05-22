package co.udea.certificacion.calidad.stepdefinitions;

import co.udea.certificacion.calidad.questions.ValidarPersonas;
import co.udea.certificacion.calidad.tasks.OpenThe;
import co.udea.certificacion.calidad.userinterfaces.UsuarioPage;
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
    public void preStage(){
        driver.manage().window().maximize();
        personaNatural.can(BrowseTheWeb.with(driver));
    }

    @Given("que me encuentro en la pagina personas de Bancolombia")
    public void queMeEncuentroEnLaPaginaPersonas() {
        personaNatural.can(BrowseTheWeb.with(driver));
    }
    @When("explore la pagina personas")
    public void exploreLaPaginaPersonas() {
        personaNatural.attemptsTo(OpenThe.Browser(new UsuarioPage()));

    }
    @Then("puedo ver el boton saber mas para Creditos")
    public void puedoVerBotonCreditos() {
        personaNatural.should(seeThat(ValidarPersonas.paginaCredito(),equalTo(true)));
    }
}

