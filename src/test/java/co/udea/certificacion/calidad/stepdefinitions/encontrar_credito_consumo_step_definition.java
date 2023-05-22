package co.udea.certificacion.calidad.stepdefinitions;

import co.udea.certificacion.calidad.questions.ValidarSimulador;
import co.udea.certificacion.calidad.questions.ValidarTasasYTarifas;
import co.udea.certificacion.calidad.tasks.llenarFormulario;
import co.udea.certificacion.calidad.tasks.AbrirSimulacion;
import co.udea.certificacion.calidad.userinterfaces.personasPage;
import co.udea.certificacion.calidad.userinterfaces.simuladorPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
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
        personaNatural.attemptsTo(AbrirSimulacion.Browser(new personasPage()));

    }

    @Then("verifico que estoy en el simulador")
    public void verificoQueEstoyEnElSimulador() {
        personaNatural.should(seeThat(ValidarSimulador.paginaSimulador(), equalTo(true)));

    }
    @When("ingrese satisfactoriamente los campos del formulario")
    public void relleneElFormulario(){
        personaNatural.attemptsTo(llenarFormulario.Simulacion(new simuladorPage()));
    }

    @Then("puedo ver las tasas y tarifas del credito")
    public void leDoyAlBotonSiDeCuantoDineroNecesito(){
        personaNatural.should(seeThat(ValidarTasasYTarifas.paginaResultados(),equalTo(true)));
    }

}

