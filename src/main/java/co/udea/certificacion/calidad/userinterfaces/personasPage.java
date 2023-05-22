package co.udea.certificacion.calidad.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class personasPage extends PageObject {
    public static final Target CERRARMODAL = Target.the("boton cerrar modal").located(By.id("closeModalBtn"));
    public static final Target BOTONSABERMAS = Target.the("Boton saber mas").locatedBy("/html/body/div[2]/div[2]/div/div[2]/div/div[7]/section/div[3]/section/div/div[2]/div[1]/div/div[2]/span");
    public static final Target TEXTOCREDITO = Target.the("Texto de credito de consumo").located(By.className("wcmbc-hero-medium"));

}
